import java.io.*;
import java.util.*;
class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        // Your code here
        if(N>1){
            toh(N-1, from, aux, to);
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            toh(N-1,aux, to, from );
            return (long)(Math.pow(2,N)-1);
        }
        else if(N==1){
            System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
            return 1;
        }
        return 0;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        while(T-->0){
            Hanoi obj = new Hanoi();
            int N;
            N = sc.nextInt();
            System.out.println(obj.toh(N,1,3,2));
        }
    }
}

/*
 Output
>3
>1
move disk 1 from rod 1 to rod 3
1
>2
move disk 1 from rod 1 to rod 2
move disk 2 from rod 1 to rod 3
move disk 1 from rod 2 to rod 3
3
>3
move disk 1 from rod 1 to rod 3
move disk 2 from rod 1 to rod 2
move disk 1 from rod 3 to rod 2
move disk 3 from rod 1 to rod 3
move disk 1 from rod 2 to rod 1
move disk 2 from rod 2 to rod 3
move disk 1 from rod 1 to rod 3
7

 */