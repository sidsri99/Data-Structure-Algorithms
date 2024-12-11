/**
	P22: Maximum Beauty of an Array After Applying Operation
	
	Example 1:
	Input: nums = [4,6,1,2], k = 2
	Output: 3
	Explanation: In this example, we apply the following operations:
	- Choose index 1, replace it with 4 (from range [4,8]), nums = [4,4,1,2].
	- Choose index 3, replace it with 4 (from range [0,4]), nums = [4,4,1,4].
	After the applied operations, the beauty of the array nums is 3 (subsequence consisting of indices 0, 1, and 3).
	It can be proven that 3 is the maximum possible length we can achieve.

	Example 2:
	Input: nums = [1,1,1,1], k = 10
	Output: 4
	Explanation: In this example we don't have to apply any operations.
	The beauty of the array nums is 4 (whole array).
	
*/
import java.io.*;
import java.util.*;
class Problem22{
	public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length, fast = 1, slow = 0, maximum = 1;
        while(fast < len && slow < len){
            if(nums[fast]-nums[slow] <= 2*k){
                fast++;
            }else{
                int max = fast-slow;
                maximum = Math.max(max,maximum);
                slow++;
            }
        }
        return maximum = Math.max(maximum, fast-slow);
    }
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem22 obj = new Problem22();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			for(int i = 0; i < line.length ; i++){
				nums[i] = Integer.parseInt(line[i]);
			}
			int k = Integer.parseInt(br.readLine());
			System.out.println(obj.maximumBeauty(nums,k));
		}
	}
}

/*
Output:

>javac Problem22.java
>java Problem22
>2
>4 6 1 2
>2
3
>1 1 1 1
>10
4

*/