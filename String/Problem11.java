/**
  P11: Unique Length-3 Palindromic Subsequences
  
  Example 1:
  Input: s = "aabca"
  Output: 3
  Explanation: The 3 palindromic subsequences of length 3 are:
  - "aba" (subsequence of "aabca")
  - "aaa" (subsequence of "aabca")
  - "aca" (subsequence of "aabca")

  Example 2:
  Input: s = "adc"
  Output: 0
  Explanation: There are no palindromic subsequences of length 3 in "adc".
  
  Example 3:
  Input: s = "bbcbaba"
  Output: 4
  Explanation: The 4 palindromic subsequences of length 3 are:
  - "bbb" (subsequence of "bbcbaba")
  - "bcb" (subsequence of "bbcbaba")
  - "bab" (subsequence of "bbcbaba")
  - "aba" (subsequence of "bbcbaba")
  
*/

class Problem11 {
    public void findSeq(String s, int start, int end, HashSet<String> hs){
        if(end-start<2)return;
        if(s.charAt(start) == s.charAt(end)){
            for(int i = start+1; i<end; i++){
                String tmp = "" + s.charAt(start) + s.charAt(i) + s.charAt(end); 
                hs.add(tmp);
            }
        }
        findSeq(s,start+1,end,hs);
        findSeq(s,start,end-1,hs);
        return;
    }
    public int countPalindromicSubsequence(String s) {
        //HashSet<String> hs=new HashSet<String>();
        //findSeq(s,0,s.length()-1,hs);
        int size = s.length();
        /*for(int i=0; i<size-2; i++){
            for(int j = i+2; j<size; j++){
                if(s.charAt(i) == s.charAt(j)){
                    for(int k = i+1; k<j; k++){
                        hs.add(""+s.charAt(i)+s.charAt(k)+s.charAt(j));
                    }
                }
            }
        }*/
        //return hs.size();
        int first[] = new int[26];
        int last[] = new int[26];
        int ans = 0;
        Arrays.fill(first,-1);  
        for(int i=0; i<size;i++){
            int ind = s.charAt(i)-97;
            if(first[ind] ==-1)
                first[ind] = i;
            last[ind] = i;
        }
        for(int i=0; i<26; i++){
            if(first[i] == -1)
                continue;
            HashSet<Character> hs=new HashSet<Character>();
            for(int j = first[i]+1; j<last[i]; j++){
                hs.add(s.charAt(j));
            }
            ans += hs.size();
        }
        return ans;
    }
}

/*

>tlpjzdmtwderpkpmgoyrcxttiheassztncqvnfjeyxxp
161
>bbcbaba
4
>adc
0
>aabca
3

*/
