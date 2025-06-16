/**

  P62: Maximum Difference Between Increasing Elements

  Example 1:
  Input: nums = [7,1,5,4]
  Output: 4
  Explanation:
  The maximum difference occurs with i = 1 and j = 2, nums[j] - nums[i] = 5 - 1 = 4.
  Note that with i = 1 and j = 0, the difference nums[j] - nums[i] = 7 - 1 = 6, but i > j, so it is not valid.
  
  Example 2:
  Input: nums = [9,4,3,2]
  Output: -1
  Explanation:
  There is no i and j such that i < j and nums[i] < nums[j].

  Example 3:
  Input: nums = [1,5,2,10]
  Output: 9
  Explanation:
  The maximum difference occurs with i = 0 and j = 3, nums[j] - nums[i] = 10 - 1 = 9.

*/

class Problem62 {
    public int maximumDifference(int[] nums) {
        int dif = -1, min = nums[0];
        for(int i =1; i<nums.length; i++){
            if(nums[i]> min){
                dif = Math.max(dif,nums[i]-min);
            }
            if(nums[i]<min)min = nums[i];
        }
        return dif;
    }
}
