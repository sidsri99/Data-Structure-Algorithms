/**

	P25: Best Time to Buy and Sell Stock with Transaction Fee
	
	Example 1:
	Input: prices = [1,3,2,8,4,9], fee = 2
	Output: 8
	Explanation: The maximum profit can be achieved by:
		- Buying at prices[0] = 1
		- Selling at prices[3] = 8
		- Buying at prices[4] = 4
		- Selling at prices[5] = 9
	The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.

	Example 2:
	Input: prices = [1,3,7,5,10,3], fee = 3
	Output: 6

*/

import java.io.*;
import java.util.*;
class Problem25{
	
	public int getProfit(int[] prices, int ind, int buy, int fee, int[][] dp){
        if(ind == prices.length)
            return 0;
        if(dp[ind][buy] != -1)
            return dp[ind][buy];
        if(buy == 1){
            return dp[ind][buy] = Math.max(
                getProfit(prices, ind+1, 0, fee, dp)-prices[ind],
                getProfit(prices, ind+1, 1, fee, dp)
            );
        }
        return dp[ind][buy] = Math.max(
            getProfit(prices, ind+1, 1, fee, dp)+prices[ind]-fee,
            getProfit(prices, ind+1, 0, fee, dp)
        );
    }
    public int maxProfit(int[] prices, int fee) {
        int dp[][] = new int[prices.length][2];
        for(int i = 0; i < prices.length ; i++){
            dp[i][0]=dp[i][1]=-1;
        }
        return getProfit(prices,0,1,fee,dp);
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem25 obj = new Problem25();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int fee = Integer.parseInt(br.readLine());
			int prices[] = new int[line.length];
			for(int i = 0; i < line.length ; i++)
				prices[i] = Integer.parseInt(line[i]);
			System.out.println(obj.maxProfit(prices,fee));
		}
	}
}

/*

>javac Problem25.java
>java Problem25
>2
>1 3 2 8 4 9
>2
8
>1 3 7 5 10 3
>3
6

*/