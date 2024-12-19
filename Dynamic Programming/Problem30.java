/**

	P30: Generate Parentheses
	
	Example 1:
	Input: n = 3
	Output: ["((()))","(()())","(())()","()(())","()()()"]
	
	Example 2:
	Input: n = 1
	Output: ["()"]

*/

import java.io.*;
import java.util.*;
class Problem30{
	
	public void generate(int n, String s, int open, int close, List<String> al){
        if(open == n && close == n){
            al.add(s);
            return;
        }
        if(open < n){
            //s = s+'(';
            generate(n,s+'(',open+1,close,al);
            //s=s.substring(0,s.length()-1);
        }
        if(close < open){
            //s = s +')';
            generate(n,s+')',open,close+1,al);
            //s=s.substring(0,s.length()-1);
        }
    }
	
    public List<String> generateParenthesis(int n) {
        List<String> al = new ArrayList<String>();
        generate(n,"",0,0,al);
        return al;
    }
	
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem30 obj = new Problem30();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			int n = Integer.parseInt(br.readLine());
			System.out.println(obj.generateParenthesis(n));
		}
	}
}

/*

>javac Problem30.java
>java Problem30
>2
>3
[((())), (()()), (())(), ()(()), ()()()]
>1
[()]

*/