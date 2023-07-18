import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	static ArrayList<ArrayList<Integer>> machi  = new ArrayList<>();
	static boolean[] used;
	static StringBuilder result = new StringBuilder(); 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			machi.add(new ArrayList<>());
		}
		used = new boolean[N];
		for(int j=0;j<N-1;j++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			machi.get(x-1).add(y-1);
			machi.get(y-1).add(x-1);
		}
		for(int k=0;k<N;k++) {
			Collections.sort(machi.get(k));
		}
		tansaku(0);
		System.out.print(result.delete(result.length()-1, result.length()).toString());
	}
	public static void tansaku(int prepoint) {
		result.append(prepoint+1+" ");
		used[prepoint] = true;
		for (int willpoint : machi.get(prepoint)) {
	        if (!used[willpoint]) {
	            tansaku(willpoint);
	            result.append(prepoint + 1 + " ");
	        }
	    }
	}
}