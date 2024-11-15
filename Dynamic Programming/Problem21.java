/**

	P21: Best Time to Buy and Sell Stock II
	
	Example 1:
	Input: prices = [7,1,5,3,6,4]
	Output: 7
	Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
	Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
	Total profit is 4 + 3 = 7.

	Example 2:
	Input: prices = [1,2,3,4,5]
	Output: 4
	Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
	Total profit is 4.

	Example 3:
	Input: prices = [7,6,4,3,1]
	Output: 0
	Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.

*/

import java.io.*;
import java.util.*;
class Problem21{
	public int getProfit(int[] prices, int ind, int buy, int dp[][]){
        if(ind == prices.length)
            return 0;
        if(dp[ind][buy] != -1){
            return dp[ind][buy];
        }
        if(buy == 1){
            return dp[ind][buy]=Math.max(0-prices[ind]+getProfit(prices,ind+1,0,dp),
                                         getProfit(prices,ind+1,1,dp));
        }
        return dp[ind][buy] = Math.max(prices[ind]+getProfit(prices,ind+1,1,dp),
                                        getProfit(prices, ind+1, 0,dp));

    }
    public int maxProfit(int[] prices) {
        /*int len = prices.length;
        int dp[][] = new int[len][2];
        for(int i=0;i<len;i++){
            dp[i][0] = -1;
            dp[i][1] = -1;
        }

        return getProfit(prices,0,1, dp);*/
        int profit = 0, prev = prices[0];
        for(int i = 0; i< prices.length;i++){
            if(prices[i]>prev) profit+=prices[i]-prev;
            prev = prices[i];
        }  
        return profit;     
    }
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem21 obj = new Problem21();
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

>javac Problem21.java
>java Problem21
>3
>7 1 5 3 6 4
7
>1 2 3 4 5
4
>7 6 4 3 1
0

*/