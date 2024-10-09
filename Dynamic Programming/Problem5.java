/**
	P5: Unique Paths
	
	Example 1:
	Input: m = 3, n = 7
	Output: 28
	
	Example 2:
	Input: m = 3, n = 2
	Output: 3
	Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
	1. Right -> Down -> Down
	2. Down -> Down -> Right
	3. Down -> Right -> Down
	
*/
import java.util.*;
import java.io.*;
class Problem5{
	
	public int uniquePaths(int m, int n) {
        /*if(m == 1 && n == 1)return 1;
        if(m<1 || n<1)return 0;
        return uniquePaths(m-1,n)+uniquePaths(m, n-1);*/
        int dp[][] = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0; j<n;j++){
                if(i == 0 && j==0)dp[i][j]= 1;
                else{
                    if(i>0 && j>0)
                        dp[i][j]= dp[i-1][j] + dp[i][j-1]; 
                    else if(i>0)dp[i][j] = dp[i-1][j];
                    else dp[i][j] = dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
	
	public static void main(String args[])throws Exception{
		Problem5 obj = new Problem5();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			int m = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			System.out.println(obj.uniquePaths(m,n));
		}
	}
}

/*

>javac Problem5.java
>java Problem5
>2
>3
>7
28
>3
>2
3

*/