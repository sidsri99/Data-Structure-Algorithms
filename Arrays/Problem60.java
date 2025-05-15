/**

  P60: Longest Unequal Adjacent Groups Subsequence I
  Example 1:
  Input: words = ["e","a","b"], groups = [0,0,1]
  Output: ["e","b"]
  Explanation: A subsequence that can be selected is ["e","b"] because groups[0] != groups[2]. Another subsequence that can be selected is ["a","b"] because groups[1] != groups[2]. It can be demonstrated that the length of the longest subsequence of indices that satisfies the condition is 2.

  Example 2:
  Input: words = ["a","b","c","d"], groups = [1,0,1,1]
  Output: ["a","b","c"]
  Explanation: A subsequence that can be selected is ["a","b","c"] because groups[0] != groups[1] and groups[1] != groups[2]. Another subsequence that can be selected is ["a","b","d"] because groups[0] != groups[1] and groups[1] != groups[3]. It can be shown that the length of the longest subsequence of indices that satisfies the condition is 3.

*/

class Problem60 {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ls=new ArrayList<>();
        int prev = -1;
        for(int i=0;i<groups.length;i++){
            if(groups[i]!=prev){
                ls.add(words[i]);
                prev = groups[i];
            }
            
        }
        return ls;
    }
}
