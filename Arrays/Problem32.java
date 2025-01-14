/**

  P32: Find the Prefix Common Array of Two Arrays

  Example 1:
  Input: A = [1,3,2,4], B = [3,1,2,4]
  Output: [0,2,3,4]
  Explanation: At i = 0: no number is common, so C[0] = 0.
  At i = 1: 1 and 3 are common in A and B, so C[1] = 2.
  At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.
  At i = 3: 1, 2, 3, and 4 are common in A and B, so C[3] = 4.
  
  Example 2:
  Input: A = [2,3,1], B = [3,1,2]
  Output: [0,1,3]
  Explanation: At i = 0: no number is common, so C[0] = 0.
  At i = 1: only 3 is common in A and B, so C[1] = 1.
  At i = 2: 1, 2, and 3 are common in A and B, so C[2] = 3.

*/



class Problem32 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        /*HashSet<Integer> hs=new HashSet<Integer>();
        int count = 0;
        int ans[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(hs.contains(A[i])){
                hs.remove(A[i]);
                count++;
            }else{
                hs.add(A[i]);
            }
            if(hs.contains(B[i])){
                hs.remove(B[i]);
                count++;
            }else{
                hs.add(B[i]);
            }
            ans[i] = count;
        }
        return ans;
        */
        int count = 0;
        int ans[]=new int[A.length];
        int freq[]=new int[A.length+1];
        for(int i=0; i<A.length; i++){
            if(++freq[A[i]] == 2)
                count++;
            if(++freq[B[i]] == 2)
                count++;
            ans[i] = count;
        }
        return ans;
    }
}
