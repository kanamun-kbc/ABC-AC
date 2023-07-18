import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int T = sc.nextInt();
		int num = 0;
		for(int a=0;a<=S;a++) {
			for(int b=0;b<=S-a;b++) {
				for(int c=0;c<=S-a-b;c++) {
					if(a*b*c<=T) {
						num++;
					}
				}
			}
		}
		System.out.println(num);
	}
}