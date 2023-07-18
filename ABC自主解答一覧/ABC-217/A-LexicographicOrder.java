import static java.lang.System.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = new String[2];
        st[0] = sc.next();
        st[1] = sc.next();
        String s = st[0];
        Arrays.sort(st);
        if(st[0].equals(s)) {
        	out.println("Yes");
        }else {
        	out.println("No");
        }
    }
}
