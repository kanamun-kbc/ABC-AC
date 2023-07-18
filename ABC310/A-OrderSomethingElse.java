import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int P = Integer.parseInt(sc.next());
        int Q = Integer.parseInt(sc.next());
        int[] menu = new int[N];
        for(int i=0;i<N;i++) {
        	menu[i] = Integer.parseInt(sc.next());
        }
        int min = P;
        for(int j=0;j<N;j++) {
        	if((Q+menu[j])<min) {
        		min = Q + menu[j];
        	}
        }
        System.out.print(min);
    }
}
