/**

n = 5
        * * * * *
      * * * *
    * * *
  * *
*
  * *
    * * *
      * * * *
        * * * * *

*/

import java.io.*;
class Problem16{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = num; i>=1; i--){
			for(int j = 1; j <= i; j++){
				System.out.print("  ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		for(int i = 2; i<=num; i++){
			for(int j = 1; j <= i; j++){
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

>javac Problem16.java

>java Problem16
>5
          * * * * *
        * * * *
      * * *
    * *
  *
    * *
      * * *
        * * * *
          * * * * *

>java Problem16
>7
              * * * * * * *
            * * * * * *
          * * * * *
        * * * *
      * * *
    * *
  *
    * *
      * * *
        * * * *
          * * * * *
            * * * * * *
              * * * * * * *

>java Problem16
>8
                * * * * * * * *
              * * * * * * *
            * * * * * *
          * * * * *
        * * * *
      * * *
    * *
  *
    * *
      * * *
        * * * *
          * * * * *
            * * * * * *
              * * * * * * *
                * * * * * * * *

*/