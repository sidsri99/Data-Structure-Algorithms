/*
  P52: Count Good Triplets

  Example 1:
  Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
  Output: 4
  Explanation: There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)].
  
  Example 2:
  Input: arr = [1,1,2,2,3], a = 0, b = 0, c = 1
  Output: 0
  Explanation: No triplet satisfies all conditions.

*/

class Problem52 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count=0;
        for(int i=0; i<arr.length-2; i++){
            for(int j = i+1; j<arr.length-1; j++){
                if(Math.abs(arr[i]-arr[j]) <= a){
                    for(int k=j+1; k<arr.length; k++){
                        if((Math.abs(arr[j]-arr[k]) <= b) && (Math.abs(arr[i]-arr[k]) <= c))
                            count++;
                    }
                }
                
            }
        }
        return count++;
    }
}
