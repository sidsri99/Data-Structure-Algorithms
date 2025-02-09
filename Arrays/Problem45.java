/**

  P45: Count Number of Bad Pairs
  
  Example 1:
  Input: nums = [4,1,3,3]
  Output: 5
  Explanation: The pair (0, 1) is a bad pair since 1 - 0 != 1 - 4.
  The pair (0, 2) is a bad pair since 2 - 0 != 3 - 4, 2 != -1.
  The pair (0, 3) is a bad pair since 3 - 0 != 3 - 4, 3 != -1.
  The pair (1, 2) is a bad pair since 2 - 1 != 3 - 1, 1 != 2.
  The pair (2, 3) is a bad pair since 3 - 2 != 3 - 3, 1 != 0.
  There are a total of 5 bad pairs, so we return 5.
  
  Example 2:
  Input: nums = [1,2,3,4,5]
  Output: 0
  Explanation: There are no bad pairs.
  
*/

class Problem45 {
    public long countBadPairs(int[] nums) {
        long count = 0;
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length; i++){
            int dif = i - nums[i];
            int tmp = hm.getOrDefault(dif,0);
            count += (long)(i - tmp); 
            hm.put(dif,tmp+1);           
        }
        return count;
    }
}

