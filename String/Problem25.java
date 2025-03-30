/**

  P25: Partition Labels
  
  Example 1:
  Input: s = "ababcbacadefegdehijhklij"
  Output: [9,7,8]
  Explanation:
  The partition is "ababcbaca", "defegde", "hijhklij".
  This is a partition so that each letter appears in at most one part.
  A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts.
  
  Example 2:
  Input: s = "eccbbbbdec"
  Output: [10]

*/

class Problem25 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> al=new ArrayList<>();
        int last[]= new int[26];
        int counter = 0;
        for(char ch : s.toCharArray()){
            last[ch-97] = counter;
            counter += 1;
        }
        counter = 0;
        int pos = 0;
        for(int i=0; i<s.length();i++){
            pos = Math.max(last[s.charAt(i)-97],pos);
            if(pos == i){
                al.add(i-counter+1);
                counter = i+1;
            }
        }
        return al;

        /*List<Integer> al = new ArrayList<>();
        while(s.length()!=0){
            char ch = s.charAt(0);
            int last = s.lastIndexOf(ch);
            for(int i = 1; i <= last; i++){
                ch = s.charAt(i);
                last = Math.max(last, s.lastIndexOf(ch));
                if(last == s.length()-1){break;}
            }
            al.add(last-0+1);
            s = s.substring(last+1);
        }
        return al;*/
    }
}
