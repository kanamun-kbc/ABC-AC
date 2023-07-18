import static java.lang.System.*;

import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.replaceAll("0", "");
		out.print(s.length());
	}
}