import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {
	//人の番号と成功率を保持するためのクラス
    static class Pair {
    	//人の番号
        int id;
        //成功率
        BigInteger rate;
        Pair(int id, BigInteger rate) {
            this.id = id;
            this.rate = rate;
        }
    }
    
    public static void main(String[] args) throws IOException {
    	//標準入力から値を読み取る
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //読み取った行をトークンに分割
        StringTokenizer st;
        //最初の行で読み取った整数
        int n = Integer.parseInt(br.readLine());
        //Pairオブジェクトを格納するための優先度付きキュー
        PriorityQueue<Pair> pq = new PriorityQueue<>(((o1, o2) -> {
            if (o2.rate.equals(o1.rate)) { 
            	//rate同じならidの順番で決める
                return o1.id - o2.id;
                //そうでないならレートの大きいほうで決める
            } else return o2.rate.compareTo(o1.rate);
        }));
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            //aをBigInteger型に変換
            //multiplyはBigIntegerオブジェクト同士の乗算
            //成功率の小数点以下を100桁まで表現できるようにしている(スケーリング)
            BigInteger rate = BigInteger.valueOf(a).multiply(BigInteger.TEN.pow(100));
            //BigInteger型のdivideメソッドで割り算が行われている
            rate = rate.divide(BigInteger.valueOf(a + b));
            pq.add(new Pair(i + 1, rate));
        }


        while (!pq.isEmpty()) {
            System.out.print(pq.poll().id + " ");
        }
    }
}