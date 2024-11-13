/**
	
	P18: Distinct Subsequences
	
	Example 1:
	Input: s = "rabbbit", t = "rabbit"
	Output: 3

	Example 2:
	Input: s = "babgbag", t = "bag"
	Output: 5

	
*/

import java.io.*;
import java.util.*;

class Problem18{
    
	public int dscs(String s, String t, int ind1, int ind2, int[][] dp){
        if(ind2 == 0) return 1;
        if(ind1 == 0) return 0;
        if(dp[ind1][ind2] != -1){
            return dp[ind1][ind2];
        }
        if(s.charAt(ind1-1) == t.charAt(ind2-1)){
            dp[ind1][ind2] = dscs(s,t,ind1-1,ind2-1,dp) + dscs(s,t,ind1-1,ind2,dp);
        }
        else{
            dp[ind1][ind2] = dscs(s,t,ind1-1,ind2,dp);
        }
        return dp[ind1][ind2];
    }
    public int numDistinct(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        int dp[][] = new int[len1+1][len2+1];

        for(int i=0; i<=len1;i++){
            for(int j=0; j<=len2;j++)
                dp[i][j] = -1;
        }

        return dscs(s, t, len1, len2, dp);
        
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem18 obj=new Problem18();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String text1 = br.readLine();
			String text2 = br.readLine();
			System.out.println(obj.numDistinct(text1,text2));
		}
	}
}

/*

>javac Problem18.java
>java Problem18
>2
>rabbbit
>rabbit
3
>babgbag
>bag
5

*/