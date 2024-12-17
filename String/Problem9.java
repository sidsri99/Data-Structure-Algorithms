/**
 
 P9: Construct String With Repeat Limit
	
	Example 1:
	Input: s = "cczazcc", repeatLimit = 3
	Output: "zzcccac"
	Explanation: We use all of the characters from s to construct the repeatLimitedString "zzcccac".
	The letter 'a' appears at most 1 time in a row.
	The letter 'c' appears at most 3 times in a row.
	The letter 'z' appears at most 2 times in a row.
	Hence, no letter appears more than repeatLimit times in a row and the string is a valid repeatLimitedString.
	The string is the lexicographically largest repeatLimitedString possible so we return "zzcccac".
	Note that the string "zzcccca" is lexicographically larger but the letter 'c' appears more than 3 times in a row, so it is not a valid repeatLimitedString.

	Example 2:
	Input: s = "aababab", repeatLimit = 2
	Output: "bbabaa"
	Explanation: We use only some of the characters from s to construct the repeatLimitedString "bbabaa". 
	The letter 'a' appears at most 2 times in a row.
	The letter 'b' appears at most 2 times in a row.
	Hence, no letter appears more than repeatLimit times in a row and the string is a valid repeatLimitedString.
	The string is the lexicographically largest repeatLimitedString possible so we return "bbabaa".
	Note that the string "bbabaaa" is lexicographically larger but the letter 'a' appears more than 2 times in a row, so it is not a valid repeatLimitedString.
 
*/

import java.io.*;
import java.util.*;
class Problem9{
	
	public String repeatLimitedString(String s, int repeatLimit) {
        PriorityQueue<Character> pq = new PriorityQueue<Character>(
            (a,b)->Character.compare(b,a)
        );
        int alphabets[] = new int[26];
        Arrays.fill(alphabets,0);
        for(int i = 0 ; i < s.length() ; i++ ){
            char ch = s.charAt(i);
            alphabets[ch-'a']++;
        }
        for(int i = 0; i<26;i++){
            if(alphabets[i]>0){
                pq.offer((char)(i+'a'));
            }
        }
        StringBuilder ans = new StringBuilder(); 
        while(!pq.isEmpty()){
            char ch = pq.poll();
            int steps = Math.min(repeatLimit,alphabets[ch-'a']);
            alphabets[ch-'a'] -= steps;
            while(steps-->0){
                ans.append(ch);
            }
            if(alphabets[ch-'a']>0 && !pq.isEmpty()){
                char ch2 =pq.poll(); 
                ans.append(ch2);
                alphabets[ch2-'a']--;
                if(alphabets[ch2-'a']>0)pq.offer(ch2);
                pq.offer(ch);
            }
        }
        return ans.toString();
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem9 obj = new Problem9();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String s = br.readLine();
			int repeatLimit = Integer.parseInt(br.readLine());
			System.out.println(obj.repeatLimitedString(s,repeatLimit));
		}
	}
}

/*

>javac Problem9.java
>java Problem9
>3
>cczazcc
>3
zzcccac
>aababab
>2
bbabaa
>robnsdvpuxbapuqgopqvxdrchivlifeepy
>2
yxxvvuvusrrqqppopponliihgfeeddcbba

*/