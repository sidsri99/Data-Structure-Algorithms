/**

  P24: Minimum Add to Make Parentheses Valid

  Example 1:
  Input: s = "())"
  Output: 1
  
  Example 2:
  Input: s = "((("
  Output: 3

*/

class Problem24 {
    public int minAddToMakeValid(String s) {
        int left = 0, right = 0;
        for(char ch: s.toCharArray()){
            if(ch == '('){
                right += 1;
            }else{
                right -= 1;
                if(right == -1){
                    right = 0;
                    left += 1;
                }
            }
        }
        return right+left;
        /*Stack<Character> stack = new Stack<Character>();
        int count = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                stack.push('(');
            }else{
                if(stack.isEmpty()){
                    count += 1;
                }else{
                    stack.pop();
                }
            }
        }
        count += stack.size();
        return count;*/
    }
}

/*
>()
0
>)))
3
*/
