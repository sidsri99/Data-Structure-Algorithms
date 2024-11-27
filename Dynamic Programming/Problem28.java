/**

	P27: Jump Game II
	
	Example 1:
	Input: nums = [2,3,1,1,4]
	Output: 2
	Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
	
	Example 2:
	Input: nums = [2,3,0,1,4]
	Output: 2

*/

import java.io.*;
import java.util.*;
class Problem28{
	
	public int jump(int[] nums) {
        int minJump = (int)Math.pow(10,9)/2;
        int dp[]=new int[nums.length];
        Arrays.fill(dp,minJump);
        dp[0] = 0;
        for(int i = 0; i< nums.length; i++){
            for(int j = 1; j<=nums[i];j++){
                if(i+j>nums.length-1)break;
                dp[i+j] = Math.min(dp[i+j],1+dp[i]);
                if(i+j == nums.length-1)return dp[i+j];
            }
        }
        return 0;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem28 obj = new Problem28();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			for(int i = 0; i < line.length ; i++)
				nums[i] = Integer.parseInt(line[i]);
			System.out.println(obj.jump(nums));
		}
	}
}

/*

>javac Problem28.java
>java Problem28
>4
>2 3 1 1 4
2
>2 3 0 1 4
2
>5 6 4 4 6 9 4 4 7 4 4 8 2 6 8 1 5 9 6 5 2 7 9 7 9 6 9 4 1 6 8 8 4 4 2 0 3 8 5
5
>0
0

*/