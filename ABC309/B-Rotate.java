import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] num = new int[n][n];
        int[][] result = new int[n][n];
        for(int i=0;i<n;i++) {
        	String[] store = sc.next().split("");
        	for(int j=0;j<n;j++) {
        		num[i][j] = Integer.parseInt(store[j]);
        	}
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		result[i][j] = num[i][j];
        	}
        }
        
        for(int i=1;i<n;i++) {
        	result[0][i] = num[0][i-1];
        }
        for(int i=1;i<n;i++) {
        	result[i][n-1] = num[i-1][n-1];
        }
        for(int i=n-2;i>=0;i--) {
        	result[n-1][i] = num[n-1][i+1];
        }
        for(int i=n-2;i>=0;i--) {
        	result[i][0] = num[i+1][0];
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		System.out.print(result[i][j]);
        	}
        	System.out.println();
        }
    }
}
