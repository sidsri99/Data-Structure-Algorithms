/**

  P38: Special Array I
  
  Example 1:
  Input: nums = [1]
  Output: true
  Explanation:
  There is only one element. So the answer is true.

  Example 2:
  Input: nums = [2,1,4]
  Output: true
  Explanation:
  There is only two pairs: (2,1) and (1,4), and both of them contain numbers with different parity. So the answer is true.

  Example 3:
  Input: nums = [4,3,1,6]
  Output: false
  Explanation:
  nums[1] and nums[2] are both odd. So the answer is false.

*/

class Problem38{
    public boolean isArraySpecial(int[] nums) {
        for(int i =1; i<nums.length; i++){
            //if((nums[i] & 1) == (nums[i-1] & 1))
            if(((nums[i] & 1) ^ (nums[i-1] & 1)) == 0)
                return false;
        }
        return true;
    }
}

/*


*/
