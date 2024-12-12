/**

	P29: Jump Game
	
	Example 1:
	Input: nums = [2,3,1,1,4]
	Output: true
	Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
	
	Example 2:
	Input: nums = [3,2,1,0,4]
	Output: false
	Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

*/

import java.io.*;
import java.util.*;
class Problem29{
	
	/*public boolean getJump(int[] nums, int ind){
        if(ind >= nums.length-1){
            return true;
        }
        boolean flag = false;
        for(int i = 1; i <= nums[ind]; i++){
            flag = flag || getJump(nums, ind+i);
            if(flag == true)return true;
        }
        return false;
    }*/
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(i>max)return false;
            max = Math.max(max, i+nums[i]);
            if(max >= nums.length-1)return true;
        }
        if(max >= nums.length-1)return true;
        return false;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem29 obj = new Problem29();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			for(int i = 0; i < line.length ; i++)
				nums[i] = Integer.parseInt(line[i]);
			System.out.println(obj.canJump(nums));
		}
	}
}

/*

>javac Problem29.java
>java Problem29
>3
>2 3 1 1 4
true
>3 2 1 0 4
false
>0
true

*/