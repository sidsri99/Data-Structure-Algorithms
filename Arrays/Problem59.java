/**

  P59: Total Characters in String After Transformations I

  Example 1:
  Input: s = "abcyy", t = 2
  Output: 7
  Explanation:
  First Transformation (t = 1):
  'a' becomes 'b'
  'b' becomes 'c'
  'c' becomes 'd'
  'y' becomes 'z'
  'y' becomes 'z'
  String after the first transformation: "bcdzz"
  Second Transformation (t = 2):
  'b' becomes 'c'
  'c' becomes 'd'
  'd' becomes 'e'
  'z' becomes "ab"
  'z' becomes "ab"
  String after the second transformation: "cdeabab"
  Final Length of the string: The string is "cdeabab", which has 7 characters.

  Example 2:
  Input: s = "azbk", t = 1
  Output: 5
  Explanation:
  First Transformation (t = 1):
  'a' becomes 'b'
  'z' becomes "ab"
  'b' becomes 'c'
  'k' becomes 'l'
  String after the first transformation: "babcl"
  Final Length of the string: The string is "babcl", which has 5 characters.

*/

class Problem59 {
    public int lengthAfterTransformations(String s, int t) {
        int count[]=new int[26];
        for(char ch: s.toCharArray()){
            count[ch-97] += 1;
        }
        for(int i =0; i<t; i++){
            int after[]=new int[26];
            after[0] = count[25];
            after[1] = (count[0]+count[25])  % 1000000007;
            for(int j=2; j<26;j++){
                after[j] = count[j-1];
            }
            count = after; 
        }
        int ans = 0;
        for(int i:count){
            ans = (ans + i) % 1000000007;
        }
        return ans;
    }
}

/*

Input
s =
"jqktcurgdvlibczdsvnsg"
t =
7517
Output
79033769

*/
