/**
	P16: Delete Operation for Two Strings
	
	Example 1:
	Input: word1 = "sea", word2 = "eat"
	Output: 2
	Explanation: You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
	
	Example 2:
	Input: word1 = "leetcode", word2 = "etco"
	Output: 4
	
*/

import java.io.*;
import java.util.*;

class Problem16{
    
	public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        int dp[][] = new int[len1+1][len2+1];

        for(int i = 1; i <= len1; i++){
            for(int j = 1; j <= len2; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return len1-dp[len1][len2] + len2 - dp[len1][len2];
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem16 obj=new Problem16();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String text1 = br.readLine();
			String text2 = br.readLine();
			System.out.println(obj.minDistance(text1,text2));
		}
	}
}

/*

>javac Problem16.java
>java Problem16
>2
>sea
>eat
2
>leetcode
>etco
4

*/