import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int result_num = 0;
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            if(!set.contains(str) && !set.contains(new StringBuilder(str).reverse().toString())) {
                set.add(str);
                result_num++;
            }
        }
        System.out.print(result_num);
    }
}
