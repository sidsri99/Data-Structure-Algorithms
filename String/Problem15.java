/**
  
  P15: Counting Words With a Given Prefix

  Example 1:

  Input: words = ["pay","attention","practice","attend"], pref = "at"
  Output: 2
  Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
  
  Example 2:
  Input: words = ["leetcode","win","loops","success"], pref = "code"
  Output: 0
  Explanation: There are no strings that contain "code" as a prefix.

*/
class Problem15{
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(String s:words){
            if(s.startsWith(pref))
                count++;
        }
        return count;
    }
}
