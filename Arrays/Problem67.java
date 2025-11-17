/**

  P67: Check If All 1's Are at Least Length K Places Away
  Example 1:
  Input: nums = [1,0,0,0,1,0,0,1], k = 2
  Output: true
  Explanation: Each of the 1s are at least 2 places away from each other.
  
  Example 2:
  Input: nums = [1,0,0,1,0,1], k = 2
  Output: false
  Explanation: The second 1 and third 1 are only one apart from each other.

*/

class Problem67 {
    public boolean kLengthApart(int[] nums, int k) {
        int left = -1, right = -1;
        for(int i = 0; i < nums.length ; i++){
            if( nums[i] == 1){
                if(left == -1){
                    left = i;
                }else{
                    right = i;
                }
                if( (left != right) && (left != -1) && (right != -1) ){
                    if( (right-left) <= k ){
                        return false;
                    }
                    left = right;
                }
            }
        }
        return true;       
    }
}
