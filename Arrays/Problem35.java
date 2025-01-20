/**
  
  P35: First Completely Painted Row or Column

  Example 1:
  Input: arr = [1,3,4,2], mat = [[1,4],[2,3]]
  Output: 2
  Explanation: The moves are shown in order, and both the first row and second column of the matrix become fully painted at arr[2].
  
  Example 2:
  Input: arr = [2,8,7,4,1,3,5,6,9], mat = [[3,2,5],[1,4,6],[8,7,9]]
  Output: 3
  Explanation: The second column becomes fully painted at arr[3].
  
*/
class Problem35{
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int ind = 0;
        HashMap<Integer, int[]> hm=new HashMap<>();
        int row[]=new int[mat.length];
        int col[]=new int[mat[0].length];

        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                hm.put(mat[i][j], new int[]{i,j});
            }
        }
        for(int num: arr){
            int val[] = hm.get(num);
            row[val[0]]++;
            col[val[1]]++;
            if(row[val[0]]== mat[0].length || col[val[1]] == mat.length){
                return ind;
            }
            ind++;
        }
        return ind;
    }
}

/*

>arr = [1,4,5,2,6,3]
>mat = [[4,3,5],[1,2,6]]
1

*/
