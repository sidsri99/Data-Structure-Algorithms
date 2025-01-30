/**

  P6: Flood Fill
  
  Example 1:
  Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
  Output: [[2,2,2],[2,2,0],[2,0,1]]
  Explanation:
  From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
  Note the bottom corner is not colored 2, because it is not horizontally or vertically connected to the starting pixel.

  Example 2:
  Input: image = [[0,0,0],[0,0,0]], sr = 0, sc = 0, color = 0
  Output: [[0,0,0],[0,0,0]]
  Explanation:
  The starting pixel is already colored with 0, which is the same as the target color. Therefore, no changes are made to the image.

*/

class Problem6 {
    public void fill(int[][] image, boolean[][] visited, int r, int c, int col, int val){
        if((r<0) || (c<0) || (r == image.length) || (c == image[0].length) || 
           (image[r][c] != val) || (visited[r][c] == true)){
            return;
        }
        visited[r][c] = true;
        image[r][c] = col;
        fill(image,visited,r+1,c,col,val);
        fill(image,visited,r-1,c,col,val);
        fill(image,visited,r,c+1,col,val);
        fill(image,visited,r,c-1,col,val);
        return;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean visited[][] = new boolean[image.length][image[0].length];
        fill(image,visited,sr,sc,color,image[sr][sc]);
        return image;
    }
}

/*


*/
