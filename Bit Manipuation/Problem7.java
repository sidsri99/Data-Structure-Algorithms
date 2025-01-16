/**

  P7: Bitwise XOR of All Pairings

  Example 1:
  Input: nums1 = [2,1,3], nums2 = [10,2,5,0]
  Output: 13
  Explanation:
  A possible nums3 array is [8,0,7,2,11,3,4,1,9,1,6,3].
  The bitwise XOR of all these numbers is 13, so we return 13.
  
  Example 2:
  Input: nums1 = [1,2], nums2 = [3,4]
  Output: 0
  Explanation:
  All possible pairs of bitwise XORs are nums1[0] ^ nums2[0], nums1[0] ^ nums2[1], nums1[1] ^ nums2[0],
  and nums1[1] ^ nums2[1].
  Thus, one possible nums3 array is [2,5,1,6].
  2 ^ 5 ^ 1 ^ 6 = 0, so we return 0.

*/

class Problem7 {
    public int xorAllNums(int[] nums1, int[] nums2) {
        /*int ans = 0;
        for(int i:nums1){
            for(int j:nums2){
                ans ^= (i^j); 
            }
        }
        return ans;
        */
        int ans = 0;
        if((nums2.length & 1) == 1){
            for(int i:nums1){
                ans ^= i;
            }
        }
        if((nums1.length & 1) == 1){
            for(int i:nums2){
                ans ^= i;
            }
        }
        return ans;
    }
}
/*
If nums2 length is odd, each element in nums1 appears odd times in final result
If nums1 length is odd, each element in nums2 appears odd times in final result
*/



