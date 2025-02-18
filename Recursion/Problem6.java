/**

  P6: Construct Smallest Number From DI String
 
  Example 1:
  Input: pattern = "IIIDIDDD"
  Output: "123549876"
  Explanation:
  At indices 0, 1, 2, and 4 we must have that num[i] < num[i+1].
  At indices 3, 5, 6, and 7 we must have that num[i] > num[i+1].
  Some possible values of num are "245639871", "135749862", and "123849765".
  It can be proven that "123549876" is the smallest possible num that meets the conditions.
  Note that "123414321" is not possible because the digit '1' is used more than once.
  
  Example 2:
  Input: pattern = "DDD"
  Output: "4321"
  Explanation:
  Some possible values of num are "9876", "7321", and "8742".
  It can be proven that "4321" is the smallest possible num that meets the conditions.

*/

class Problem6{
    public boolean stringDI(String pattern,int last, int index, StringBuilder ans, boolean[] visited){
        if(ans.length() == pattern.length()+1){
            return true;
        }
        if(index>=pattern.length())
            return false;
        if(pattern.charAt(index) == 'I'){
            for(int i = last+1; i<10; i++){
                if(!visited[i]){
                    visited[i] = true;
                    ans.append(i);
                    if(stringDI(pattern,i,index+1,ans,visited)){
                        return true;
                    }
                    visited[i] = false;
                    ans.deleteCharAt(ans.length()-1);
                }
            }
        }else{
            for(int i = 1; i<last; i++){
                if(!visited[i]){
                    visited[i] = true;
                    ans.append(i);
                    if(stringDI(pattern,i,index+1,ans,visited)){
                        return true;
                    }
                    visited[i] = false;
                    ans.deleteCharAt(ans.length()-1);
                }
            }
        }
        return false;
    }
    public String smallestNumber(String pattern) {
        StringBuilder ans=new StringBuilder("");
        /* Backtracking solution
        for(int i = 1 ; i < 10; i++){
            boolean visited[]=new boolean[10];
            ans.append(i);
            visited[i] = true;
            if(stringDI(pattern,i,0,ans,visited)){
                return ans.toString();
            }
            visited[i] = false;
            ans.deleteCharAt(ans.length()-1);
        }*/
        //Optimized Solution using Stack
        Stack<Integer> stack=new Stack<Integer>();
        int n = pattern.length();
        for(int i = 1; i <= n+1; i++){
            stack.push(i);
            if((i == n+1) || (pattern.charAt(i-1) == 'I')){
                while(!stack.isEmpty()){
                    ans.append(stack.pop());
                }
            }
        }
        return ans.toString();
    }
}

/*

*/
