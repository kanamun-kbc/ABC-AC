import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] c = new String[n];
        String[] d = new String[m];
        int[] p = new int[m+1];
        int sum = 0;
        boolean flag = false;
        for(int i=0;i<n;i++) {
        	c[i] = sc.next();
        }
        for(int i=0;i<m;i++) {
        	d[i] = sc.next();
        }
        for(int i=0;i<m+1;i++) {
        	p[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
        		if(c[i].equals(d[j])) {
        			sum += p[j+1];
        			flag = true;
        		}
        	}
        	if(!flag) {
        		sum += p[0];
        	}
        	flag = false;
        }
        System.out.print(sum);
        sc.close();
    }
}
