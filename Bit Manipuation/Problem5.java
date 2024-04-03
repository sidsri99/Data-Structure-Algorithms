/**
	Sum of two integer
*/

import java.io.*;
class Problem5{
	int getSum(int a, int b){
		while(b!=0){
			int temp = a^b;
			b = (a & b) << 1;
			a = temp;
		}
		return a;
	}
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem5 obj = new Problem5();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line[] = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int sum = obj.getSum(a,b);
			System.out.println(sum);
		}
 	}
}
/*
>javac Problem5.java
>java Problem5
>2
>1 2
3
>2 3
5
*/