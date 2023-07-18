import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long H = sc.nextLong();
		long W = sc.nextLong();
		int N = sc.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		/*同じ添字(ここではiの値-1を示していることにもなる)を指定すれば、一意に指すことができる*/
		for (int i=0;i<N;i++) {
			A[i]=sc.nextLong();
			B[i]=sc.nextLong();
		}
		/*重複をなくす。存在する行*/
		long[] existA = Arrays.stream(A).distinct().toArray();
		long[] existB = Arrays.stream(B).distinct().toArray();
		/*ソート後*/
		/*existA.length()は操作後に存在する行の大きさ*/
		/*existAの要素が以前の行の値を示し、添字が新しい行の値-1を示している*/
		Arrays.sort(existA);
		Arrays.sort(existB);
		for (int i=0;i<N;i++) {
			int x = Arrays.binarySearch(existA, A[i])+1;
			int y = Arrays.binarySearch(existB, B[i])+1;
			System.out.println(x+" "+y);
		}
	}
}