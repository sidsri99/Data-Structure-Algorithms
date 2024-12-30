/**

	P33: Count Ways To Build Good Strings
	
	Example 1:
	Input: low = 3, high = 3, zero = 1, one = 1
	Output: 8
	Explanation: 
	One possible valid good string is "011". 
	It can be constructed as follows: "" -> "0" -> "01" -> "011". 
	All binary strings from "000" to "111" are good strings in this example.
	
	Example 2:
	Input: low = 2, high = 3, zero = 1, one = 2
	Output: 5
	Explanation: The good strings are "00", "11", "000", "110", and "011".

*/

import java.io.*;
import java.util.*;
class Problem33{
	
	public int countStrings(int length, int zero, int one, int[] dp){
        if(length == 0)
            return 1;
        if(length < 0)
            return 0;
        if(dp[length]!=-1)
            return dp[length];
        int count = 0;
        return dp[length]=(countStrings(length-one,zero,one,dp)
               + countStrings(length-zero,zero,one,dp))%1000000007;
    }
    public int countGoodStrings(int low, int high, int zero, int one) {
        int count = 0;
        int dp[] = new int[high+1];
        Arrays.fill(dp,-1);
        for(int i=low;i<=high;i++){
            count += countStrings(i,zero,one,dp);
            count = count % 1000000007;
        }
        return count;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem33 obj = new Problem33();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			int low = Integer.parseInt(br.readLine());
			int high = Integer.parseInt(br.readLine());
			int zero = Integer.parseInt(br.readLine());
			int one = Integer.parseInt(br.readLine());
			System.out.println(obj.countGoodStrings(low,high,zero,one));
		}
	}
}

/*

>javac Problem33.java
>java Problem33
>4
>3
>3
>1
>1
8
>2
>3
>1
>2
5
>200
>200
>10
>1
764262396
>1
>100000
>1
>1
215447031

*/