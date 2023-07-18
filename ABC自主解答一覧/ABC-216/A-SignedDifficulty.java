import static java.lang.System.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("\\.");
        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        if(y<=2) {
        	out.println(x+"-");
        }else if(y<=6) {
        	out.println(x);
        }else {
        	out.println(x+"+");
        }
    }
}
