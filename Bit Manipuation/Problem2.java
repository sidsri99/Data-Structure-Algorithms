/**
	Counting Bits
	
*/

import java.io.*;
class Problem2{
	
	// countBitsFaster
	void dp(int count, int num, int n, int[] array){
		if(num > n){
			return;
		}
		array[num] = count;
		dp(count, num << 1, n, array);
		dp(count+1, (num << 1)+1,n,array);
	}
	int[] countBitsFaster(int n){
		int[] array = new int[n + 1];
		dp(1,1,n,array);
		return array;
	}
	
	
	int[] countBits(int n){
		int arr[] = new int[n+1];
		arr[0] = 0;
		for(int i = 1; i<=n;i++){
			int num = i;
			while(num > 0){
				num = num & (num - 1);
				arr[i]++;
			}
		}
		return arr;
	}
	
	public static void main(String args[])throws Exception{
		Problem2 obj=new Problem2();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			int num = Integer.parseInt(br.readLine());
			int count[] = new int[num+1];
			 count = obj.countBits(num);
			 for(int i =0;i<= num;i++){
				System.out.print(count[i] + " "); 
			 }
			 System.out.println("");
		}
	}
} 

/*
>javac Problem2.java
>java Problem2
>4
>3
0 1 1 2
>8
0 1 1 2 1 2 2 3 1
>16
0 1 1 2 1 2 2 3 1 2 2 3 2 3 3 4 1
>20
0 1 1 2 1 2 2 3 1 2 2 3 2 3 3 4 1 2 2 3 2
*/