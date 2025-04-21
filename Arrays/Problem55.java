/**
  
  P55: Count the Hidden Sequences
  
  Example 1:
  Input: differences = [1,-3,4], lower = 1, upper = 6
  Output: 2
  Explanation: The possible hidden sequences are:
  - [3, 4, 1, 5]
  - [4, 5, 2, 6]
  Thus, we return 2.
  
  Example 2:
  Input: differences = [3,-4,5,1,-2], lower = -4, upper = 5
  Output: 4
  Explanation: The possible hidden sequences are:
  - [-3, 0, -4, 1, 2, 0]
  - [-2, 1, -3, 2, 3, 1]
  - [-1, 2, -2, 3, 4, 2]
  - [0, 3, -1, 4, 5, 3]
  Thus, we return 4.
  
  Example 3:
  Input: differences = [4,-7,2], lower = 3, upper = 6
  Output: 0
  Explanation: There are no possible hidden sequences. Thus, we return 0.
  
*/

class Problem55 {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        //int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int max = 0, min = 0;
        int preSum = 0;
        for(int n:differences){
            preSum += n;
            if(preSum > max)
                max = preSum;
            if(preSum < min)
                min = preSum;
            if(max-min > upper-lower)
                return 0;
        }
        return (upper-lower)-(max-min)+1;
    }
}
