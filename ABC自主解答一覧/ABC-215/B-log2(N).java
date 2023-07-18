import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int k = 0;
        long tei = 1;
        while(tei<=N) {
        	tei *= 2;
        	k++;
        }
        k--;
        System.out.println(k);
    }
}
