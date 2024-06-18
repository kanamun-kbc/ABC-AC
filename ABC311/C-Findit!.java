import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }
        List<Integer> c = findc(nums);
        System.out.println(c.size());
        for (int num : c) {
            System.out.print(num + " ");
        }
    }
    private static List<Integer> findc(int[] nums) {
        List<Integer> C = new ArrayList<>();
        int t = nums[0];
        int hare = nums[nums[0] - 1];
        while (t != hare) {
            t = nums[t - 1];
            hare = nums[nums[hare - 1] - 1];
        }
        hare = nums[t - 1];
        C.add(t);
        while (t != hare) {
            C.add(hare);
            hare = nums[hare - 1];
        }
        return C;
    }
}
