import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("eraser", "0");
        str = str.replaceAll("erase", "0");
        str = str.replaceAll("dreamer", "0");
        str = str.replaceAll("dream", "0");
        str = str.replaceAll("0", "");
        if(str.length()==0) {
        	System.out.print("YES");
        }else {
        	System.out.print("NO");
        }
        sc.close();
    }
}