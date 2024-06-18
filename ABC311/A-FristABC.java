import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            if (currentChar == 'A' && countA == 0) {
                countA++;
            } else if (currentChar == 'B' && countB == 0) {
                countB++;
            } else if (currentChar == 'C' && countC == 0) {
                countC++;
            }

            if (countA > 0 && countB > 0 && countC > 0) {
                result = i + 1;
                break;
            }
        }

        System.out.print(result);
    }
}
