/**

n = 5
    *
   * *
  * * *
 * * * *
* * * * *

*/

import java.io.*;
class Problem11{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i = 1; i <= num ; i++){
			for(int j = 1; j <= num; j++){
				if( (i+j) >= num && (i+j)%2 == 0){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			for(int j = 1; j < i ; j++){
				if((i+j)% 2 != 0)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem11.java

>java Problem11
>5
        *
      *   *
    *   *   *
  *   *   *   *
*   *   *   *   *

>java Problem11
>7
            *
          *   *
        *   *   *
      *   *   *   *
    *   *   *   *   *
  *   *   *   *   *   *
*   *   *   *   *   *   *

*/