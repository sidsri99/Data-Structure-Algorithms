/**
	
	P20: Wilcard Matching
	
	Example 1:
	Input: s = "aa", p = "a"
	Output: false
	Explanation: "a" does not match the entire string "aa".

	Example 2:
	Input: s = "aa", p = "*"
	Output: true
	Explanation: '*' matches any sequence.
	
	Example 3:
	Input: s = "cb", p = "?a"
	Output: false
	Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
	
*/

import java.io.*;
import java.util.*;

class Problem20{
    
	public int match(String s, String p, int ind1, int ind2, int[][] dp){
        if(ind1 == 0 && ind2 == 0)
            return 1;
        if(ind1 == 0 && ind2 > 0){
            for(int i = 1; i <= ind2 ; i++ ){
                if(p.charAt(i-1) != '*')
                    return 0;
            }
            return 1;
        }
        if(ind2 == 0 && ind1 > 0)
            return 0;

        if(dp[ind1][ind2] != -1)
            return dp[ind1][ind2];
        if(s.charAt(ind1-1) == p.charAt(ind2-1) || p.charAt(ind2-1) == '?'){
            return dp[ind1][ind2] = match(s,p,ind1-1,ind2-1,dp);
        }else if(p.charAt(ind2-1) == '*'){
            return dp[ind1][ind2] = match(s,p, ind1-1,ind2,dp) | match(s,p,ind1,ind2-1,dp);
        }    
        return dp[ind1][ind2]=0;
    }
    public boolean isMatch(String s, String p) {
        int len1 = s.length();
        int len2 = p.length();

        int dp[][]=new int[len1+1][len2+1];
        for(int i=0;i<=len1;i++)
            Arrays.fill(dp[i],-1);

        if (match(s,p, len1, len2, dp) == 1) return true;
        return false;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem20 obj=new Problem20();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String text1 = br.readLine();
			String text2 = br.readLine();
			System.out.println(obj.isMatch(text1,text2));
		}
	}
}

/*

>javac Problem20.java
>java Problem20
>3
>aa
>a
false
>aa
>*
true
>cb
>?a
false

*/