/**

  P39: Check if Array Is Sorted and Rotated

  Example 1:
  Input: nums = [3,4,5,1,2]
  Output: true
  Explanation: [1,2,3,4,5] is the original sorted array.
  You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].

  Example 2:
  Input: nums = [2,1,3,4]
  Output: false
  Explanation: There is no sorted array once rotated that can make nums.
  
  Example 3:
  Input: nums = [1,2,3]
  Output: true
  Explanation: [1,2,3] is the original sorted array.
  You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

*/

class Problem39 {
    public boolean check(int[] nums) {
        int ind = 0,count=0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]<nums[i-1]){
                ind = i;
                count++;
            }
        }
        if((count>1)|| (ind != 0) && (ind < nums.length) && (nums[nums.length-1] > nums[0]))
            return false;
        return true;
    }
}

/*

>[2,7,4,1,2,6,2]
false

*/
