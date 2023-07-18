import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> names = new HashSet<>();
        boolean flag = false;
        
        for (int i = 0; i < n; i++) {
            String lName = sc.next();
            String fName = sc.next();
            String fullName = lName + " " + fName;
            
            if (names.contains(fullName)) {
                flag = true;
            }else {
            	names.add(fullName);
            }
        }
        
        if (flag) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
