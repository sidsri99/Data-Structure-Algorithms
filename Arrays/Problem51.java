/**

  P51: Alternating Groups II
  
  Example 1:
  Input: colors = [0,1,0,1,0], k = 3
  Output: 3
  
  Example 2:
  Input: colors = [0,1,0,0,1,0,1], k = 6
  Output: 2
  
  Example 3:
  Input: colors = [1,1,0,1], k = 4
  Output: 0

*/

class Problem51 {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int left = 0,count = 0,size = colors.length;
        for(int right = 1; right < size+k-1; right++){
            if(colors[right%size] == colors[(right-1)%size]){
                left = right;
            }
            if((right-left+1) == k){
                count += 1;
                left +=1;
            }
        }
        return count;
    }
}

/*

*/
