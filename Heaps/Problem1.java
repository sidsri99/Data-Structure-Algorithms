/**
	
	P1: Kth Largest Element in an Array
	
	Example 1:
	Input: nums = [3,2,1,5,6,4], k = 2
	Output: 5
	
	Example 2:

	Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
	Output: 4
	
*/

import java.io.*;
import java.util.*;
class Problem1{
	public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //Min Heap
        for(int i = 0; i < nums.length; i++){
            pq.add(nums[i]);
            if(pq.size() > k)
                pq.poll();
        }
        return pq.peek();
    }
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem1 obj = new Problem1();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			for(int i = 0; i<nums.length;i++)
				nums[i] = Integer.parseInt(line[i]);
			int k = Integer.parseInt(br.readLine());
			System.out.println(obj.findKthLargest(nums,k));
		}
	}
}

/*

>javac Problem1.java
>java Problem1
>2
>3 2 1 5 6 4
>2
5
>3 2 3 1 2 4 5 5 6
>4
4

*/