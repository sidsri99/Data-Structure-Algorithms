/**
	Reverse Bits
*/
import java.io.*;
class Problem3{
	
	//Reverse Bit Faster
	int reverseBitsFast(int n){
		if(n==0)return 0;
		int result = 0;
		for(int i=0;i<32;i++){
			result <<=1;
			if((n&1)==1)result++;
			n>>=1;
		}
		return result;
	}
	int reverseBits(int n){
		int num = 0;
		for(int i=0;i<32;i++){
			num = ((num<<1)|(n&1));
			n = n>>1;
		}
		return num;
	}
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem3 obj = new Problem3();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			int num = Integer.parseInt(br.readLine());
			int out = obj.reverseBits(num);
			System.out.println(out);
		}
	}
}
/*
>javac Problem3.java
>java Problem3
>1
>43261596   (00000010100101000001111010011100)
964176192   (00111001011110000010100101000000)
*/