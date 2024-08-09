/**

n = 5
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *

*/

import java.io.*;
class Problem22{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = -1;
		
		for(int i = num; i>= 1; i--){
			for(int j = 1; j<=i; j++){
				System.out.print("* ");
			}
			for(int j = 1; j<=space; j++ ){
				System.out.print("  ");
			}
			space += 2;
			for(int j = 1; j<=i; j++){
				if(i == num && j == num);
				else
					System.out.print("* ");
			}
			
			System.out.println("");
		}
		
	}
}


/**

>javac Problem22.java

>java Problem22
>5
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *

>java Problem22
>15
* * * * * * * * * * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * *   * * * * * * * * * * * * * *
* * * * * * * * * * * * *       * * * * * * * * * * * * *
* * * * * * * * * * * *           * * * * * * * * * * * *
* * * * * * * * * * *               * * * * * * * * * * *
* * * * * * * * * *                   * * * * * * * * * *
* * * * * * * * *                       * * * * * * * * *
* * * * * * * *                           * * * * * * * *
* * * * * * *                               * * * * * * *
* * * * * *                                   * * * * * *
* * * * *                                       * * * * *
* * * *                                           * * * *
* * *                                               * * *
* *                                                   * *
*                                                       *

>java Problem22
>8
* * * * * * * * * * * * * * *
* * * * * * *   * * * * * * *
* * * * * *       * * * * * *
* * * * *           * * * * *
* * * *               * * * *
* * *                   * * *
* *                       * *

*/