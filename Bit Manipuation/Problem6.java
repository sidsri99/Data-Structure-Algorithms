/*
  P6: Minimize XOR

  Example 1:
  Input: num1 = 3, num2 = 5
  Output: 3
  Explanation:
  The binary representations of num1 and num2 are 0011 and 0101, respectively.
  The integer 3 has the same number of set bits as num2, and the value 3 XOR 3 = 0 is minimal.

  Example 2:
  Input: num1 = 1, num2 = 12
  Output: 3
  Explanation:
  The binary representations of num1 and num2 are 0001 and 1100, respectively.
  The integer 3 has the same number of set bits as num2, and the value 3 XOR 1 = 2 is minimal.
  
*/

class Problem7 {
    public int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2);
        int ans=num1, setBits= Integer.bitCount(num1);

        int tmp =1;
        while(setBits > count){
            if((tmp & ans) == tmp){
                setBits--;
                ans = ans & ~tmp;
            }
            tmp = tmp<<1;
        }
        tmp = 0;
        while(setBits < count){
            if((ans & (1<<tmp)) == 0){
                ans = ans | (1<<tmp);
                setBits++;
            }
            tmp++;
        }
        return ans;
    }
}

/*

>num1=8
>num2=75
15

*/
