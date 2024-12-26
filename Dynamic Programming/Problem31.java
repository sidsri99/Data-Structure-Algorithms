/**

	P31 : Target Sum
	
	Example 1:
	Input: nums = [1,1,1,1,1], target = 3
	Output: 5
	Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
	-1 + 1 + 1 + 1 + 1 = 3
	+1 - 1 + 1 + 1 + 1 = 3
	+1 + 1 - 1 + 1 + 1 = 3
	+1 + 1 + 1 - 1 + 1 = 3
	+1 + 1 + 1 + 1 - 1 = 3
	
	Example 2:
	Input: nums = [1], target = 1
	Output: 1

*/

import java.io.*;
import java.util.*;
class Problem31{
	
	public int getSum(int[] nums, int target, int ind, int sum, int count){
        if(ind == -1){
            if(sum == target){
                return count+1;
            }else{
                return count;
            }
        }
        //sum = sum + nums[ind];
        count = getSum(nums,target,ind-1,sum+nums[ind],count);
        //sum = sum - 2 * nums[ind];
        count = getSum(nums,target,ind-1,sum-nums[ind],count);
        return count;
    }
    public int findTargetSumWays(int[] nums, int target) {
        //return getSum(nums, target,nums.length-1,0,0);
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,1);
        for(int i : nums){
            HashMap<Integer,Integer> dp=new HashMap<Integer,Integer>();
            for(int j : hm.keySet()){
                int count = hm.get(j);
                dp.put(j+i, dp.getOrDefault(i+j,0)+count);
                dp.put(j-i, dp.getOrDefault(j-i,0)+count);
            }
            hm = dp; 
        }
        return hm.getOrDefault(target,0);
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem31 obj = new Problem31();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			int target = Integer.parseInt(br.readLine());
			for(int i = 0; i < line.length ; i++)
				nums[i] = Integer.parseInt(line[i]);
			System.out.println(obj.findTargetSumWays(nums,target));
		}
	}
}

/*

>javac Problem31.java
>java Problem31
>3
>1 1 1 1 1
>5
1
>1
>1
1
>0 0 0 0 0 0 0 0 1
>1
256

*/