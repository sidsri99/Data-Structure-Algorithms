/**

n = 5
    *
   *!*
  *!*!*
 *!*!*!*
*!*!*!*!*

*/

import java.io.*;
class Problem12{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		num = Integer.parseInt(br.readLine());
		for(int i = 1; i <= num ; i++){
			for(int j = 1; j <= num; j++){
				if( (i+j) > num ){
					if(num % 2 == 0 && (i+j)%2 == 1)
						System.out.print(" * ");
					else if(num % 2 != 0 && (i+j)%2 == 0)
						System.out.print(" * ");
					else
						System.out.print(" ! ");
				}else{
					System.out.print("   ");
				}
			}
			for(int j = 1; j < i ; j++){
				if((i+j)% 2 != 0)
					System.out.print(" * ");
				else
					System.out.print(" ! ");
			}
			System.out.println("");
		}
	}
}


/*

>javac Problem12.java

>java Problem12
>5
             *
          *  !  *
       *  !  *  !  *
    *  !  *  !  *  !  *
 *  !  *  !  *  !  *  !  *

>java Problem12
>7
                   *
                *  !  *
             *  !  *  !  *
          *  !  *  !  *  !  *
       *  !  *  !  *  !  *  !  *
    *  !  *  !  *  !  *  !  *  !  *
 *  !  *  !  *  !  *  !  *  !  *  !  *

>java Problem12
>8
                      *
                   *  !  *
                *  !  *  !  *
             *  !  *  !  *  !  *
          *  !  *  !  *  !  *  !  *
       *  !  *  !  *  !  *  !  *  !  *
    *  !  *  !  *  !  *  !  *  !  *  !  *
 *  !  *  !  *  !  *  !  *  !  *  !  *  !  *

*/