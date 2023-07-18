import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[] {0,1,2,3,4,5,6,7,8,9,0,1,2};
        int num = sc.nextInt();
        int[] number = new int[4];
        int s = 0;
        for(int i=3;i>=0;i--) {
        	number[i] = num%10;
        	num/=10;
        	if(i==0) {
        		for(int j=0;j<10;j++) {
        			if(X[j] == number[0]) {
        				s = j;
        				break;
        			}
        		}
        	}
        }
        int[] compnum1 = new int[] {s,s,s,s};
        int[] compnum2 = new int[] {X[s],X[s+1],X[s+2],X[s+3]};
        if(Arrays.equals(number, compnum1) || Arrays.equals(number, compnum2)) 
        	System.out.print("Weak");
        else
        	System.out.print("Strong");
        
        sc.close();
    }
}