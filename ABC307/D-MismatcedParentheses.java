import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
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
            /*文字列の長さ*/
            int n = in.nextInt();
            /*文字列本体*/
            String s = in.next();
			
			/*文字列sの中の'('の位置を保存する*/
            Stack<Integer> stack = new Stack<>();
            /*文字列sの中の各文字が削除されるべきかどうかを示すフラグ*/
            boolean[] remove = new boolean[n]; 
			
			/*先頭から末尾まで走査*/
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == '(') {
                	/*'('ならそのindexをstackにプッシュ*/
                    stack.push(i);
                } else if (c == ')') {
                	/*')'だった場合*/
                    if (!stack.isEmpty()) {
                    	/*スタックに何かしら入っていたら*/
                        int start = stack.pop();
                        /*スタックから最新のindexをポップ*/
                        remove[start] = true; 
                        remove[i] = true; 
                        /*つまり'('と')'の場所をremoveに登録*/
                        for (int j = start + 1; j < i; j++) {
                        	/*その'('と')'の間のものもremoveに登録*/
                            remove[j] = true;
                        }
                    }
                }
            }
			/*最終的な文字列を構築するバッファ*/
            StringBuilder sb = new StringBuilder();
            /*先頭から末尾まで走査*/
            for (int i = 0; i < n; i++) {
                if (!remove[i]) {
                	/*remove対象になっていない文字列をsbに追加*/
                    sb.append(s.charAt(i));
                }
            }
			/*それを出力*/
            String result = sb.toString();
            out.print(result);
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
