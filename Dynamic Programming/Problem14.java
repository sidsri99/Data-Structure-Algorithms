/**
	P14: Longest Palindromic Subsequence
	
	Example 1:
	Input: s = "bbbab"
	Output: 4
	Explanation: One possible longest palindromic subsequence is "bbbb".

	Example 2:
	Input: s = "cbbd"
	Output: 2
	Explanation: One possible longest palindromic subsequence is "bb".
	
*/

import java.io.*;
import java.util.*;

class Problem14{
    
	public int longestPalindromeSubseq(String s) {
        String rev ="";
        int len = s.length();
        for(int i = 0;i<len;i++){
            rev = s.charAt(i) + rev; 
        }
        int dp[][] = new int[len+1][len+1]; 
        for(int i = 1; i<=len ; i++){
            for(int j = 1; j<=len ; j++){
                if(s.charAt(i-1)  == rev.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            } 
        }
        return dp[len][len];
        
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem14 obj=new Problem14();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String text = br.readLine();
			System.out.println(obj.longestPalindromeSubseq(text));
		}
	}
}

/*

>javac Problem14.java
>java Problem14
>2
>bbbab
4
>cbbd
2

*/