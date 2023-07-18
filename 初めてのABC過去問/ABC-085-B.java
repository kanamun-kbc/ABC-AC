import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ary = new int[N];
        int count = 1;
        for(int i=0;i<N;i++) {
        	ary[i] = sc.nextInt();
        }
        Arrays.sort(ary);
        for(int j=0;j<N-1;j++) {
        	if(ary[j]<ary[j+1]) {
        		count++;
        	}
        }
        System.out.print(count);
        sc.close();
    }
}