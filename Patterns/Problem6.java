/**

n = 5
* * * * *
    * * * *
        * * *
            * *
                *

*/

import java.io.*;
class Problem6{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i = 1; i <= num; i++){
			for(int k = 1; k< i;k++)
					System.out.print("    ");
			for(int j = i; j <= num; j++){
				System.out.print("* ");	
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem6.java

>java Problem6
5
* * * * *
    * * * *
        * * *
            * *
                *

>java Problem6
7
* * * * * * *
    * * * * * *
        * * * * *
            * * * *
                * * *
                    * *
                        *

*/