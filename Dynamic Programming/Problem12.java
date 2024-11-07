/**
	P12: Longest Common Subsequence
	
	Example 1:
	Input: text1 = "abcde", text2 = "ace" 
	Output: 3  
	Explanation: The longest common subsequence is "ace" and its length is 3.

	Example 2:
	Input: text1 = "abc", text2 = "abc"
	Output: 3
	Explanation: The longest common subsequence is "abc" and its length is 3.
	
	Example 3:
	Input: text1 = "abc", text2 = "def"
	Output: 0
	Explanation: There is no such common subsequence, so the result is 0.
	
*/

import java.io.*;
import java.util.*;

class Problem12{
    
	public int maxSeq(String text1, String text2, int ind1, int ind2, int[][] dp){
        if(ind1<0 || ind2<0)return 0;
        if(dp[ind1][ind2] != -1)return dp[ind1][ind2];
        if(text1.charAt(ind1) == text2.charAt(ind2)){
            return dp[ind1][ind2] = (1+ maxSeq(text1, text2, ind1-1, ind2-1,dp));
        }
        else{
            return dp[ind1][ind2] = Math.max(maxSeq(text1, text2, ind1-1, ind2,dp),
                            maxSeq(text1, text2, ind1, ind2-1,dp));
        }
    }

    public int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        //int[][] dp=new int[len1][len2]; Memoization
        int[][] dp=new int[len1+1][len2+1]; //Tabulation


        //Memoization
        /*for(int i=0;i<len1;i++){
            Arrays.fill(dp[i],-1);
        }*/

        //return maxSeq(text1,text2,len1-1,len2-1,dp);        

        //Tabulation
        for(int i = 1; i<=len1;i++){
            for(int j = 1; j<=len2;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = (1+ dp[i-1][j-1]);
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[len1][len2];
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem12 obj=new Problem12();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String text1 = br.readLine();
			String text2 = br.readLine();
			System.out.println(obj.longestCommonSubsequence(text1,text2));
		}
	}
}

/*

>javac Problem12.java
>java Problem12
>3
>abcde
>ace
3
>abc
>abc
3
>abc
>def
0

*/