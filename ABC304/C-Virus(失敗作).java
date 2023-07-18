import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
    	FastScanner in = new FastScanner();
    	FastPrinter out = new FastPrinter();
        Task1 task = new Task1();
        task.solve(1,in, out);
        out.close();
    }
    static class Task1{
    	static boolean[] isPand;
    	static int[][] xy;
    	static double[][] dist;
    	public void solve(int testNumber, FastScanner in, FastPrinter out) {
    		int n = in.nextInt();
    		int d = in.nextInt();
    		isPand = new boolean[n];
    		xy = new int[n][2];
    		dist = new double[n][n];
    		List<Integer> list = new ArrayList<>();
    		for(int i=0;i<n;i++) {
    			xy[i][0] = in.nextInt();
    			xy[i][1] = in.nextInt();
    		}
    		for(int i=0;i<n;i++) {
    			for(int j=0;j<n;j++) {
    				dist[i][j] = Math.sqrt(Math.pow(xy[i][0]-xy[j][0], 2)+Math.pow(xy[i][1]-xy[j][1], 2));
    			}
    		}
    		if(n==1) {
    			out.print("Yes");
    		}else {
    			/*初感染者*/
    			for(int i=0;i<n;i++) {
    				if(dist[0][i]<d) {
    					list.add(i);
    					isPand[i] = true;
    				}
    			}
    			if(list.size()>1) {
    				for(int num0:list) {
    					for(int num1:list) {
    						if(dist[num0][num1]<d) {
    							isPand[num1] = true;
    							if(!(list.contains(num1))) {
    								list.add(num1);
    							}
    						}
    					}
    				}
    			}
    		}
    		for(int i=0;i<n;i++) {
    			if(isPand[i] == true) {
    				out.print("Yes\n");
    			}else {
    				out.print("No\n");
    			}
    		}
    	}
    }
    
    static class FastScanner{
    	BufferedReader br;
    	StringTokenizer st;
    	
    	public FastScanner() {
    		br = new BufferedReader(new InputStreamReader(System.in));
    		st = new StringTokenizer("");
    	}
    	
    	public String next() {
    		while(!st.hasMoreTokens()) {
    			try {
    				st = new StringTokenizer(br.readLine());
    			}catch(IOException e) {
    				throw new RuntimeException(e);
    			}
    		}
    		return st.nextToken();
    	}
    	public int nextInt() {
    		return Integer.parseInt(next());
    	}
    	public long nextLong() {
            return Long.parseLong(next());
    	}
    	public void close() {
    		try {
    			br.close();
    		}catch(IOException e) {
    			throw new RuntimeException(e);
    		}
    	}
    }
    
    
    static class FastPrinter{
    	BufferedWriter bw;
    	
    	public FastPrinter() {
    		bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	}
    	public void print(long num) {
            print(String.valueOf(num));
        }
		public void print(String str) {
    		try {
    			bw.write(str);
    		}catch(IOException e) {
    			throw new RuntimeException(e);
    		}
    	}
    	
    	public void close() {
    		try {
    			bw.close();
    		}catch(IOException e) {
    			throw new RuntimeException(e);
    		}
    	}
    }
}