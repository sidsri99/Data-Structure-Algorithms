/**
 P8: Find Longest Special Substring That Occurs Thrice I
 
*/

import java.io.*;
import java.util.*;
class Problem8{
	public int maximumLength(String s) {
        int len = -1;
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i = 0; i< s.length(); i++){
            String temp = s.charAt(i)+"";
            for(int j = i+1; j<s.length(); j++){
                if(s.charAt(i)== s.charAt(j)){
                    temp= temp+s.charAt(j);
                    if(hm.containsKey(temp)){
                        int count = hm.get(temp)+1;
                        hm.replace(temp, count);
                        if(count>=3){
                            len = Math.max(len, j-i+1);
                        }
                    }else{
                        hm.put(temp,1);
                    }
                }else{break;}
            }
        }
        if(len == -1){
            for(int i = 0; i<s.length();i++){
                String temp = s.charAt(i)+"";
                if(hm.containsKey(temp)){
                    int count = hm.get(temp)+1;
                    hm.replace(temp, count);
                    if(count==3){
                        len = 1;break;
                    }
                }else{
                    hm.put(temp,1);
                }
            }
        }
        return len;
    }
	public static void main(String args[])throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Problem8 obj = new Problem8();
		int test = Integer.parseInt(br.readLine());
		while(test-->0){
			String s = br.readLine();
			System.out.println(obj.maximumLength(s));
		}
	}
}

/*

>javac Problem8.java
>java Problem8
>4
>aaaa
2
>abcdef
-1
>acaba
1
>cccerrrecdcdccedecdcccddeeeddcdcddedccdceeedccecde
2

*/