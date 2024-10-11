/**
	P7: Minimum Path Sum
	
	Example 1:
	Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
	Output: 7

	Example 2:
	Input: grid = [[1,2,3],[4,5,6]]
	Output: 12
	
*/
import java.util.*;
import java.io.*;
class Problem7{
	
	public int Paths(int[][] grid, int[][]dp,int m,int n){
        if(m < 0 || n < 0) return (int)Math.pow(10,9);
        if(m == 0 && n == 0)return dp[0][0] = grid[m][n];
        if(dp[m][n] != -1)return dp[m][n];
        return dp[m][n]=grid[m][n]+(Math.min(Paths(grid, dp, m-1, n), Paths(grid, dp, m, n-1)));
    }    
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return Paths(grid, dp,m-1,n-1);
    }
	
	public static void main(String args[])throws Exception{
		Problem7 obj = new Problem7();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			int m = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int grid[][]= new int[m][n];
			for(int i = 0; i<m; i++){
				String line[] = br.readLine().split(" ");
				for(int j=0; j<line.length; j++){
					grid[i][j] = Integer.parseInt(line[j]);
				}
			}
			System.out.println(obj.minPathSum(grid));
		}
	}
}

/*

>javac Problem7.java
>java Problem7
>2
>3
>3
>1 3 1
>1 5 1
>4 2 1
7
>2
>3
>1 2 3
>4 5 6
12

*/