/**

n = 5
* * * * *
  * * * *
    * * *
      * *
        *

*/

import java.io.*;
class Problem5{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= num; j++){
				if( j < i ){
					System.out.print("  ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem5.java

>java Problem5
>5
* * * * *
  * * * *
    * * *
      * *
        *

>java Problem5
>7
* * * * * * *
  * * * * * *
    * * * * *
      * * * *
        * * *
          * *
            *

*/