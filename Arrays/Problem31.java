/**

  P31: Count Prefix and Suffix Pairs I
  
  Example 1:
  Input: words = ["a","aba","ababa","aa"]
  Output: 4
  Explanation: In this example, the counted index pairs are:
  i = 0 and j = 1 because isPrefixAndSuffix("a", "aba") is true.
  i = 0 and j = 2 because isPrefixAndSuffix("a", "ababa") is true.
  i = 0 and j = 3 because isPrefixAndSuffix("a", "aa") is true.
  i = 1 and j = 2 because isPrefixAndSuffix("aba", "ababa") is true.
  Therefore, the answer is 4.
  
  Example 2:
  Input: words = ["pa","papa","ma","mama"]
  Output: 2
  Explanation: In this example, the counted index pairs are:
  i = 0 and j = 1 because isPrefixAndSuffix("pa", "papa") is true.
  i = 2 and j = 3 because isPrefixAndSuffix("ma", "mama") is true.
  Therefore, the answer is 2.  

Example 3:
  Input: words = ["abab","ab"]
  Output: 0
  Explanation: In this example, the only valid index pair is i = 0 and j = 1, and isPrefixAndSuffix("abab", "ab") is false.
  Therefore, the answer is 0.
  
*/

class Problem31{
    public boolean isPrefixAndSuffix(String str1, String str2){
        if(str2.indexOf(str1)==0 && str2.lastIndexOf(str1)==(str2.length()-str1.length())){
            return true;
        }
        return false;
    }
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            for(int j=i+1; j<words.length; j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    count++;
                }
            }
        }
        return count;
    }
}

/*

>["a","c","cacaa","ccccc"]
1
>["ab","ab"]
1
>["abab","ab"]
0
>["pa","papa","ma","mama"]
2
>["a","aba","ababa","aa"]
4

*/
