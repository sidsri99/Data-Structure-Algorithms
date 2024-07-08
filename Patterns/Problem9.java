/**

n = 5
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/

import java.io.*;
class Problem9{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i = 1; i <= num ; i++){
			for(int j = 1; j <= num; j++){
				if( (i+j)>num ){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			for(int j = 1; j < i ; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem9.java

>java Problem9
>5
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

>java Problem9
>7
            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
  * * * * * * * * * * *
* * * * * * * * * * * * *

*/