/**

  P12: Shifting Letters II

  Example 1:
  Input: s = "abc", shifts = [[0,1,0],[1,2,1],[0,2,1]]
  Output: "ace"
  Explanation: Firstly, shift the characters from index 0 to index 1 backward. Now s = "zac".
  Secondly, shift the characters from index 1 to index 2 forward. Now s = "zbd".
  Finally, shift the characters from index 0 to index 2 forward. Now s = "ace".
  
  Example 2:
  Input: s = "dztz", shifts = [[0,0,0],[1,1,1]]
  Output: "catz"
  Explanation: Firstly, shift the characters from index 0 to index 0 backward. Now s = "cztz".
  Finally, shift the characters from index 1 to index 1 forward. Now s = "catz".

*/

class Problem12 {
    public String shiftingLetters(String s, int[][] shifts) {
        /*int size= s.length();
        int change[]=new int[size];
        for(int i = 0; i<shifts.length; i++){
            if(shifts[i][2]==1){
                for(int j=shifts[i][0];j<=shifts[i][1];j++){
                    change[j]++;
                }
            }else{
                for(int j=shifts[i][0];j<=shifts[i][1];j++){
                    change[j]--;
                }
            }
        }
        String ans="";
        for(int i=0;i<size;i++){
            if(change[i]==0){
                ans += s.charAt(i);
            }
            else{
                char ch = (char)(s.charAt(i)+(change[i]%26));
                if(ch>'z'){
                    ch = (char)('a' + ch - 'z' - 1);
                }
                if(ch<'a'){
                    ch = (char)('z'- 'a' + ch + 1);
                }
                ans += ch;
            }
        }*/
        //String ans="";
        StringBuilder ans=new StringBuilder();
        int dp[]=new int[s.length()+1];
        /*for(int i = 0; i<shifts.length;i++){
            if(shifts[i][2]==0){
                dp[shifts[i][0]] -= 1;
                dp[shifts[i][1]+1] += 1;
            }
            else{
                dp[shifts[i][0]] += 1;
                dp[shifts[i][1]+1] -= 1;
            }
        }*/
        for(int []arr : shifts){
            if(arr[2]==0){
                dp[arr[0]]--;
                dp[arr[1]+1]++;
            }else{
                dp[arr[0]]++;
                dp[arr[1]+1]--;
            }
        }
        for(int i=1;i<s.length();i++){
            dp[i] += dp[i-1];
        }
        for(int i=0;i<s.length();i++){
            char ch = (char)(s.charAt(i) + dp[i]%26);
            if(ch>'z')
                ch = (char)('a' + ch - 'z' - 1);
            if(ch<'a')
                ch = (char)('z'- 'a' + ch + 1);
            //ans += ch;
            ans.append(ch);
        }
        return ans.toString();
    }
}

/*



*/
