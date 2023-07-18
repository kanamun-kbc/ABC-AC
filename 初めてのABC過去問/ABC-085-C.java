import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int flag = 0;
        Label:for(int i=0;i<=N;i++) {
        	for(int j=0;j<=N-i;j++) {
        		int k = N-(i+j);
        		int money = 10000*i + 5000*j + 1000*k;
        		if(money==Y) {
        			System.out.print(i + " " + j + " " + k);
        			flag = 1;
        			break Label;
        		}
        	}
        }
        if(flag==0) {
        	System.out.print(-1 + " " + -1 + " " + -1);
        }
        sc.close();
    }
}