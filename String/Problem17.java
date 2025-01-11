/**

  P17: Construct K Palindrome Strings
  
  Example 1:
  Input: s = "annabelle", k = 2
  Output: true
  Explanation: You can construct two palindromes using all characters in s.
  Some possible constructions "anna" + "elble", "anbna" + "elle", "anellena" + "b"
  
  Example 2:
  Input: s = "leetcode", k = 3
  Output: false
  Explanation: It is impossible to construct 3 palindromes using all the characters of s.

  Example 3:
  Input: s = "true", k = 4
  Output: true
  Explanation: The only possible solution is to put each character in a separate string.

*/
import java.util.*l
class Problem17{
    public boolean canConstruct(String s, int k) {
        if(s.length() < k)
            return false;
        if(s.length() == k)
            return true;
        int ind[]=new int[26];
        /*for(int i=0;i<s.length();i++){
            char ch = (char)(s.charAt(i)-97);
            ind[ch]++;
        }*/
        for(char ch: s.toCharArray())
            ind[ch-97]++;
        int count = 0;
        for(int i=0;i<26;i++){
            if(ind[i]%2==1)count++;
            if(count>k)return false;
        }
        return true;
    }
}

/*

>s = "cr"
>k = 7
false

>s = "messsi"
>k = 3
false

>s = "messi"
>k = 2
true

>s = "true"
>k = 4
true

*/
