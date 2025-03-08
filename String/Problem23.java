/**

  P23: Minimum Recolors to Get K Consecutive Black Blocks

  Example 1:
  Input: blocks = "WBBWWBBWBW", k = 7
  Output: 3
  Explanation:
  One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
  so that blocks = "BBBBBBBWBW". 
  It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
  Therefore, we return 3.
  
  Example 2:
  Input: blocks = "WBWBBBW", k = 2
  Output: 0
  Explanation:
  No changes need to be made, since 2 consecutive black blocks already exist.
  Therefore, we return 0.

*/

class Problem23 {
    public int minimumRecolors(String blocks, int k) {
        int count = 0, min = k;
        /*String s = blocks.substring(0,k);
        for(char ch: s.toCharArray()){
            if(ch =='W'){
                count += 1;
            }
        }*/
        for(int i = 0; i<k; i++){
            if(blocks.charAt(i) == 'W'){
                count += 1;
            }
        }
        if(count == 0)
            return 0;
        if(count< min){
            min = count;
        }
        for(int i = 1; i<blocks.length()-k+1; i++){
            char ch= blocks.charAt(i-1);
            if( ch == 'W'){
                count -= 1;
            }
            ch = blocks.charAt(i+k-1);
            if(ch == 'W'){
                count++;
            }
            if(count< min){
                min = count;
            }
        }
        return min;
    }
}

/*

>blocks = "BWWWBB"
>k = 6
3
>blocks = "WWBBBWBBBBBWWBWWWB"
>k = 16
6

*/
