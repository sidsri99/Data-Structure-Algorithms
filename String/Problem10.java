/*
  P10: Count Vowel Strings in Ranges

  Example 1:
  Input: words = ["aba","bcb","ece","aa","e"], queries = [[0,2],[1,4],[1,1]]
  Output: [2,3,0]
  Explanation: The strings starting and ending with a vowel are "aba", "ece", "aa" and "e".
  The answer to the query [0,2] is 2 (strings "aba" and "ece").
  to query [1,4] is 3 (strings "ece", "aa", "e").
  to query [1,1] is 0.
  We return [2,3,0].
  
  Example 2:
  Input: words = ["a","e","i"], queries = [[0,2],[0,1],[2,2]]
  Output: [3,2,1]
  Explanation: Every string satisfies the conditions, so we return [3,2,1].
  
*/

class Problem10 {
    public boolean isVowel(String s){
        char start = s.charAt(0);
        char end = s.charAt(s.length()-1);
        if(
            (start == 'a' || start == 'e' || start == 'i' || start =='o' || start == 'u')
            &&
            (end == 'a' || end == 'e' || end == 'i' || end == 'o' || end == 'u')
        )
            return true;
        return false;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int size=words.length;
        int dp[]=new int[size];
        if(isVowel(words[0])){
            dp[0]=1;
        }
        for(int i = 1; i<size ;i++){
            if(isVowel(words[i])){
                dp[i] = dp[i-1]+1;
            }else{
                dp[i] = dp[i-1];
            }
        }

        size = queries.length;
        int ans[] = new int[size];
        for(int i = 0; i<size; i++){
            ans[i] = dp[queries[i][1]];
            if(queries[i][0]-1>-1){
                ans[i] -= dp[queries[i][0]-1];
            }
        }
        return ans;
    }
}
