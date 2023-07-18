import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ary = new int[N];
        int aliceSum = 0;
        int bobSum = 0;
        for(int i=0;i<N;i++) {
        	ary[i] = sc.nextInt();
        }
        Arrays.sort(ary);
        /*Alice*/
        for(int a=N-1;a>=0;a-=2) {
        	aliceSum += ary[a];
        }
        /*Bob*/
        for(int b=N-2;b>=0;b-=2) {
        	bobSum += ary[b];
        }
        System.out.print(aliceSum-bobSum);
        sc.close();
    }
}