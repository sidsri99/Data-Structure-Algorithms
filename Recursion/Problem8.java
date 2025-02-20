/**

  P8: Find Unique Binary String

  Example 1:
  Input: nums = ["01","10"]
  Output: "11"
  Explanation: "11" does not appear in nums. "00" would also be correct.
  
  Example 2:
  Input: nums = ["00","01"]
  Output: "11"
  Explanation: "11" does not appear in nums. "10" would also be correct.

  Example 3:
  Input: nums = ["111","011","001"]
  Output: "101"
  Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.

*/

class Solution {
    public boolean getString(String[] nums, int ind, int len, StringBuilder s, HashSet<String> hs){
        if(ind == len){
            if(hs.contains(s.toString())){
                return false;
            }
            return true;
        }
            s.append("0");
            if(getString(nums,ind+1,len,s,hs))return true;
            s.deleteCharAt(s.length()-1);
            s.append("1");
            if(getString(nums,ind+1,len,s,hs))return true;
            s.deleteCharAt(s.length()-1);
            return false;
    }
    public String findDifferentBinaryString(String[] nums) {
        
        HashSet<String> hs=new HashSet<String>();
        int len = nums[0].length();
        StringBuilder s=new StringBuilder("");
        for(String str: nums){
            hs.add(str);
        }
        getString(nums,0,len,s,hs);
        return s.toString();

        /*Faster : Cantor's Diagonal Argument
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            Character curr = nums[i].charAt(i);
            ans.append(curr == '0' ? '1' : '0');
        }
        return ans.toString();*/

    }
}

/*

>nums = ["11","00"]
01
>nums = ["11","01"]
00

*/
