/**

  P21: Clear Digits
  
  Example 1:
  Input: s = "abc"
  Output: "abc"
  Explanation:
  There is no digit in the string.

  Example 2:
  Input: s = "cb34"
  Output: ""
  Explanation:
  First, we apply the operation on s[2], and s becomes "c4".
  Then we apply the operation on s[1], and s becomes "".

*/

class Problem21 {
    public String clearDigits(String s) {
        /*Stack<Character> stack=new Stack<Character>();
        //String ans = "";
        //StringBuffer ans = new StringBuffer();
        StringBuilder ans = new StringBuilder("");
        //for(int i = 0; i<s.length(); i++){
        for(char ch: s.toCharArray()){
            //char ch = s.charAt(i);
            //if(ch>= '0' & ch <= '9'){
            if(Character.isDigit(ch)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(ch);
            } 
        }
        while(!stack.isEmpty()){
            //ans = ans + stack.pop();
            ans.append(stack.pop());
        }
        return ans.reverse().toString();*/
        StringBuilder ans=new StringBuilder("");
        int index = -1;
        for(char ch: s.toCharArray()){
            if(Character.isDigit(ch)){
                ans.deleteCharAt(index);
                index--;
            }else{
                ans.append(ch);
                index++;
            }
        }
        return ans.toString();
    }
}
