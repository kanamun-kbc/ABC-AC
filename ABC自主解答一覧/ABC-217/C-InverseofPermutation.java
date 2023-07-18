import static java.lang.System.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        for(int i=0;i<n;i++) {
        	p[i] = sc.nextInt();
        	q[p[i]-1] = i+1;
        }
        for(int j=0;j<n;j++) {
        	out.print(q[j]);
        	if(j!=n-1) {
        		out.print(" ");
        	}
        }
    }
}
