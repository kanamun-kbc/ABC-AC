import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        FastPrinter out = new FastPrinter();
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, FastScanner in, FastPrinter out) {
            int n = in.nextInt();
            int[] p = new int[n + 1];
            int[] q = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                p[i] = in.nextInt();
                q[p[i]] = i;
            }
            for (int i = 1; i <= n; i++) {
                out.print(q[i] + " ");
            }
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

        public int nextInt() {
            return Integer.parseInt(next());
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
