/**

  P18: Check if a Parentheses String Can Be Valid
  Example 1:
  Input: s = "))()))", locked = "010100"
  Output: true
  Explanation: locked[1] == '1' and locked[3] == '1', so we cannot change s[1] or s[3].
  We change s[0] and s[4] to '(' while leaving s[2] and s[5] unchanged to make s valid.
  
  Example 2:
  Input: s = "()()", locked = "0000"
  Output: true
  Explanation: We do not need to make any changes because s is already valid.
  
  Example 3:
  Input: s = ")", locked = "0"
  Output: false
  Explanation: locked permits us to change s[0]. 
  Changing s[0] to either '(' or ')' will not make s valid.

*/
class Problem18{
    public boolean canBeValid(String s, String locked) {
        if((s.length()&1) == 1)
            return false;
        //Stack<Character> stack=new Stack<Character>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(locked.charAt(i)=='0' || s.charAt(i) == '(')
                count++;
            else{
                count--;
            }
            if(count<0)
                return false;
        }
        count = 0;
        for(int i=s.length()-1;i>-1;i--){
            if(locked.charAt(i)=='0' || s.charAt(i) == ')')
                count++;
            else
                count--;
            if(count < 0)
                return false;
        }
        return true;
    }
}

/*

>s = "())()))()(()(((())(()()))))((((()())(())"
>locked = "1011101100010001001011000000110010100101"
true
>s = ")"
>locked = "0"
false
>s = "))()))"
>locked = "010100"
true

*/
