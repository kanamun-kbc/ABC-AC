import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A==0) System.out.print("Silver");
        else if(B==0) System.out.print("Gold");
        else System.out.print("Alloy");
        sc.close();
    }
}