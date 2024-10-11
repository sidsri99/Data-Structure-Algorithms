/**
	P6: Unique Paths II
	
	Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
	Output: 2
	
*/
import java.util.*;
import java.io.*;
class Problem6{
	
	public int Paths(int[][] obstacleGrid, int[][] dp, int m, int n){
        if(m < 0 || n < 0) return 0;
        if(obstacleGrid[m][n] == 1) return dp[m][n]=0;
        if(m == 0 && n == 0)return dp[0][0] = 1;
        if(dp[m][n] != -1)return dp[m][n];
        return dp[m][n]=Paths(obstacleGrid, dp, m-1, n) + Paths(obstacleGrid, dp, m, n-1);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return Paths(obstacleGrid, dp,m-1,n-1);
    }
	
	public static void main(String args[])throws Exception{
		Problem6 obj = new Problem6();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			int m = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int obstacleGrid[][]= new int[m][n];
			for(int i = 0; i<m; i++){
				String line[] = br.readLine().split(" ");
				for(int j=0; j<line.length; j++){
					obstacleGrid[i][j] = Integer.parseInt(line[j]);
				}
			}
			System.out.println(obj.uniquePathsWithObstacles(obstacleGrid));
		}
	}
}

/*

>javac Problem6.java

>java Problem6
>2
>3
>3
>0 0 0
>0 1 0
>0 0 0
2
>2
>2
>0 1
>0 0
1

*/