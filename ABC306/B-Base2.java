import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bits = new int[64];
        for (int i = 63; i >= 0; i--) {
            bits[i] = sc.nextInt();
        }
        StringBuilder binary = new StringBuilder();
        for (int i = 0; i < 64; i++) {
            binary.append(bits[i]);
        }
        BigInteger decimal = new BigInteger(binary.toString(), 2);
        System.out.println(decimal);
        sc.close();
    }
}
