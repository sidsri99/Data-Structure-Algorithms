/*

  P18: Minimum Length of String After Operations
  
  Example 1:
  Input: s = "abaacbcbb"
  Output: 5
  Explanation:
  We do the following operations:
  Choose index 2, then remove the characters at indices 0 and 3. The resulting string is s = "bacbcbb".
  Choose index 3, then remove the characters at indices 0 and 5. The resulting string is s = "acbcb".

  Example 2:
  Input: s = "aa"
  Output: 2
  Explanation:
  We cannot perform any operations, so we return the length of the original string.
    
*/

class Problem19{
    public int minimumLength(String s) {
        int alpha[]=new int[26];
        int count = 0;
        for(char ch: s.toCharArray()){
            int index = ch-97;
            alpha[index]++;
            /*count++;
            if(alpha[index] == 3){
                alpha[index] -= 2;
                count -= 2;
            }*/
        }
        for(int i:alpha){
            if(i == 0){
                continue;
            }
            else if( (i&1) == 1){
                count += 1;
            }
            else{
                count +=2;
            }
        }
        return count;
    }
}

/*

>aa
2
>abaacbcbb
5

*/
