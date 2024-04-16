/**
	P16: Find minimum in rotated sorted array
	
*/
import java.io.*;
import java.util.*;
class Problem16{
	
	//Binary Search logic
	public int findMin_BinSearch(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            if(nums[s]<=nums[e]){return nums[s];}
            int m = (s+e)/2;
            if(nums[m]>= nums[s]){
                s = m+1;
            }else{
                e = m;
            }
        }
        return 0;
    }
	
	public int findMin(int[] nums) {
        for(int i = 1; i<nums.length;i++ ){
            if(nums[i-1]>nums[i])return nums[i];
        }
        return nums[0];
    }
	
	public static void main(String args[])throws Exception{
		Problem16 obj = new Problem16(); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int arr[]=new int[line.length];
			for(int i=0;i<line.length;i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			System.out.println(obj.findMin(arr));
		}	
	}
}

/*
>javac Problem16.java
>java Problem16
>3
>3 4 5 1 2
1
>4 5 6 7 0 1 2
0
>11 13 15 17
11
>1
1
>2 1
1
>3 1 2
1
*/