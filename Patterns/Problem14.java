/**

n = 5
n = 5
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *

*/

import java.io.*;
class Problem14{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i =1; i <= num ; i++){
			for(int j = 1; j <= num; j++){
				if(i+j >= num+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
		for(int i = 2; i <= num ; i++){
			for(int j = 1; j <= num; j++){
				if(j>=i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem14.java

>java Problem14
>5
        *
      * *
    * * *
  * * * *
* * * * *
  * * * *
    * * *
      * *
        *

>java Problem14
>8
              *
            * *
          * * *
        * * * *
      * * * * *
    * * * * * *
  * * * * * * *
* * * * * * * *
  * * * * * * *
    * * * * * *
      * * * * *
        * * * *
          * * *
            * *
              *

*/