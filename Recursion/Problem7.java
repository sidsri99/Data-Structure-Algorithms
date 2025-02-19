/**

  P7: The k-th Lexicographical String of All Happy Strings of Length n

  Example 1:
  Input: n = 1, k = 3
  Output: "c"
  Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".
  
  Example 2:
  Input: n = 1, k = 4
  Output: ""
  Explanation: There are only 3 happy strings of length 1.
  
  Example 3:
  Input: n = 3, k = 9
  Output: "cab"
  Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"

*/

class Problem7{
    int count = 0;
    public String check(char[] ch, int n, int k, StringBuilder s){
        if(s.length() == n){
            count++;
            if(k == count){
                return s.toString();
            }
            else if(count < k){
                return "";
            }
            return "";
        }
        for(int i = 0 ; i < 3; i++){
            if((s.length() == 0) || (ch[i] != s.charAt(s.length()-1))){
                s.append(ch[i]);
                String ans = check(ch,n,k,s);
                if(!ans.equals(""))
                    return ans;
                s.deleteCharAt(s.length()-1);
            }
        }
        return "";
    }
    public String getHappyString(int n, int k){
        char ch[]={'a','b','c'};
        //ArrayList<String> al=new ArrayList<String>();
        return check(ch,n,k, new StringBuilder(""));
    }
}

/*

*/
