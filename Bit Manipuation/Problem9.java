/**

  P9: Binary Prefix Divisible By 5

  Example 1:
  Input: nums = [0,1,1]
  Output: [true,false,false]
  Explanation: The input numbers in binary are 0, 01, 011; which are 0, 1, and 3 in base-10.
  Only the first number is divisible by 5, so answer[0] is true.
  
  Example 2:
  Input: nums = [1,1,1]
  Output: [false,false,false]

*/

class Problem9{
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<Boolean>();
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            num = (num * 2 + nums[i])%5;
            /*if(num%5 == 0){
                ans.add(true);
            }
            else{
                ans.add(false);
            }*/
            ans.add(num == 0);
        }
        return ans;
    }
}
