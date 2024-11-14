/**
	
	P19: Edit Distance | Dp on String

	Example 1:
	Input: word1 = "horse", word2 = "ros"
	Output: 3
	Explanation: 
	horse -> rorse (replace 'h' with 'r')
	rorse -> rose (remove 'r')
	rose -> ros (remove 'e')

	Example 2:
	Input: word1 = "intention", word2 = "execution"
	Output: 5
	Explanation: 
	intention -> inention (remove 't')
	inention -> enention (replace 'i' with 'e')
	enention -> exention (replace 'n' with 'x')
	exention -> exection (replace 'n' with 'c')
	exection -> execution (insert 'u')
	
*/

import java.io.*;
import java.util.*;

class Problem19{
    
	public int minOp(String s, String t, int ind1, int ind2, int[][] dp){
        if(ind1 == 0)return ind2;
        if(ind2 == 0)return ind1;
        if(dp[ind1][ind2] != -1)
            return dp[ind1][ind2];
        if(s.charAt(ind1-1) == t.charAt(ind2-1)){
            return dp[ind1][ind2] = minOp(s,t, ind1-1,ind2-1,dp);
        }else{
            return dp[ind1][ind2] = 1+Math.min(minOp(s,t,ind1-1,ind2,dp),
                                      Math.min(minOp(s,t,ind1,ind2-1,dp),
                                               minOp(s,t,ind1-1,ind2-1,dp)));
        }
    }
    public int minDistance(String word1, String word2) {

        int len1 = word1.length();
        int len2 = word2.length();
        int dp[][] = new int[len1+1][len2+1];

        for(int i = 0 ; i <= len1 ; i++){
            for(int j = 0 ; j <= len2 ; j++){
                dp[i][j] = -1;
            }
        }

        return minOp(word1, word2, len1, len2, dp);
        
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem19 obj=new Problem19();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String text1 = br.readLine();
			String text2 = br.readLine();
			System.out.println(obj.minDistance(text1,text2));
		}
	}
}

/*

>javac Problem19.java
>java Problem19
>2
>horse
>ros
3
>intention
>execution
5

*/