/**
	P17: Search in Rotated Array: 
		 Binary Search
*/
import java.io.*;
import java.util.*;
class Problem17{
	
	//Search suggested code
	public int search2(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = (left+right)/2;

        while(left+1 < right){

            // first half
            if(nums[mid] > nums[left]) {
                if(nums[mid] >= target && target >= nums[left]){
                    right = mid;
                } else {
                    left = mid;
                }
            }
            // second half
            else {
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid;
                } else {
                    right = mid;
                }
            }
            mid = (left+right)/2;
        }

        if(nums[left] == target) return left;
        if(nums[right] == target) return right;
        return -1;
    }
	
	public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target)return mid;
            if(nums[start]<=nums[mid]){
                if(nums[start] > target || target > nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else{
                if(nums[end] < target || target< nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem17 obj=new Problem17();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int arr[]=new int[line.length];
			for(int i=0;i<line.length;i++){
				arr[i] = Integer.parseInt(line[i]);
			}
			int target = Integer.parseInt(br.readLine());
			System.out.println(obj.search(arr, target));
		}
	}
}
/*
>javac Problem17.java
>java Problem17
>4
>4 5 6 7 0 1 2
>0
4
>4 5 6 7 0 1 2
>3
-1
>1
>0
-1
>5 1 3
>0
-1
*/