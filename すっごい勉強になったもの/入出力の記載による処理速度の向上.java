import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] p = new int[n+1];
            int[] q = new int[n+1];
            for (int i = 1; i <= n; i++) {
                p[i] = in.nextInt();
                q[p[i]] = i;
            }
            for (int i = 1; i <= n; i++) {
                out.print(q[i]+" ");
            }
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }
        boolean hasNext()
        {
            while (tokenizer == null || !tokenizer.hasMoreTokens())
            {
                try
                {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (Exception e)
                {
                    return false;
                    // TODO: handle exception
                }
            }
            return true;
        }
        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }
        public String nextLine()
        {
            String str = null;
            try
            {
                str = reader.readLine();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() {
            return Integer.parseInt(next());
        }
        public double nextDouble(){
            return Double.parseDouble(next());
        }
        public long nextLong(){
            return Long.parseLong(next());
        }
        public BigInteger nextBigInteger()
        {
            return new BigInteger(next());
        }
        public BigDecimal nextBigDecimal()
        {
            return new BigDecimal(next());
        }

    }
}