/**

	P26: Longest Increasing Subsequence
	
	Example 1:
	Input: nums = [10,9,2,5,3,7,101,18]
	Output: 4
	Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
	
	Example 2:
	Input: nums = [0,1,0,3,2,3]
	Output: 4
	
	Example 3:

	Input: nums = [7,7,7,7,7,7,7]
	Output: 1

*/

import java.io.*;
import java.util.*;
class Problem26{
	
	public int getLength(int[] nums, int ind, int prev, int[][] dp){
        if(ind >= nums.length) 
            return 0;
        if(dp[ind][prev+1] != -1){
            return dp[ind][prev+1];
        }
        int notTake = 0,take = 0;
        notTake =  getLength(nums, ind+1, prev,dp);
        if(prev == -1 || nums[ind]>nums[prev]){
            take = 1 + getLength(nums, ind+1, ind,dp);
        }
        return dp[ind][prev+1] = Math.max(notTake,take);
    }
    public int lengthOfLIS(int[] nums) {
        int size = nums.length;
        /*int dp[][] = new int[size][size+1];
        for(int i = 0; i<size; i++)
            Arrays.fill(dp[i],-1);

        return (getLength(nums, 0, -1,dp));*/
        int dp[] = new int[size];
        int maxVal = 1;
        Arrays.fill(dp,1);
        for(int i = 0; i < size-1; i++){
            for(int j = i+1; j < size ; j++){
                if(nums[j] > nums[i]){
                    dp[j] = Math.max(dp[i]+1, dp[j]);
                }
                //maxVal = Math.max(dp[j],maxVal);
            }
        }
        for(int i=0;i<size;i++){
            if(dp[i]>maxVal) 
                maxVal = dp[i];
        }
        return maxVal;

    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem26 obj = new Problem26();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int prices[] = new int[line.length];
			for(int i = 0; i < line.length ; i++)
				prices[i] = Integer.parseInt(line[i]);
			System.out.println(obj.lengthOfLIS(prices));
		}
	}
}

/*

>javac Problem26.java
>java Problem26
>3
>10 9 2 5 7 101 18
4
>0 1 0 3 2 3
4
>7 7 7 7 7 7 7
1

*/