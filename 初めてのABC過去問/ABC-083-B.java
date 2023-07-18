import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int numSum = 0;
        for(int i=1;i<=N;i++) {
        	int j = sumDigits(i);
        	if(A<=j && j<=B) {
        		numSum += i;
        	}
        }
        System.out.print(numSum);
    }
    public static int sumDigits(int k) {
    	int sum = 0;
    	while(k!=0) {
    		sum+=k%10;
    		k/=10;
    	}
    	return sum;
    }
}