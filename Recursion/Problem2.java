/**
	P2: Power of Three 
*/

import java.io.*;
class Problem2{
	//Better
	public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
		
		if(n==1) return true;
		
		if(n%3!=0) return false;
		
		return isPowerOfThree(n/3);
    }
	/*
	public boolean isPowerOfThree(int n) {
        if(n == 1) return true;
        else if( n == 0) return false;
        return (n == 1 || ( (n%3 == 0) && isPowerOfThree(n/3) ));
    }
	*/
	public static void main(String args[])throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Problem2 obj= new Problem2();
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			int num = Integer.parseInt(br.readLine());
			System.out.println(obj.isPowerOfThree(num));
		}
	}
}

/*
>javac Problem2.java
>java Problem2
>4
>27
true
>0
false
>-1
false
>45
false
*/