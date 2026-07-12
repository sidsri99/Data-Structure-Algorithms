/**

  P70: Rank Transform of an Array

  Example 1:
  Input: arr = [40,10,20,30]
  Output: [4,1,2,3]
  Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest.
  
  Example 2:
  Input: arr = [100,100,100]
  Output: [1,1,1]
  Explanation: Same elements share the same rank.

  Example 3:
  Input: arr = [37,12,28,9,100,56,80,5,12]
  Output: [5,3,4,2,8,6,7,1,3]

*/

class Problem70 {
    public int[] arrayRankTransform(int[] arr) {
        /* TLE
        int ans[]=new int[arr.length];
        Set<Integer> hs = new HashSet<>();
        for( int no : arr){
            hs.add(no);
        }
        List<Integer> al=new ArrayList<>(hs);
        Collections.sort(al);
        for(int i = 0; i<arr.length;i++){
            ans[i] = al.indexOf(arr[i]) + 1;
        }
        return ans;
        */
        int ans[] = new int[arr.length];
        //int ans[] = arr.clone();
        for(int i = 0 ; i<arr.length; i++){
            ans[i] = arr[i];
        }
        Arrays.sort(ans);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int rank = 1;
        //for(int i = 0; i < ans.length; i++){
        for(int num : ans){
            if(!hm.containsKey(num)){
                hm.put(num,rank++);
                //rank++;
            }
        }
        for(int i = 0; i<arr.length; i++){
            ans[i] = hm.get(arr[i]);
        }
        return ans;
    }
}
