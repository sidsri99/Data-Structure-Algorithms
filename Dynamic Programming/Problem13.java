/**
	P13: Longest Common Substring
	
	Example 1:
	Input: s1 = "ABCDGH", s2 = "ACDGHR"
	Output: 4
	Explanation: The longest common substring is "CDGH" with a length of 4.

	Example 2:
	Input: s1 = "abc", s2 = "acb"
	Output: 1
	Explanation: The longest common substrings are "a", "b", "c" all having length 1.
	
	Example 3:
	Input: s1 = "YZ", s2 = "yz"
	Output: 0
	
*/

import java.io.*;
import java.util.*;

class Problem13{
    
	public int longestCommonSubstr(String s1, String s2) {
        // code here
        int count = 0;
        int len1 = s1.length(), len2=s2.length();
        int dp[][] = new int[len1+1][len2+1];
        
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    count = Math.max(count, dp[i][j]);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return count;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem13 obj=new Problem13();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String text1 = br.readLine();
			String text2 = br.readLine();
			System.out.println(obj.longestCommonSubstr(text1,text2));
		}
	}
}

/*

>javac Problem13.java
>java Problem13
>3
>ABCDGH
>ACDGHR
4
>abc
>acb
1
>YZ
>yz
0

*/