/**

  P4: Closest Prime Numbers in Range

  Example 1:
  Input: left = 10, right = 19
  Output: [11,13]
  Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
  The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
  Since 11 is smaller than 17, we return the first pair.
  
  Example 2:
  Input: left = 4, right = 6
  Output: [-1,-1]
  Explanation: There exists only one prime number in the given range, so the conditions cannot be satisfied.

*/

class Problem4 {
    boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i == 0)return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int ans[]=new int[2];
        ArrayList<Integer> al=new ArrayList<Integer>();
        /*if(left == 1)
            left+=1;
        for(int i = left; i <= right; i++){
            if(isPrime(i)){
                al.add(i);
            }
        }*/
        boolean isPrime[]=new boolean[right+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2 ; i*i <= right; i++){
            if(isPrime[i]){
                for(int j = i*i; j<= right; j += i){
                    isPrime[j] = false;
                }
            }
        }
        for(int i = left; i<= right; i++){
            if(isPrime[i]){
                al.add(i);
            }
        }

        if(al.size() < 2){
            ans[0] = -1;
            ans[1] = -1;
        }else{
            int min = Integer.MAX_VALUE;
            for(int i =1 ; i<al.size(); i++){
                int num = al.get(i-1);
                int num2 = al.get(i);
                if((num2-num) < min){
                    min = num2-num;
                    ans[0]=num;
                    ans[1] = num2;
                }
            }
        }
        return ans;
    }
}

/*

>left = 19
>right = 31
[29,31]

>left = 1
>right = 1000000
[2,3]

*/
