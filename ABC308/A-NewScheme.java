import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num_all = new int[8];
        boolean flag = true;
        int pre_num = 0;
        for(int i=0;i<8;i++) {
        	num_all[i] = sc.nextInt();
        }
        for(int i=0;i<8;i++) {
        	if(pre_num > num_all[i]) {
        		flag = false;
        		break;
        	}
        	if(100 > num_all[i] || num_all[i] > 675) {
        		flag = false;
        		break;
        	}
        	if(num_all[i] % 25 != 0) {
        		flag = false;
        		break;
        	}
        	pre_num = num_all[i];
        }
        if(flag) {
        	System.out.print("Yes");
        }else {
        	System.out.print("No");
        }
        
        sc.close();
    }
}
