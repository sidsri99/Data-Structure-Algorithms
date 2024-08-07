/**

n = 7
      *
    * * *
  * * * * *
* * * * * * *
  * * * * *
    * * *
      *

*/

import java.io.*;
class Problem18{
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int space = num/2, star = 1;
		
		for(int i = 1; i<= num; i++){
			for(int j = 1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j = 1; j<=star; j++){
				System.out.print("* ");
			}
			if(i<=num/2){
				space--;
				star+=2;
			}else if(i>num/2){
				space++;
				star-=2;
			}
			System.out.println("");
		}
		
	}
}


/**



*/