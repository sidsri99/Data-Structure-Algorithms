/**
	P17: Shortest Common Supersequence
	
	Example 1:
	Input: str1 = "abac", str2 = "cab"
	Output: "cabac"
	Explanation: 
	str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
	str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
	The answer provided is the shortest such string that satisfies these properties.
	
	Example 2:
	Input: str1 = "aaaaaaaa", str2 = "aaaaaaaa"
	Output: "aaaaaaaa"
	
*/

import java.io.*;
import java.util.*;

class Problem17{
    
	public String shortestCommonSupersequence(String str1, String str2) {
        String scs = "";
        int len1 = str1.length(), len2 = str2.length();
        int dp[][] = new int[len1+1][len2+1];

        for(int i = 1; i <= len1; i++){
            for(int j = 1; j <= len2; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        int i = len1, j = len2;
        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                scs = str1.charAt(i-1) + scs;
                i--;
                j--;
            }else if(dp[i-1][j] > dp[i][j-1]){
                scs = str1.charAt(i-1) + scs;
                i--;
            }else{
                scs = str2.charAt(j-1) + scs;
                j--;
            }
        }
        while(i>0){
            scs = str1.charAt(i-1) + scs;
            i--;
        }
        while(j>0){
            scs = str2.charAt(j-1) + scs;
            j--;
        }
        return scs;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem17 obj=new Problem17();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String text1 = br.readLine();
			String text2 = br.readLine();
			System.out.println(obj.shortestCommonSupersequence(text1,text2));
		}
	}
}

/*

>javac Problem17.java
>java Problem17
>2
>abac
>cab
cabac
>aaaaaaaa
>aaaaaaaa
aaaaaaaa

*/