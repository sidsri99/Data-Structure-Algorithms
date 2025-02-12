/**

  P46: Max Sum of a Pair With Equal Sum of Digits
  Example 1:
  Input: nums = [18,43,36,13,7]
  Output: 54
  Explanation: The pairs (i, j) that satisfy the conditions are:
  - (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
  - (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
  So the maximum sum that we can obtain is 54.
  
  Example 2:
  Input: nums = [10,12,19,14]
  Output: -1
  Explanation: There are no two numbers that satisfy the conditions, so we return -1.

*/

class Problem46 {
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int max = -1;
        for(int n:nums){
            int sum = 0,tmp = n;
            while(tmp>0){
                sum += tmp%10;
                tmp /= 10;
            }
            if(hm.containsKey(sum)){
                max = Math.max(max,hm.get(sum)+n);
                if(hm.get(sum)<n){
                    hm.put(sum,n);
                }
            }else{
                hm.put(sum,n);
            }
        }
        return max;
    }
}

/*

>[229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401]
973

*/
