/**

  P9: Check if Number is a Sum of Powers of Three
  Example 1:
  Input: n = 12
  Output: true
  Explanation: 12 = 31 + 32
  
  Example 2:
  Input: n = 91
  Output: true
  Explanation: 91 = 30 + 32 + 34

  Example 3:
  Input: n = 21
  Output: false

*/

class Problem9 {
    public boolean check(int n, int sum, int i){
        
        if(sum == n){
            return true;
        }
        else if(sum > n || ((int)(Math.pow(3,i))>n)){
            return false;
        }
        boolean exclude = check(n,sum,i+1);
        if(exclude == true)
            return true;
        boolean include = check(n,(sum+(int)Math.pow(3,i)),i+1);
        return include;
        
    }
    public boolean checkPowersOfThree(int n) {
        //return check(n,0,0); //brute force

        int i = 0;
        while(Math.pow(3,i) <= n){
            i++;
        }
        while(n>0){
            if(Math.pow(3,i)<= n){
                n -= (int) Math.pow(3,i);
            }
            if(Math.pow(3,i) <= n){
                return false;
            }
            i -= 1;
        }
        return true;
    /*
     while (n > 0) {
            // Check if this power should be used twice
            if (n % 3 == 2) {
                return false;
            }
            // Divide n by 3 to move to the next greater power
            n /= 3;
        }
        // The ternary representation of n consists only of 0s and 1s
        return true;
    */

    }
}
