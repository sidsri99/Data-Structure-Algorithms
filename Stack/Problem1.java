/*
    Valid Parenthesis
    String contains only (){}[]
*/

class Problem1{
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if(stack.isEmpty() ||
             (s.charAt(i) == ')' && stack.pop() !='(') ||
             (s.charAt(i) == ']' && stack.pop() !='[') ||
             (s.charAt(i) == '}' && stack.pop() !='{'))
             {
                return false;
            }
        }
        if(stack.isEmpty())
        return true;
        return false;
    }
}

/*
    Not optimized
*/