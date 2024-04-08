/**
   Problem 11: Two sum
   
*/

import java.util.*;
import java.io.*;
class Problem11{
	
	public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
     HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();

     for(int i = 0; i< nums.length; i++){
        if(hm.containsKey(target-nums[i])){
            arr[1] = hm.get(target - nums[i]);
            arr[0] = i; 
            return arr;
        }
        hm.put(nums[i],i);
     }
     return arr;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem11 obj = new Problem11();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[]= br.readLine().split(" ");
			int arr[] = new int[line.length];
			for(int i = 0;i<line.length;i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			int target = Integer.parseInt(br.readLine());
			int idx[] = new int[2];
			idx = obj.twoSum(arr, target);
			System.out.println(idx[0]+" , "+idx[1]);
		}
	}
}

/*
>javac Problem1.java
>java Problem11
>3
>2 7 11 15
>9
1 , 0
>3 2 4 6
>6
2 , 1
>3 3
>6
1 , 0
*/