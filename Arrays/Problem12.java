/**
    P12: 3 Sum Using Two Pointer
*/

import java.io.*;
import java.util.*;
class Problem12{
	public List<List<Integer>> threeSum(int[] nums){
		LinkedList<List<Integer>> llist = new LinkedList<List<Integer>>();
		Arrays.sort(nums);
		for(int i = 0 ;i < nums.length-2 ; i++){
			if( i == 0 || (nums[i] != nums[i-1])){
				int target = 0 - nums[i];
				int left = i+1;
				int right = nums.length-1;
				while(left < right){
					if(nums[left] + nums[right] == target){
						ArrayList list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[left]);
						list.add(nums[right]);
						llist.add(list);
						while(left<right && (nums[left]==nums[left+1])) left++;
						while(left<right && (nums[right]==nums[right-1])) right--;
						left++;
						right--;
					}
					else if(nums[left] + nums[right] < target){
						left++;
					}
					else{
						right--;
					}
				}
			}
		}
		return llist;
	}
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem12 obj = new Problem12();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int arr[]=new int[line.length];
			for(int i = 0; i < line.length; i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			List<List<Integer>> llist = new LinkedList<List<Integer>>();
			llist = obj.threeSum(arr);
			System.out.println(llist);
			
		}
	}
}

/*
>javac Problem12.java
Note: Problem12.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
>java Problem12
>3
>-1 0 1 2 -1 -4
[[-1, -1, 2], [-1, 0, 1]]
>0 1 1
[]
>0 0 0
[[0, 0, 0]]
*/