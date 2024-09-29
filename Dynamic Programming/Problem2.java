/**
	P2: House Robber
	
	Example 1:
	Input: nums = [1,2,3,1]
	Output: 4
	Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
	Total amount you can rob = 1 + 3 = 4.
	
	Example 2:
	Input: nums = [2,7,9,3,1]
	Output: 12
	Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
	Total amount you can rob = 2 + 9 + 1 = 12.
	
*/
import java.util.*;
import java.io.*;
class Problem2{
	public int house(int[] nums, int index, int[] arr ){
        if(index == 0)return nums[index];
        if(index < 0)return 0;
        if(arr[index]!=-1)return arr[index];
        int include = nums[index] + house(nums, index-2, arr);
        int exclude = house(nums, index-1, arr);
        return (arr[index]=Math.max(include,exclude));
    }
    public int rob(int[] nums) {
        int arr[] = new int[nums.length];
        Arrays.fill(arr,-1);
        return house(nums, nums.length-1, arr);
        
    }
	public static void main(String args[])throws Exception{
		Problem2 obj = new Problem2();
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
>javac Problem2.java
>java Problem2
>2
>1 2 3 1
4
>2 7 9 3 1
12
*/