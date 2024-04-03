/**
	Number of 1 bits:
	Return set bits of positive integer
*/

import java.io.*;
class Problem1{
	
	//Hamming Weight Faster 
	int hammingWeightFast(int n){
		int count = 0;
		while(n>0){
			n = n & (n-1);
			count++;
		}
		return count;
	}
	int hammingWeight(int n){
		int count = 0;
		while(n>0){
			count = count + ((n & 1)==1? 1:0); // count =  count + (n & 1);
			n = n>>1;
		}
		return count;
	}
	public static void main(String args[])throws Exception{
		Problem1 obj=new Problem1();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			int num = Integer.parseInt(br.readLine());
			int count = obj.hammingWeight(num);
			System.out.println(count);
		}
	}
} 

/*
>javac Problem1.java
>java Problem1
>3
>11
3
>128
1
>2147483645
30
*/