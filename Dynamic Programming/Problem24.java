/**

	P24: Best Time to Buy and Sell Stock with Cooldown
	
	Example 1:
	Input: prices = [1,2,3,0,2]
	Output: 3
	Explanation: transactions = [buy, sell, cooldown, buy, sell]
	
	Example 2:
	Input: prices = [1]
	Output: 0

*/

import java.io.*;
import java.util.*;
class Problem24{
	
	public int getProfit(int[] prices, int ind, int buy, int[][] dp){
        if(ind >= prices.length)
            return 0;
        if(dp[ind][buy] != -1)
            return dp[ind][buy];
        if(buy == 1){
            return dp[ind][buy] = Math.max(
                getProfit(prices, ind+1,0,dp)-prices[ind],
                getProfit(prices, ind+1,1,dp)
            );
        }
        return dp[ind][buy] = Math.max(
            getProfit(prices, ind+2,1,dp)+prices[ind],
            getProfit(prices, ind+1,0,dp)
        );
    }
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2];

        for(int i=0; i<prices.length;i++){
            dp[i][0]=dp[i][1]=-1;
        }

        return getProfit(prices, 0,1,dp);
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem24 obj = new Problem24();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int prices[] = new int[line.length];
			for(int i = 0; i < line.length ; i++)
				prices[i] = Integer.parseInt(line[i]);
			System.out.println(obj.maxProfit(prices));
		}
	}
}

/*

>javac Problem24.java
>java Problem24
>2
>1 2 3 0 2
3
>1
0

*/