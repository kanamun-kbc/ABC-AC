import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==3 || a==6 || a==9) {
        	flag = false;
        }else if((a+1) != b) {
        	flag = false;
        }
        if(flag) {
        	System.out.print("Yes");
        }else {
        	System.out.print("No");
        }
        sc.close();
    }
}
