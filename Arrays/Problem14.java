/**
	P14: Longest Substring Without Repeating Chanracters
	Two pointers and Sliding Window Technique
*/
import java.io.*;
import java.util.*;
class Problem14{
	int lengthOfLongestSubstring(String s){
		if(s.length()==0)return 0;
		HashSet<Character> hs = new HashSet<Character>();
		int i = 0, maxLen = 0;
		for(int j = i;j<s.length();j++){
			while(i<j && hs.contains(s.charAt(j))){
				hs.remove(s.charAt(i));
				i++;
			}
			hs.add(s.charAt(j));
			maxLen = Math.max(maxLen, j-i+1);
		}
		return maxLen;
	}
	public static void main(String args[])throws Exception{
		Problem14 obj = new Problem14();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			String line = br.readLine().trim();
			int length = obj.lengthOfLongestSubstring(line);
			System.out.println(length);
		}
	}
}

/*
>javac Problem14.java
>java Problem14
>3
>abcabcbb
3
>bbbbb
1
>pwwkew
3
*/