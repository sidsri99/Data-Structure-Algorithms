/**
	P15: Longest Repeating Character 
*/

import java.io.*;
import java.util.*;
class Problem15{
	int characterReplacement(String s, int k){
		if(s.length() == 0)return 0;
		int arr[]=new int[26];
		int maxLen = 0, left = 0, max = 0;
		for(int right=0; right<s.length();right++){
			arr[s.charAt(right)-65]++;
			
			max = Math.max(max, arr[s.charAt(right)-65]);
			//if(right-left+1-max > k){
			while(right-left+1-max > k){
				arr[s.charAt(left)-65]--;
				left++;
			}
			
			maxLen = Math.max(maxLen, right - left + 1);
		}
		return maxLen;
	}
	public static void main(String args[])throws Exception{
		Problem15 obj = new Problem15();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line = br.readLine().trim();
			int k = Integer.parseInt(br.readLine());
			int length = obj.characterReplacement(line,k);
			System.out.println(length);
		}
	}
}

/*
>javac Problem15.java
>java Problem15
>5
>ABAB
>2
4
>AABABBA
>1
4
>AAAA
>2
4
>AAAAAA
>2
6
>ABAA
>0
2
*/