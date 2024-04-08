/**

Problem 10 : Longest Consecutive Sequence


*/

import java.util.*;
import java.io.*;
class Problem10{
	 public int longestConsecutive(int[] nums) {
        int longest = 0,max = 0;
        if(nums.length == 0){
            return 0;
        }
        else{ 
            longest = 1;
        }
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int num : nums){
            hs.add(num);
        }
        for(int num : nums){
            if(! hs.contains(num-1)){
                max = 1;
                while(hs.contains(++num)){
                    max = ++max;
                }
                longest = Math.max(longest,max);
            }
        }
        return longest;
    }
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem10 obj=new Problem10();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int arr[]=new int[line.length];
			for(int i= 0;i<line.length;i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			int length = obj.longestConsecutive(arr);
			System.out.println(length);
		}
	}
}

/*
>javac Problem10.java
>java Problem10
>2
>100 4 200 1 3 2
4
>0 3 7 2 5 8 4 6 0 1
9
*/