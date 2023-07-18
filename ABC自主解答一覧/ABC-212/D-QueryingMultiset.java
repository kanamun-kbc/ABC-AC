import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        long std = 0;
        PriorityQueue<Long> list = new PriorityQueue<>();
        for(int i=0;i<Q;i++) {
        	int P = sc.nextInt();
        	if(P == 1) { 
        		long addb = sc.nextLong();
        		addb -= std;
        		list.add(addb);
        	}else if(P == 2) {
        		long addn = sc.nextLong();
        		std += addn;
        	}else {
        		System.out.println(list.poll()+std);
        	}
        }
    }
}