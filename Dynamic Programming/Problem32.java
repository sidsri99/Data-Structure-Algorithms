/**

	P32: Best Sightseeing Pair
	
	Example 1:
	Input: values = [8,1,5,2,6]
	Output: 11
	Explanation: i = 0, j = 2, values[i] + values[j] + i - j = 8 + 5 + 0 - 2 = 11
	
	Example 2:
	Input: values = [1,2]
	Output: 2

*/

import java.io.*;
import java.util.*;
class Problem32{
	
	 public int maxScoreSightseeingPair(int[] values) {
        int size = values.length;
        int max = Integer.MIN_VALUE;
        /*for(int i = 0 ;i < size; i++){
            for(int j = i+1 ; j < size ; j++){
                int val = values[i]+values[j]+i-j;
                max = Math.max(max,val);
            }
        }*/
        int dp[]=new int[size];
        dp[0] = values[0];
        for(int i = 1; i<size; i++){
            int currentRight = values[i]-i;
            int currentLeft = values[i]+i;
            max = Math.max(dp[i-1]+currentRight,max);
            dp[i] = Math.max(dp[i-1],currentLeft);
        }
        return max;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem32 obj = new Problem32();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line[] = br.readLine().split(" ");
			int values[] = new int[line.length];
			for(int i = 0; i < line.length ; i++)
				values[i] = Integer.parseInt(line[i]);
			System.out.println(obj.maxScoreSightseeingPair(values));
		}
	}
}

/*

>javac Problem32.java
>java Problem32
>2
>8 1 5 2 6
11
>1 2
2

*/