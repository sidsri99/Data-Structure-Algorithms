/**

  P40: Longest Strictly Increasing or Strictly Decreasing Subarray

  Example 1:
  Input: nums = [1,4,3,3,2]
  Output: 2
  Explanation:
  The strictly increasing subarrays of nums are [1], [2], [3], [3], [4], and [1,4].
  The strictly decreasing subarrays of nums are [1], [2], [3], [3], [4], [3,2], and [4,3].
  Hence, we return 2.

  Example 2:
  Input: nums = [3,3,3,3]
  Output: 1
  Explanation:
  The strictly increasing subarrays of nums are [3], [3], [3], and [3].
  The strictly decreasing subarrays of nums are [3], [3], [3], and [3].
  Hence, we return 1.

  Example 3:
  Input: nums = [3,2,1]
  Output: 3
  Explanation:
  The strictly increasing subarrays of nums are [3], [2], and [1].
  The strictly decreasing subarrays of nums are [3], [2], [1], [3,2], [2,1], and [3,2,1].
  Hence, we return 3.

*/

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        /*int b = nums[0], cb = 1;
        int s = nums[0], cs = 1;
        int count = 1;
        for(int n: nums){
            if(n>b)cb++;
            else{
                cb = 1;
            }
            if(n<s)cs++;
            else{
                cs = 1;
            }
            b = s = n;*/
            /*if(cb > count){
                count = cb;
            }else if(cs > count){
                count = cs;
            }*/
        /*    count = Math.max(count, Math.max(cb,cs));
        }
        return count;*/
        int countInc = 1, countDec = 1, count = 1;
        for(int i =1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                countInc++;
                countDec = 1;
            }else if(nums[i] < nums[i-1]){
                countInc = 1;
                countDec++;
            }else{
                //countInc = countDec = 1;
                countInc = 1;
                countDec = 1;
            }
            count = Math.max(count, Math.max(countInc,countDec));
        }
        return count;
    }
}

/*

>[1,10,10]
2

*/
