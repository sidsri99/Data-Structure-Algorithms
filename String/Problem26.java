/**

P26 Divide a String Into Groups of Size k
Example 1:
Input: s = "abcdefghi", k = 3, fill = "x"
Output: ["abc","def","ghi"]
Explanation:
The first 3 characters "abc" form the first group.
The next 3 characters "def" form the second group.
The last 3 characters "ghi" form the third group.
Since all groups can be completely filled by characters from the string, we do not need to use fill.
Thus, the groups formed are "abc", "def", and "ghi".

Example 2:
Input: s = "abcdefghij", k = 3, fill = "x"
Output: ["abc","def","ghi","jxx"]
Explanation:
Similar to the previous example, we are forming the first three groups "abc", "def", and "ghi".
For the last group, we can only use the character 'j' from the string. To complete this group, we add 'x' twice.
Thus, the 4 groups formed are "abc", "def", "ghi", and "jxx".

*/

class Problem26 {
    public String[] divideString(String s, int k, char fill) {
        List<String> ls = new ArrayList<>();
        for(int i = 0; i<s.length();i+=k){
            StringBuilder tmp =new StringBuilder("");
            int j = Math.min(s.length(),i+k);
            tmp = tmp.append(s.substring(i,j));
            while(tmp.length() < k){
                tmp= tmp.append(fill);
            }
            ls.add(tmp.toString());
        }
        return ls.toArray(new String[0]);
    }
}
