/**

  P57: Three Consecutive Odds

  Example 1:
  Input: arr = [2,6,4,1]
  Output: false
  Explanation: There are no three consecutive odds.
  
  Example 2:
  Input: arr = [1,2,34,3,4,5,7,23,12]
  Output: true
  Explanation: [5,7,23] are three consecutive odds.

*/

class Problem57 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c = 0;
        for(int n: arr ){
            if((n & 1) == 0)
                c = 0;
            else
                c += 1;
            if(c == 3)
                return true;
        }
        return false;
    }
}
