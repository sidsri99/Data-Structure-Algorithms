/**
	P8: Minimum Falling Path Sum
	
	Example 1:
	Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
	Output: 13

	Example 2:
	Input: matrix = [[-19,57],[-40,-5]]
	Output: -59
	
*/
import java.util.*;
import java.io.*;
class Problem8{
	
	public int minSum(int[][] matrix, int row, int column, int[][] dp){
        if(column <0 || column >=matrix[0].length)return Integer.MAX_VALUE;
        if(row == 0){
            int sum = matrix[row][column];
            if( column-1 >=0 )sum = Math.min(sum,matrix[row][column-1] );
            if( column+1 < matrix[0].length) sum = Math.min(sum, matrix[row][column+1]);
            return dp[0][column]=sum;
        }
        if(dp[row][column] != 1000000)return dp[row][column];
        int minimum = Integer.MAX_VALUE;
        for(int i = column-1; i<= column+1; i++){
            int sum = Integer.MAX_VALUE;
            if(i >=0 && i<matrix[0].length){
                sum = matrix[row][i] + minSum(matrix, row-1, i,dp);
            }
            minimum = Math.min(sum, minimum);
        }
        return dp[row][column] = minimum;
    }
    public int minFallingPathSum(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int dp[][]= new int[row][column];
        for(int i = 0; i<row;i++){
            Arrays.fill(dp[i],1000000);
        }
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < column; i++){
            minimum = Math.min(minimum,minSum(matrix,row-1, i,dp));
        }
        return minimum;
    }
	
	public static void main(String args[])throws Exception{
		Problem8 obj = new Problem8();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			int m = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int matrix[][]= new int[m][n];
			for(int i = 0; i<m; i++){
				String line[] = br.readLine().split(" ");
				for(int j=0; j<line.length; j++){
					matrix[i][j] = Integer.parseInt(line[j]);
				}
			}
			System.out.println(obj.minFallingPathSum(matrix));
		}
	}
}

/*

>javac Problem8.java
>java Problem8
>2
>3
>3
>2 1 3
>6 5 4
>7 8 9
13
>2
>2
>-19 57
>-40 -5
-59

*/