import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    /*city行列(ListにListを入れたもの)*/
    static List<List<Integer>> cities = new ArrayList<>();
    /*既に行ったことがある町(boolean型は初期値false)*/
    static boolean[] isVisited;
    /*出力用*/
    static StringBuilder sb = new StringBuilder();
 
    public static void main( String[] args) {
        Scanner scn = new Scanner( System.in);
        /*町の数入力*/
        int N = scn.nextInt();
        /*町の数がわかったから訪問済みの町も生成*/
        isVisited = new boolean[N];
        for ( int i = 0; i < N; i++) {
            /*定義は済ませているから指示された町の数だけ行を生成*/
            cities.add( new ArrayList<>());
        }
        /*道の入力*/
        for ( int i = 0; i < N - 1; i++) {
            /*入力するのは1～だが添字は0～なのが注意*/
            int a = Integer.parseInt( scn.next()) - 1;
            int b = Integer.parseInt( scn.next()) - 1;
            /*例:1の町と3の町が繋がっていれば3の町と1の町も繋がってるよね*/
            cities.get( a).add( b);
            cities.get( b).add( a);
        }
        /*1つの町に繋がっている町の数が記入し終わったから*/
        /*後々の小さい順に探索するためにソート*/
        for ( int i = 0; i < N; i++) {
            Collections.sort( cities.get( i));
        }
        /*外部関数*/
        /*ここで探索*/
        recursion( 0);
        /*最後の" "を消して出力している*/
        System.out.println( sb.delete( sb.length() - 1, sb.length()).toString());
    }
 
    public static void recursion( int beforeCity) {
        sb.append( beforeCity + 1 + " ");/*基準になった前の町を記入*/ 
        isVisited[beforeCity] = true;/*既に通過済みだからTrueを記入*/ 
        /*再帰関数*/
        /*nextCityはcityのbeforeCity行を回して探索している*/
        /*その中で訪れたことがない町があれば、そこに向かい
        そこがこの関数での次のbeforeCityになる
        そして軸となっていたbeforeCity(行番号)は記録され使われなくなる
        行ったことがない町がある限り再帰は続く*/
        for ( int nextCity : cities.get( beforeCity)) {
            if ( !isVisited[nextCity]) {
                /*次の町へ進んでいる*/
                recursion( nextCity);
                /*前の町の記録、つまり一つ戻っている*/
                /*ここが一番beforeの意味があっている希ガス*/
                sb.append( beforeCity + 1 + " ");
            }
        }
    }
}