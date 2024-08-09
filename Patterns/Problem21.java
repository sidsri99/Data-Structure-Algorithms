/**

n = 5
*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *

*/

import java.io.*;
class Problem21{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = num+num-1-2;
		
		for(int i = 1; i<= num; i++){
			for(int j = 1; j<=i; j++){
				System.out.print("* ");
			}
			for(int j = 1; j<=space; j++ ){
				System.out.print("  ");
			}
			space -= 2;
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

>javac Problem21.java

>java Problem21
>5
*               *
* *           * *
* * *       * * *
* * * *   * * * *
* * * * * * * * *

>java Problem21
>15
*                                                       *
* *                                                   * *
* * *                                               * * *
* * * *                                           * * * *
* * * * *                                       * * * * *
* * * * * *                                   * * * * * *
* * * * * * *                               * * * * * * *
* * * * * * * *                           * * * * * * * *
* * * * * * * * *                       * * * * * * * * *
* * * * * * * * * *                   * * * * * * * * * *
* * * * * * * * * * *               * * * * * * * * * * *
* * * * * * * * * * * *           * * * * * * * * * * * *
* * * * * * * * * * * * *       * * * * * * * * * * * * *
* * * * * * * * * * * * * *   * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * * * * * * * * * *

>java Problem21
>8
*                           *
* *                       * *
* * *                   * * *
* * * *               * * * *
* * * * *           * * * * *
* * * * * *       * * * * * *
* * * * * * *   * * * * * * *
* * * * * * * * * * * * * * *

*/