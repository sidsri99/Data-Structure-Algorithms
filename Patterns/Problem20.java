/**

n = 7
      *
    *   *
  *       *
*           *
  *       *
    *   *
      *

*/

import java.io.*;
class Problem20{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int spacemid = -1, space = num/2;
		
		for(int i = 1; i<= num; i++){
			
			for(int j = 1; j<=space; j++){
				System.out.print("  ");
			}
			System.out.print("* ");
			for(int j = 1;j<=spacemid;j++){
				System.out.print("  ");
			}
			if(i == 1 || i == num);
			else{
				System.out.print("* ");
			}
			if(i<=num/2){
				space--;
				spacemid+=2;
			}else if(i>num/2){
				space++;
				spacemid-=2;
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem20.java

>java Problem20
7
      *
    *   *
  *       *
*           *
  *       *
    *   *
      *

>java Problem20
15
              *
            *   *
          *       *
        *           *
      *               *
    *                   *
  *                       *
*                           *
  *                       *
    *                   *
      *               *
        *           *
          *       *
            *   *
              *

*/