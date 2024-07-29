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
class Problem15{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=num; i++){
			int temp = (i-1)*2;
			for(int j = 1; j <= temp; j++){
				System.out.print("  ");
			}
			for(int j = num; j>= i; j--){
				System.out.print("* ");
			}
			System.out.println("");
		}
		for(int i = num-1; i>=1; i--){
			int temp = (i-1)*2;
			for(int j = 1; j <= temp; j++){
				System.out.print("  ");
			}
			for(int j = i; j<= num; j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem15.java

>java Problem15
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

>java Problem15
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

>java Problem15
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