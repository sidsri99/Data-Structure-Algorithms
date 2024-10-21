/**
	P10: Partition Equal Subset Sum
	
	Example 1:
	Input: nums = [1,5,11,5]
	Output: true

	Example 2:
	Input: nums = [1,2,3,5]
	Output: false
	
*/

import java.util.*;
import java.io.*;
class Problem10{
	public int isExist(int[] nums, int pos, int target,int[][] dp){
        if(target == 0)return 1;
        if(pos == 0){
            if(nums[pos] == target)return 1;
            else return 0;
        }
        if(dp[pos][target] != -1)return dp[pos][target];
        else{
            int notTake = isExist(nums, pos-1, target, dp);
            int take = 0;
            if(target-nums[pos] >= 0){
                take = isExist(nums, pos-1, target - nums[pos], dp);
            }
            return dp[pos][target] = take | notTake;
        }

    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length;i++){
            sum += nums[i];
        }
        if(sum % 2 != 0)return false;
        else{
            int dp[][] =new int[nums.length][sum+1];
            for(int i =0; i < nums.length;i++){
                Arrays.fill(dp[i],-1);
            }
            sum /= 2;
            if(isExist(nums, nums.length-1,sum, dp) == 1)return true;
            else return false;
        }
    }
	
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem10 obj = new Problem10();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int arr[]= new int[line.length];
			for(int i = 0; i< line.length; i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			System.out.println(obj.canPartition(arr));
		}
	}
}

/*

>javac Problem10.java
>java Problem10
>2
>1 5 11 5
true
>1 2 3 5
false

*/