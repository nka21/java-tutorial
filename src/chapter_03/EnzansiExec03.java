package chapter_03;

public class EnzansiExec03 {
    /**
     * 後置インクリメント
     */
    public static void main(String[] args) {
        int a, b;

        a = 10;

        // 後置の場合
        // a + 5を計算した後でaを1増やす
        b = a++ + 5;

        System.out.println(a); // 11
        System.out.println(b); // 15
    }
}
