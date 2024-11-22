/**

	P27 : Longest Palindromic Substring
	
	Example 1:
	Input: s = "babad"
	Output: "bab"
	Explanation: "aba" is also a valid answer.
	
	Example 2:
	Input: s = "cbbd"
	Output: "bb"

*/

import java.io.*;
import java.util.*;
class Problem27{
		
	public String longestPalindrome(String s) {
        int dp[][] = new int[s.length()][s.length()];
        String str="";int maxLen = 0;

        for(int i = 0 ; i < dp.length; i++ ){
            for(int j = 0, k = j+i; k < dp.length; k++,j++){
                if( i == 0){
                    dp[j][k] = 1;
                }
                else if(i == 1){
                    if(s.charAt(j) == s.charAt(k)){
                        dp[j][k] = 2;
                    }
                    else{
                        dp[j][k] = 0;
                    }
                }else{
                    if(s.charAt(j) == s.charAt(k) && dp[j+1][k-1]>0){
                        dp[j][k] = dp[j+1][k-1]+1;
                    }
                    else{
                        dp[j][k] = 0;
                    }
                }
                if(dp[j][k]>maxLen){
                    str = s.substring(j, k+1);
                }
            }

        }
        return str;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem27 obj = new Problem27();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line = br.readLine();
			System.out.println(obj.longestPalindrome(line));
		}
	}
}

/*

>javac Problem27.java
>java Problem27
>4
>babad
aba
>cbbd
bb
>abacbdcaba
aba
>ac
c

*/