/**
	
	P2: Kth Smallest Element in an Array
	
	Input: arr[] = [7, 10, 4, 3, 20, 15], k = 3
	Output:  7
	Explanation: 3rd smallest element in the given array is 7.
	
	Input: arr[] = [2, 3, 1, 20, 15], k = 4 
	Output: 15
	Explanation: 4th smallest element in the given array is 15.
	
*/

import java.io.*;
import java.util.*;
class Problem2{
	public static int kthSmallest(int[] arr, int k) {
        // Your code here
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        for(int i = 0; i<arr.length; i++){
            pr.add(arr[i]);
            //if(pr.size() > k)pr.poll();
        }
        while(k-->1){
            pr.poll();
        }
        return pr.peek();
    }

	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem2 obj = new Problem2();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int nums[] = new int[line.length];
			for(int i = 0; i<nums.length;i++)
				nums[i] = Integer.parseInt(line[i]);
			int k = Integer.parseInt(br.readLine());
			System.out.println(obj.kthSmallest(nums,k));
		}
	}
}

/*

>javac Problem2.java
>java Problem2
>2
>7 10 4 3 20 15
>3
7
>2 3 1 20 15
>4
15

*/