import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int t = 0;
        int x = 0;
        int y = 0;
        int pret = 0;
        int prex = 0;
        int prey = 0;
        int flag = 0;
        for(int i=0;i<N;i++) {
        	t = sc.nextInt();
        	x = sc.nextInt();
        	y = sc.nextInt();
        	int XY = Math.abs(x-prex) + Math.abs(y-prey);
        	int T = t - pret;
        	if(XY > T || (T-XY)%2 != 0) {
        		flag = 1;
        		break;
        	}
        	pret = t;
        	prex = x;
        	prey = y;
        }
        if(flag==0) {
        	System.out.print("Yes");
        }else {
        	System.out.print("No");
        }
        sc.close();
    }
}