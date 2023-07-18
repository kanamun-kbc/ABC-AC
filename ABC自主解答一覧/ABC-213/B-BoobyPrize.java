import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxScore2 = 0;
        int m2 = 0;
        int maxScore1 = 0;
        int m1 = 0;
        for(int i=0;i<n;i++) {
        	int score = sc.nextInt();
        	if(maxScore1 < score) {
        		m2 = m1;
        		m1 = i;
        		maxScore2 = maxScore1;
        		maxScore1 = score;
        	}else if(maxScore2 < score) {
        		m2 = i;
        		maxScore2 = score;
        	}
        	
        }
        System.out.print(m2+1);
        sc.close();
    }
}