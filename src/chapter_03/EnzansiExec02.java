package chapter_03;

public class EnzansiExec02 {
    /**
     * 前置の学習
     */
    public static void main(String[] args) {
        int a, b;

        a = 10;

        // 前置の場合
        // aを１増やした後で、 a + 5を計算する
        b = ++a + 5; // 式の中で前置を使った場合、計算に使う直前に増減

        System.out.println(a);
        System.out.println(b);
    }
}
