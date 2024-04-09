/**
 P7: Valid Palindrome
*/

import java.io.*;
import java.util.*;
class Problem7{
	public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for(int i = 0, j = s.length()-1;;){
            if(i>s.length()-1 || j< 0)break;
            char chs = s.charAt(i);
            char che = s.charAt(j);
            while(!((chs >= 'a' && chs <= 'z') ||(chs >= '0' && chs <= '9'))){
                i++;
                if(i == s.length())return true;
                chs = s.charAt(i);
            }
            while(!( (che >= 'a' && che <= 'z') ||(che >= '0' && che <= '9'))){
                j--;
                if(j == -1)return true;
                che = s.charAt(j);
            }
            if(che == chs){
                i++;
                j--;
            }else {
                return false;
            
            }
        }
    return true;
    }
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem7 obj = new Problem7();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String line = br.readLine();
			boolean result = obj.isPalindrome(line);
			System.out.println(result);
		}
	}
}

/*
>javac Problem7.java
>java Problem7
>3
true
>race a car
false
>A man, a plan, a canal: Panama
true
*/