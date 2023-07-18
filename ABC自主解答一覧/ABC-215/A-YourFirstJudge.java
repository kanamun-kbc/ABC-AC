import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if(S.equals("Hello,World!")) {
        	System.out.println("AC");
        }else {
        	System.out.println("WA");
        }
    }
}
