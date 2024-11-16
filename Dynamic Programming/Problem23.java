/**

	P23: Best Time to Buy and Sell Stock IV
	
	Example 1:
	Input: k = 2, prices = [2,4,1]
	Output: 2
	Explanation: Buy on day 1 (price = 2) and sell on day 2 (price = 4), profit = 4-2 = 2.
	
	Example 2:
	Input: k = 2, prices = [3,2,6,5,0,3]
	Output: 7
	Explanation: Buy on day 2 (price = 2) and sell on day 3 (price = 6), profit = 6-2 = 4. Then buy on day 5 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.

*/

import java.io.*;
import java.util.*;
class Problem23{
	public int getProfit(int[] prices, int ind, int count,int k, int[][] dp){
        if(count == k)
            return 0;
        if(ind == prices.length)
            return 0;
        if(dp[ind][count] != -1)
            return dp[ind][count];
        if(count%2 == 0){
            return dp[ind][count] = Math.max(
                getProfit(prices,ind+1,count+1,k,dp)-prices[ind],
                getProfit(prices,ind+1,count,k,dp)
            );
        }
        return dp[ind][count] = Math.max(
            getProfit(prices,ind+1,count+1,k,dp)+prices[ind],
            getProfit(prices,ind+1,count,k,dp)
        );
    }
    public int maxProfit(int k, int[] prices) {
        int size = prices.length;
        int dp[][] = new int[size][k<<1];

        for(int i = 0 ; i < size ; i++){
            Arrays.fill(dp[i],-1);
        }

        return getProfit(prices, 0, 0 ,k<<1, dp);
        
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem23 obj = new Problem23();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			int k = Integer.parseInt(br.readLine());
			String line[] = br.readLine().split(" ");
			int prices[] = new int[line.length];
			for(int i = 0; i < line.length ; i++)
				prices[i] = Integer.parseInt(line[i]);
			System.out.println(obj.maxProfit(k,prices));
		}
	}
}

/*

>javac Problem23.java
>java Problem23
>2
>2
>2 4 1
2
>2
>3 2 6 5 0 3
7

*/