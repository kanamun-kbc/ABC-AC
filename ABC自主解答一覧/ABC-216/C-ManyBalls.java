import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder s = new StringBuilder();
        while(n>0) {
        	if(n%2==0) {
        		s.append("B");
        		n/=2;
        	}else {
        		s.append("A");
        		n--;
        	}
        }
        System.out.println(s.reverse());
    }
}
