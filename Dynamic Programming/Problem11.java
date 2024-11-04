/**
	P11: Coin Change
	
	Example 1:
	Input: coins = [1,2,5], amount = 11
	Output: 3
	Explanation: 11 = 5 + 5 + 1

	Example 2:
	Input: coins = [2], amount = 3
	Output: -1

	Example 3:
	Input: coins = [1], amount = 0
	Output: 0
	
*/

import java.util.*;
import java.io.*;
class Problem11{
	
	public int minCoin(int[] coins, int target, int index, int[][] dp){
        //if(target == 0)return 0;
        if(index == 0){
            if(target % coins[0] == 0)return target/coins[0];
            else return 100000000;
        }
        if(dp[index][target] != -1){
            return dp[index][target];
        }
        int notTake = minCoin(coins, target, index-1,dp);
        int take = 100000000;
        if(target >= coins[index]){
            take = 1+ minCoin(coins,target-coins[index],index,dp);
        }
        return dp[index][target]=Math.min(notTake,take);
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int i =0; i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        
        int min =  minCoin(coins, amount, coins.length-1, dp);
        if(min >= 100000000)return -1;
        return min;
    }
	
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem11 obj = new Problem11();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int arr[]= new int[line.length];
			for(int i = 0; i< line.length; i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			int sum = Integer.parseInt(br.readLine());
			System.out.println(obj.coinChange(arr,sum));
		}
	}
}

/*

>javac Problem11.java
>java Problem11
>3
>1 2 5
>11
3
>2
>3
-1
>1
>0
0

*/