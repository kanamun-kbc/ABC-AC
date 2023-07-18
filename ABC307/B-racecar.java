import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        boolean found = false; // 回文の組み合わせが見つかったかどうかのフラグ

        for (int j = 0; j < n; j++) {
            for (int k = 0; k < n; k++) {
                if (j != k) {
                    String t = s[j] + s[k];
                    if (kaibun(t)) {
                        found = true;
                        break;
                    }
                }
            }
            if (found) {
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }

    static boolean kaibun(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
