import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
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
        public void solve(int testNumber, FastScanner in, FastPrinter out) {
            // 入力の受け取り
            int N = in.nextInt();
            int M = in.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }

            // 素因数を格納するセット(重複した素数をいれないため、セットにする)
            Set<Integer> primeSet = new HashSet<>();

            // Aの各要素について
            for (int x : A) {
                // もし1ならば
                if (x == 1) {
                    // 次の要素へ
                    continue;
                }

                // prime_x = xの素因数セット
                Set<Integer> primeSetX = primeFactorize(x);
                // xの素因数をprimeSetに追加
                primeSet.addAll(primeSetX);
            }

            // ansJudge[x] = trueなら答え、falseなら答えでない
            boolean[] ansJudge = new boolean[M + 1];

            // primeSet内の素数(p)について
            for (int p : primeSet) {
                // p * 1, p * 2, p * 3, ..., p * k, ...は答えでない→ansJudge[p * k] = falseとする
                // p * kがMを超えるまで
                int k = 1;
                while (p * k <= M) {
                    ansJudge[p * k] = false;
                    k++;
                }
            }

            // 答えの格納用リスト
            List<Integer> ans = new ArrayList<>();

            // 1 ～ Mまで
            for (int i = 1; i <= M; i++) {
                // ansJudge[i] = trueならiは答え
                if (ansJudge[i]) {
                    ans.add(i);
                }
            }

            // 答えの個数を出力
            out.print(ans.size() + "\n");
            // 答えを出力
            for (int i : ans) {
                out.print(i + "\n");
            }
        }

        // 素因数分解を行い、素因数のセットを返す関数
        private Set<Integer> primeFactorize(int x) {
            // もしx = 1ならば
            if (x == 1) {
                // {1}を返す
                Set<Integer> set = new HashSet<>();
                set.add(1);
                return set;
            }

            // 素因数を格納するセット
            Set<Integer> primeSet = new HashSet<>();

            // i = 2, 3, 4, ...で試し割り
            int i = 2;
            // i <= √x すなわち i * i <= xの範囲で試し割り
            while (i * i <= x) {
                // もしiで割り切れたら
                if (x % i == 0) {
                    // iを素因数に追加
                    primeSet.add(i);
                    // xをiで割る
                    x /= i;
                }
                // iで割り切れなかったら
                else {
                    // 次のiへ
                    i++;
                }
            }
            // 試し割りが終わった時xが1でなければ
            if (x != 1) {
                // 素因数にxを追加
                primeSet.add(x);
            }
            // 素因数のセットを返す
            return primeSet;
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
