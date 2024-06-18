import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            String row = sc.nextLine();
            s[i] = row;
        }
        int count = 0;
        int maxCount = 0;
        for (int j = 0; j < d; j++) {
            boolean isAllO = true;
            for (int i = 0; i < n; i++) {
                if (s[i].charAt(j) != 'o') {
                    isAllO = false;
                    break;
                }
            }
            if (isAllO) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        if (count > maxCount) {
            maxCount = count;
        }
        System.out.print(maxCount);
    }
}
