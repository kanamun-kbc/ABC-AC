import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[M];
        for(int a=0;a<N;a++) {
        	A[a] = sc.nextInt();
        }
        for(int b=0;b<M;b++) {
        	B[b] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int min = Integer.MAX_VALUE;
        int i=0;
        int j=0;
        int tmp = 0;
        while(i<N && j<M) {
        	tmp = Math.abs(A[i]-B[j]);
        	if(tmp<min)min = tmp;
        	if(A[i]<B[j]) i++;
        	else j++;
        }
        System.out.print(min);
        sc.close();
    }
}