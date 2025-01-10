/**

  P16: Word Subsets
  Example 1:
  Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["e","o"]
  Output: ["facebook","google","leetcode"]
  
  Example 2:
  Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 = ["l","e"]
  Output: ["apple","google","leetcode"]
  
*/

import java.util.*;
class Problem16{
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ls=new ArrayList<String>();
        //HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        int ind[]=new int[26];
        Arrays.fill(ind,0);
        for(String s: words2){
            int tmp[]=new int[26];
            Arrays.fill(tmp,0);
            for(int i=0; i<s.length(); i++){
                int index = s.charAt(i)-97;
                tmp[index]++;
                ind[index] = Math.max(tmp[index],ind[index]);
            }
        }
        for(String s: words1){
            boolean flag = true; 
            int tmp[]=new int[26];
            Arrays.fill(tmp,0);
            for(int i=0; i<s.length(); i++){
                int index = s.charAt(i)-97;
                tmp[index]--;
            }
            for(int i=0;i<26;i++){
                if(ind[i]+tmp[i] > 0){
                    flag = false;
                    break;
                }
            }
            if(flag == true)
                ls.add(s);
        }
        return ls;
    }
}

/*

>["aabb","aabbcc"]
>["a","a","aa"]
["aabb","aabbcc"]
>["amazon","apple","facebook","google","leetcode"]
>["l","e"]
["apple","google","leetcode"]
>["amazon","apple","facebook","google","leetcode"]
>["e","o"]
["facebook","google","leetcode"]


*/
