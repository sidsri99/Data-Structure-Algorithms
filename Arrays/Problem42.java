/**

  P41: Check if One String Swap Can Make Strings Equal

  Example 1:
  Input: s1 = "bank", s2 = "kanb"
  Output: true
  Explanation: For example, swap the first character with the last character of s2 to make "bank".

  Example 2:
  Input: s1 = "attack", s2 = "defend"
  Output: false
  Explanation: It is impossible to make them equal with one string swap.
  
  Example 3:
  Input: s1 = "kelb", s2 = "kelb"
  Output: true
  Explanation: The two strings are already equal, so no string swap operation is required.

*/

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;
        if(s1.equals(s2))
            return true;
        /*Map<Character,Integer> hm1=new HashMap<Character, Integer>();
        Map<Character,Integer> hm2=new HashMap<Character, Integer>();
        int c = 0;
        for(int i = 0 ; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                c++;
                hm1.put((char)s1.charAt(i), i);
                hm2.put((char)s2.charAt(i), i);
            }
            if(c > 2){
                return false;
            }
        }
        //if(hm1.isEmpty())
        //    return true;
        char ch1='a', ch2='a';
        int i1=0,i2=0;
        c=0;
        for(Map.Entry<Character, Integer> tmp: hm1.entrySet()){
         if(c == 0){
            ch1 = tmp.getKey();
            i1 = tmp.getValue();
         }else{
            ch2 = tmp.getKey();
            i2 = tmp.getValue();
         }
         c++;
        }
        if((hm2.getOrDefault(ch1,-1) == i2) && 
            (hm2.getOrDefault(ch2,-1) == i1) )
            return true;
        return false;
        */
        int first = 0, second = 0, count = 0;
        for(int i = 0 ; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
                if(count > 2)
                    return false;
                else if(count == 1){
                    first = i;
                }else{
                    second = i;
                }
            }
        }
        /*
        if((s1.charAt(first) == s2.charAt(second)) &&
           (s2.charAt(first) == s1.charAt(second)))
            return true;
        return false;
        */
        return ((s1.charAt(first) == s2.charAt(second)) &&
           (s2.charAt(first) == s1.charAt(second)));
    }
}

/*

>s1 = "qgqeg"
>s2 = "gqgeq"
false

*/
