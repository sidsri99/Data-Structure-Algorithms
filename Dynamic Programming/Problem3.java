/**
	P3: House Robber II
	
	Example 1:
	Input: nums = [2,3,2]
	Output: 3
	Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
	
	Example 2:
	Input: nums = [1,2,3,1]
	Output: 4
	Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
	Total amount you can rob = 1 + 3 = 4.
	
	Example 3:
	Input: nums = [1,2,3]
	Output: 3
	
*/
import java.util.*;
import java.io.*;
class Problem3{
	
	public int MaxMoney(int[] nums, int[] arr){
        arr[0] = nums[0];
        for(int i = 1; i<=nums.length-1; i++){
            if(i == 1){
                arr[i] = Math.max(arr[0], nums[1]);
            }
            else{
                int include = nums[i]+arr[i-2];
                int exclude = arr[i-1];
                arr[i] = Math.max(include, exclude);
            }  
        }
        return arr[nums.length-1];
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        int arr[] = new int[nums.length];
        Arrays.fill(arr, -1);
        int temp = nums[0];
        nums[0] = 0;
        int SkipFirst = MaxMoney(nums, arr);

        Arrays.fill(arr, -1);
        nums[0] = temp;
        temp = nums[nums.length-1];
        nums[nums.length-1] = 0;
        int SkipLast = MaxMoney(nums, arr);

        nums[nums.length-1]= temp;

        return Math.max(SkipFirst, SkipLast);
    }
	
	public static void main(String args[])throws Exception{
		Problem3 obj = new Problem3();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			String line[] = br.readLine().split(" ");
			int nums[]= new int[line.length];
			for(int i=0; i<line.length; i++){
				nums[i] = Integer.parseInt(line[i]);
			}
			System.out.println(obj.rob(nums));
		}
	}
}

/*

>javac Problem3.java
>java Problem3
>3
>2 3 2
3
>1 2 3 1
4
>1 2 3
3

*/