/**

  P47: Maximum Subarray
  Example 1:
  Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
  Output: 6
  Explanation: The subarray [4,-1,2,1] has the largest sum 6.
  
  Example 2:
  Input: nums = [1]
  Output: 1
  Explanation: The subarray [1] has the largest sum 1.
  
  Example 3:
  Input: nums = [5,4,-1,7,8]
  Output: 23
  Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

*/

class Problem47{
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(sum + nums[i] < nums[i]){
                sum = nums[i];
            }else{
                sum += nums[i]; 
            }
            max = Math.max(sum,max);
        }
        return max;
    }
}
