import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastScanner in = new FastScanner();
        FastPrinter out = new FastPrinter();
        Task1 task = new Task1();
        task.solve(1, in, out);
        out.close();
    }

    static class Task1 {
        public void solve(int testNumber, FastScanner in, FastPrinter out) {
            int N = in.nextInt();
            int M = in.nextInt();

            Merchandise[] merchandises = new Merchandise[N];
            for (int i = 0; i < N; i++) {
                int P = in.nextInt();
                int C = in.nextInt();
                Set<Integer> functions = new HashSet<>();
                for (int j = 0; j < C; j++) {
                    functions.add(in.nextInt());
                }
                merchandises[i] = new Merchandise(P, functions);
            }

            Arrays.sort(merchandises, Comparator.comparingInt(m -> m.price));

            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    Merchandise m1 = merchandises[i];
                    Merchandise m2 = merchandises[j];

                    if (isSuperior(m1, m2)) {
                        out.print("Yes\n");
                        return;
                    }
                }
            }
            out.print("No\n");
        }

        private boolean isSuperior(Merchandise m1, Merchandise m2) {
            // m2の機能がすべてm1に含まれているかチェック
            if (m1.functions.containsAll(m2.functions)) {
                // 価格が異なる場合はm2が上位互換
                if (m1.price < m2.price) {
                    return true;
                }
                // m1にm2の機能にない追加機能がある場合もm2が上位互換
                if (m1.functions.size() > m2.functions.size()) {
                    return true;
                }
            }
            return false;
        }
    }

    static class Merchandise {
        int price;
        Set<Integer> functions;

        Merchandise(int price, Set<Integer> functions) {
            this.price = price;
            this.functions = functions;
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

        public long nextLong() {
            return Long.parseLong(next());
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
