/**

	P22: Best Time to Buy and Sell Stock III
	
	Example 1:
	Input: prices = [3,3,5,0,0,3,1,4]
	Output: 6
	Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
	Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
	
	Example 2:
	Input: prices = [1,2,3,4,5]
	Output: 4
	Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
	Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.

	Example 3:
	Input: prices = [7,6,4,3,1]
	Output: 0
	Explanation: In this case, no transaction is done, i.e. max profit = 0.

*/

import java.io.*;
import java.util.*;
class Problem22{
	public int getProfit(int[] prices, int ind, int count, int[][] dp){
        if(ind == prices.length)
            return 0;
        if(count == 4)
            return 0;
        if(dp[ind][count] != -1)
            return dp[ind][count];
        if(count%2 == 0){
            return dp[ind][count] = Math.max(
                getProfit(prices,ind+1,count+1,dp)-prices[ind],
                getProfit(prices,ind+1,count,dp)
            );
        }
        return dp[ind][count] = Math.max(
                getProfit(prices,ind+1,count+1,dp)+prices[ind],
                getProfit(prices,ind+1,count,dp)
            );
    }
    public int maxProfit(int[] prices) {
        int dp[][] = new int[prices.length][2<<1];
        for(int  i=0; i<prices.length; i++){
            dp[i][0]=dp[i][1]=dp[i][2]=dp[i][3]=-1;
        }
        return getProfit(prices,0,0,dp);
    }
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem22 obj = new Problem22();
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

>javac Problem22.java
>java Problem22
>3
>3 3 5 0 0 3 1 4
6
>1 2 3 4 5
4
>7 6 4 3 1
0

*/