/**
 Missing numbers
*/

import java.io.*;
class Problem4{
	int missingNumber(int[] nums){
		int ans = nums.length * (nums.length + 1)/2;
		for(int i=0;i<nums.length;i++){
			ans -= nums[i];
		}
		return ans;
	}
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem4 obj = new Problem4();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String str[] = br.readLine().split(" ");
			int arr[] = new int[str.length];
			for(int i = 0; i< str.length;i++){
				arr[i]=Integer.parseInt(str[i]);
			}
			int result = obj.missingNumber(arr);
			System.out.println(result);
		}
		
	}
}

/*
>javac Problem4.java
>java Problem4
>3
>3 0 1
2
>0 1
2
>9 6 4 2 3 5 7 0 1
8
*/