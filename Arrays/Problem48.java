/**

  P48: Plus One

  Example 1:
  Input: digits = [1,2,3]
  Output: [1,2,4]
  Explanation: The array represents the integer 123.
  Incrementing by one gives 123 + 1 = 124.
  Thus, the result should be [1,2,4].

  Example 2:
  Input: digits = [4,3,2,1]
  Output: [4,3,2,2]
  Explanation: The array represents the integer 4321.
  Incrementing by one gives 4321 + 1 = 4322.
  Thus, the result should be [4,3,2,2].
  
  Example 3:
  Input: digits = [9]
  Output: [1,0]
  Explanation: The array represents the integer 9.
  Incrementing by one gives 9 + 1 = 10.
  Thus, the result should be [1,0].

*/

class Problem48{
    public int[] plusOne(int[] digits) {
        int size = 0;
        if(digits[digits.length-1] < 9){
            digits[digits.length-1] += 1; 
            return digits;
        }
        StringBuilder s=new StringBuilder("");
        int carry = 1;
        for(int i = digits.length-1; i>-1; i--){
            s.append((digits[i]+carry)%10);
            carry = (digits[i]+carry)/10;            
        }
        if(carry>0){
            s.append(carry);
        }
        size = s.length();
        int ans[]=new int[size];
        for(int i = 0; i<s.length(); i++){
            ans[--size] = Integer.parseInt(""+s.charAt(i));
        }
        return ans;
    }
}

/*

Output: 
>digits = [9,8,7,6,5,4,3,2,1,0]
[9,8,7,6,5,4,3,2,1,1]

>[1,9]
[2,0]

*/
