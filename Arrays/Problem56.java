/**

  P56: Minimum Equal Sum of Two Arrays After Replacing Zeros
  
  Example 1:
  Input: nums1 = [3,2,0,1,0], nums2 = [6,5,0]
  Output: 12
  Explanation: We can replace 0's in the following way:
  - Replace the two 0's in nums1 with the values 2 and 4. The resulting array is nums1 = [3,2,2,1,4].
  - Replace the 0 in nums2 with the value 1. The resulting array is nums2 = [6,5,1].
  Both arrays have an equal sum of 12. It can be shown that it is the minimum sum we can obtain.
  
  Example 2:
  Input: nums1 = [2,0,2,0], nums2 = [1,4]
  Output: -1
  Explanation: It is impossible to make the sum of both arrays equal.
  
*/

class Problem56 {
    public long minSum(int[] nums1, int[] nums2) {
        long suma = 0, sumb = 0;
        int flag1 = 0, flag2 = 0;
        for(int n:nums1){
            if(n == 0){
                flag1 += 1;
            }
            suma += n;
        }
        for(int n:nums2){
            if(n == 0){
                flag2 += 1;
            }
            sumb += n;
        }
        if(flag1 == 0 && flag2 == 0 && suma == sumb){
            return suma;
        }else if(flag1 != 0 && flag2 != 0){
            return (Math.max(suma+flag1,sumb+flag2));
        }
        else if(flag1 != 0 && (sumb >= (suma+flag1))){
            return sumb;
        }else if(flag2 != 0 && (suma >= (sumb+flag2))){
            return suma;
        }else
            return -1;
    }
}

/*

Input
nums1 =
[0,17,20,17,5,0,14,19,7,8,16,18,6]
nums2 =
[21,1,27,19,2,2,24,21,16,1,13,27,8,5,3,11,13,7,29,7]
Output
257

*/
