import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		/*toCharArrayでStringをChar型に分解しながらArrayに入れる*/
	    char[] chars = s.toCharArray();
	    /*Unicode順にソート*/
	    Arrays.sort(chars);
	    /*Stringのコンストラクタにはchar型配列を入れることで文字列型にできる*/
    	String sorted = new String(chars);
		
		/*全パターンを入れる袋*/
	    Set<String> perms = new TreeSet<>();
	    /*再帰関数の呼び出し、袋に全パターン入れた*/
	    generatePerms("", sorted, perms);

		/*結果用*/
    	String result = "";
    	/*ｋ番目探索用*/
	    int count = 0;
	    /*自然順序に並んでるから拡張for文で袋の探索*/
	    for (String perm : perms) {
    	    count++;
        	if (count == k) {
            	result = perm;
	            break;
    	    }
	    }
		/*結果出力*/
    	System.out.println(result);
	}
	
	/*文字を並び替え作っていき、袋に追加する関数*/
	private static void generatePerms(String curr, String rem, Set<String> perms) {
		/*全要素使って並び終えたら、それを袋に追加*/
    	if (rem.length() == 0) {
        	perms.add(curr);
	    } else {
	    	/*今余っている文字列から文字を抽出し、並べ、この関数に戻る*/
    	    for (int i = 0; i < rem.length(); i++) {
        	    char c = rem.charAt(i);
            	String newCurr = curr + c;
	            String newRem = rem.substring(0, i) + rem.substring(i + 1);
    	        generatePerms(newCurr, newRem, perms);
        	}
	    }
	}
}