/**

n = 7

* * *   * * *
* *       * *
*           *

*           *
* *       * *
* * *   * * *

*/

import java.io.*;
class Problem17{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int temp = num / 2, space = 1;
		
		for(int i = temp; i>=1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			for(int j = 1; j<= space; j++){
				System.out.print("  ");
			}
			space+=2;
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("");
		for(int i = 1; i<=temp; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			space-=2;	
			for(int j = 1; j<= space; j++){
				System.out.print("  ");
			}		
			for(int j = 1; j<= i; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem17.java

>java Problem17
>7
* * *   * * *
* *       * *
*           *

*           *
* *       * *
* * *   * * *

>java Problem17
>8
* * * *   * * * *
* * *       * * *
* *           * *
*               *

*               *
* *           * *
* * *       * * *
* * * *   * * * *

*/