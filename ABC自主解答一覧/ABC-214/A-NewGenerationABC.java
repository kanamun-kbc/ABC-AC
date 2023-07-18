import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N<=125) {
			System.out.println(4);
		}else if(N<=211) {
			System.out.print(6);
		}else {
			System.out.println(8);
		}
	}
}