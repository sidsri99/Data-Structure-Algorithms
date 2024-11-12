/**
	P15 : Minimum Insertion Steps to Make a String Palindrome
	
	Example 1:
	Input: s = "zzazz"
	Output: 0
	Explanation: The string "zzazz" is already palindrome we do not need any insertions.
	
	Example 2:
	Input: s = "mbadm"
	Output: 2
	Explanation: String can be "mbdadbm" or "mdbabdm".
	
	Example 3:
	Input: s = "leetcode"
	Output: 5
	Explanation: Inserting 5 characters the string becomes "leetcodocteel".
	
*/

import java.io.*;
import java.util.*;

class Problem15{
    
	public int minInsertions(String s) {
        String rev = "";
        int size = s.length();
        for(int i = 0 ; i <size; i++){
            rev = s.charAt(i) + rev;
        }
        int dp[][] = new int[size+1][size+1];

        for(int i = 1 ; i <= size ; i++){
            for(int j = 1 ; j <= size ; j++){
                if(s.charAt(i-1) == rev.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        return size - dp[size][size];
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem15 obj=new Problem15();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String text = br.readLine();
			System.out.println(obj.minInsertions(text));
		}
	}
}

/*

>javac Problem15.java
>java Problem15
>3
>zzazz
0
>mbadm
2
>leetcode
5

*/