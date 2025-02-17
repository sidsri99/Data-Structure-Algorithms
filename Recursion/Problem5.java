/**

  P5: Letter Tile Possibilities

  Example 1:
  Input: tiles = "AAB"
  Output: 8
  Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".

  Example 2:
  Input: tiles = "AAABBC"
  Output: 188
  
  Example 3:
  Input: tiles = "V"
  Output: 1

*/

class Problem5{
    int count = 0;
    //public void count(char[] ch, HashSet<String> hs, boolean[] visited, StringBuilder s){
    public void count(char[] ch, boolean[] visited){
        /*if(s.length()>0){
            hs.add(s.toString());
        }*/
        count++;
        for(int i = 0; i < ch.length; i++){
          //to prevent generating duplicate subsequences
            if(visited[i] == true || 
                (i>0 && ch[i]==ch[i-1] && 
                !visited[i-1])){
                continue;
            }
            visited[i] = true;
            //s.append(ch[i]);
            //count(ch, hs, visited, s);
            count(ch,visited);
            //s.deleteCharAt(s.length()-1);
            visited[i] = false;
        }
    }
    public int numTilePossibilities(String tiles) {
        char ch[]=tiles.toCharArray();
        Arrays.sort(ch);
        boolean visited[]=new boolean[tiles.length()];
        //HashSet<String> hs = new HashSet<String>();
        //StringBuilder s=new StringBuilder("");
        //count(ch, hs, visited, s);
        count(ch,visited);
        return count-1;
        //return hs.size();
    }
}
