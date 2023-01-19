/*
    Single Number
    Given a non-empty array of integers nums,
    every element appears twice except for one.
    Find that single one.
*/

class Problem5 {
    public int singleNumber(int[] nums) {
        int num = nums[0];
        for(int i=1;i<nums.length;i++){
            num = nums[i] ^ num;
        }
        return num;
    }
}