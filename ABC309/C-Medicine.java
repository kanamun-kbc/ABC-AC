import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        FastPrinter out = new FastPrinter();
        Task1 task = new Task1();
        task.solve(1, in, out);
        out.close();
    }

    static class Task1 {
    	private static final Comparator<long[]> comparator = Comparator.comparingLong(a -> a[0]);
    	
        public void solve(int testNumber, FastScanner in, FastPrinter out) {
        	int n = Integer.parseInt(in.next());
        	long k = Long.parseLong(in.next());
        	BigInteger sum = BigInteger.ZERO;
        	long[][] array = new long[n][2];
        	for(int i=0;i<n;i++) {
        		array[i][0] = Long.parseLong(in.next());
        		array[i][1] = Long.parseLong(in.next());
        		sum = sum.add(BigInteger.valueOf(array[i][1]));
        	}
        	
        	Arrays.sort(array, comparator);
        	
        	long day = 1;
        	int j = 0;
        	BigInteger bk = BigInteger.valueOf(k);
        	while(sum.compareTo(bk)>0) {
        		/*ここに入っているということは錠剤の数がk以下に減るまでdayを変えないといけない*/
        		long nextday = array[j][0];
        		/**/
        		while(j<n && array[j][0] == nextday) {
        			/*減算する*/
        			sum = sum.subtract(BigInteger.valueOf(array[j][1]));
        			/*錠剤の飲む量が減る*/
        			j++;
        		}
        		/*出ていくときにdayの値をその行のarrayの0列目の値にする*/
        		day = nextday + 1;
        	}
        	out.print(day);
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        public String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public void close() {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class FastPrinter {
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
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void close() {
            try {
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
