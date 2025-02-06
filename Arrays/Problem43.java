/**

  P43: Tuple with Same Product
 
  Example 1:
  Input: nums = [2,3,4,6]
  Output: 8
  Explanation: There are 8 valid tuples:
  (2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
  (3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)
  
  Example 2:
  Input: nums  = [1,2,4,5,10]
  Output: 16
  Explanation: There are 16 valid tuples:
  (1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2)
  (2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1)
  (2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,5,4)
  (4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)

*/

class Problem43 {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length-1; i++){
            for(int j = i+1 ; j <nums.length; j++ ){
                int pro = nums[i]*nums[j];
                hm.put(pro, hm.getOrDefault(pro,0)+1);
            }
        }
        int res = 0;
        for(HashMap.Entry<Integer,Integer> map : hm.entrySet() ){
            int val = map.getValue();
            if(val>=2){
                res +=8*(val*(val-1)/2);
            }
        }
        /*for(int pro: hm.keySet()){
            res += 8*(hm.get(pro)*(hm.get(pro)-1)/2);
        }*/
        return res;
    }
}
