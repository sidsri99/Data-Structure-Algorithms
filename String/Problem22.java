/**

  P22: Remove All Occurrences of a Substring

  Example 1:
  Input: s = "daabcbaabcbc", part = "abc"
  Output: "dab"
  Explanation: The following operations are done:
  - s = "daabcbaabcbc", remove "abc" starting at index 2, so s = "dabaabcbc".
  - s = "dabaabcbc", remove "abc" starting at index 4, so s = "dababc".
  - s = "dababc", remove "abc" starting at index 3, so s = "dab".
  Now s has no occurrences of "abc".
  
  Example 2:
  Input: s = "axxxxyyyyb", part = "xy"
  Output: "ab"
  Explanation: The following operations are done:
  - s = "axxxxyyyyb", remove "xy" starting at index 4 so s = "axxxyyyb".
  - s = "axxxyyyb", remove "xy" starting at index 3 so s = "axxyyb".
  - s = "axxyyb", remove "xy" starting at index 2 so s = "axyb".
  - s = "axyb", remove "xy" starting at index 1 so s = "ab".
  Now s has no occurrences of "xy".

*/

class Problem22 {
    public String removeOccurrences(String s, String part) {
        int size = part.length();
        /*StringBuilder ans=new StringBuilder("");
        for(char ch: s.toCharArray()){
            ans.append(ch);
            int tmp = ans.indexOf(part);
            if(tmp > -1){
                ans.delete(tmp, tmp+size);
            }
        }*/
        StringBuilder ans = new StringBuilder(s);
        while(ans.indexOf(part)>-1){
            int tmp = ans.indexOf(part);
            ans.delete(tmp,tmp+size);
        }
        return ans.toString();
    }
}

/*



*/
