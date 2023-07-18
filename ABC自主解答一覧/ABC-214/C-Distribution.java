import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int[] ans = Arrays.copyOf(t, n);
        for (int k = 0; k < 2; k++) {
            for (int i = 0; i < n; i++) {
                int nexti = (i + 1) % n;
                ans[nexti] = Math.min(ans[nexti], ans[i] + s[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}
