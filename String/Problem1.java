/*
    Isomorphic String: 
    Two strings s and t are isomorphic if the characters in s can be replaced to get t.

    Example 1:
    Input: s = "egg", t = "add"
    Output: true
    Example 2:
    Input: s = "foo", t = "bar"
    Output: false
    Example 3:
    Input: s = "paper", t = "title"
    Output: true
    Example 4:
    Input: s = "abcd", t = "qwqe"
    Output: false
*/

import java.io.*;
import java.util.*;
class Problem1{
    public boolean isIsomorphic(String s, String t) {
        String s2="",visited="",replace="";
        for(int i=0;i<s.length();i++){
            int pos=0;
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if(visited.indexOf(schar) < 0 && replace.indexOf(tchar)<0){ 
                s2 += tchar;
                visited += schar;
                replace += tchar;
            }
            else{
                if(visited.indexOf(schar)>-1)
                    s2 += replace.charAt(visited.indexOf(schar));
                else
                    return false;
            }
        }
        if(s2.equals(t)){
            return true;
        }
        return false;
    }
    public boolean isIsomorphicOptimised(String s, String t){
        int StT[]=new int[256];
        int TtS[]=new int[256];
        // Given s & t not Null and of same length 
        Arrays.fill(StT,-1);
        Arrays.fill(TtS,-1);
        for(int i=0; i<s.length(); i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(StT[c1]== -1 && TtS[c2] == -1){
                StT[c1] = c2;
                TtS[c2] = c1;
            }
            else if(!(StT[c1]==c2 && TtS[c2]==c1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem1 obj=new Problem1();
        int testcase=Integer.parseInt(br.readLine());
        while(testcase-->0){
            String s=br.readLine().trim();
            String t=br.readLine().trim();
            System.out.println(obj.isIsomorphicOptimised(s,t));
        }
    }
}

/*
    Output:
    >javac Problem1.java
    >java Problem1
    >4
    >egg
    >add
    true
    >foo
    >bar
    false
    >paper
    >title
    true
    >abcd
    >qwqe
    false
*/