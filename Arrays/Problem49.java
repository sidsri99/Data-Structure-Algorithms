/**

  P49: Reverse Integer

  Example 1:0
  Input: x = 123
  Output: 321

  Example 2:
  Input: x = -123
  Output: -321

  Example 3:
  Input: x = 120
  Output: 21

*/

class Problem49{
    public int reverse(int x) {
        /*boolean neg = false;
        if(x<0){
            neg = true;
            x *= -1;
        }
        StringBuilder s=new StringBuilder(""+x);
        s=s.reverse();
        try{
            x = Integer.parseInt(s.toString());
            if(neg == true)x *= -1;
            return x;
        //if((""+s.charAt(s.length()-1)).equals(""+(x%10))){
            //return x;
        }
        catch(Exception e){
            return 0;
        }*/
        long num = 0;
        int tmp = x;
        while(tmp !=0){
            num = 10*num +tmp%10;
            tmp /= 10;  
        }
        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE){
            return 0;
        }
        return (int)num;
    }
}
