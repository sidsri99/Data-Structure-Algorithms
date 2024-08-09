/**

n = 5
        1
	  2 0 2
	3 0 0 0 3
  4 0 0 0 0 0 4
5 0 0 0 0 0 0 0 5

*/

import java.io.*;
class Problem29{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = num-1;
		
		for(int i = 1; i<= num; i++){
			for(int j = 1; j<= num-i ; j++){
				System.out.print("  ");
			}
			for(int j = 1; j<=2*i-1; j++){
				if( j == 1 || j == 2*i-1)
					System.out.print(i+" ");
				else
					System.out.print("0 ");
			}
			System.out.println("");
		}
		
	}
}


/**

>javac Problem29.java

>java Problem29
>5
        1
      2 0 2
    3 0 0 0 3
  4 0 0 0 0 0 4
5 0 0 0 0 0 0 0 5

>java Problem29
>8
              1
            2 0 2
          3 0 0 0 3
        4 0 0 0 0 0 4
      5 0 0 0 0 0 0 0 5
    6 0 0 0 0 0 0 0 0 0 6
  7 0 0 0 0 0 0 0 0 0 0 0 7
8 0 0 0 0 0 0 0 0 0 0 0 0 0 8

*/