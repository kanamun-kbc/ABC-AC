import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
    	public void solve(int testNumber, FastScanner in, FastPrinter out) {
    		int[] p = new int[26];
    		for(int i=0;i<26;i++) {
    			p[i] = in.nextInt();
    		}
    		
    		StringBuilder sb = new StringBuilder();
        	for(int i=0;i<26;i++) {
        		char ch = (char)('a' + p[i] -1);
        		sb.append(ch);
        	}
        	
        	out.print(sb.toString());
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
