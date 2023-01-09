/*
    Isomorphic String :
    A subsequence of a string is a new string that is formed
    from the original string by deleting some (can be none) of the characters
    without disturbing the relative positions of the remaining characters.

*/

import java.io.*;
class Problem2 {
    public boolean isSubsequence(String s, String t) {
        int prev=-1;
        for(int i=0;i<s.length();i++){
            if(t.indexOf(s.charAt(i),prev) >= prev){
                prev=t.indexOf(s.charAt(i),prev)+1;
                if(prev==0)return false;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean isSubsequenceMemOpt(String s, String t){
        int i=0, count=0;
        while(i<s.length() && count<t.length()){
            if(s.charAt(i) == t.charAt(count)){
                i++;
            }
            count++;
        }
        return i == s.length();
    }

    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Problem2 obj=new Problem2();
        int testcase=Integer.parseInt(br.readLine());
        while(testcase-->0){
            String s=br.readLine().trim();
            String t=br.readLine().trim();
            System.out.println(obj.isSubsequence(s,t));
        }
    }

}

/*
    Output:
    >javac Problem2.java
    >java Problem2
    >3
    >abc
    >ahbgdc
    true
    >axc
    >ahbgdc
    false
    >b
    >c
    false
*/