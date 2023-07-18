import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long[] s = new long[(int) (7 * n)];
        long[] r = new long[(int) n];
        for(int i=0;i<7*n;i++) {
        	s[i] = sc.nextLong();
        }
        for(int j=0;j<n;j++) {
        	for(int k=0;k<7;k++) {
        		r[j] += s[(j * 7) + k];
        	}
        }
        for(int l=0;l<n;l++) {
        	System.out.print(r[l] + " ");
        }
        sc.close();
    }
}
