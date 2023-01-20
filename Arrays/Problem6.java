/*

    Remove Element
    Given an integer array nums and an integer val,
    remove all occurrences of val in nums in-place.

    Example 1:
    Input: nums = [3,2,2,3], val = 3
    Output: 2, nums = [2,2,_,_]
    Example 2:
    Input: nums = [0,1,2,2,3,0,4,2], val = 2
    Output: 5, nums = [0,1,4,0,3,_,_,_]

*/

class Problem6 {
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val)
                count++;
        }
        for(int i=0,j=0; j<count;i++){
            if(nums[i] != val){
                nums[j++]=nums[i];
            }
        }
        return count;
    }
}