import static java.lang.System.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        s.append("ABCARCAGCAHC");
        for(int i=0;i<3;i++) {
        	String t = sc.next();
        	int k = s.indexOf(t);
        	s.delete(k, k+3);
        }
        out.println(s);
    }
}
