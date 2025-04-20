/**

  P54: Rabbits in Forest
  Example 1:
  Input: answers = [1,1,2]
  Output: 5
  Explanation:
  The two rabbits that answered "1" could both be the same color, say red.
  The rabbit that answered "2" can't be red or the answers would be inconsistent.
  Say the rabbit that answered "2" was blue.
  Then there should be 2 other blue rabbits in the forest that didn't answer into the array.
  The smallest possible number of rabbits in the forest is therefore 5: 3 that answered plus 2 that didn't.
  
  Example 2:
  Input: answers = [10,10,10]
  Output: 11

*/

class Solution {
    public int numRabbits(int[] answers) {
        int count = 0;
        Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i : answers){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> map: hm.entrySet()){
            int key = map.getKey();
            int val = map.getValue();
            count += Math.ceil((double)val/(key+1))*(key+1);
            //int add = (val+key)/(key+1);
            //count +=  add*(key+1); 
        }
        return count;
    }
}
/*
Input
answers =
[0,3,2,0,3,3,4,2,4,3,2,4,4,3,0,1,3,4,4,3]
Output
26
*/
