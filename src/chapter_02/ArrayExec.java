package chapter_02;

public class ArrayExec {
  /**
   * mainメソッド
   */
  public static void main(String[] args) {
    // 配列を初期化
    int[] a = { 1, 2, 3, 4, 5 };
    double[] b = { 1.1, 1.2, 1.3, 1.4, 1.5 };
    char[] c = { 'お', 'は', 'よ', 'う' };
    String[] d = { "おはよう", "こんにちは", "こんばんは", "さようなら" };
    boolean[] e = { true, true, false, true };

    // 配列の要素番号0を出力
    System.out.println(a[0]); // 1
    System.out.println(b[0]); // 1.1
    System.out.println(c[0]); // お
    System.out.println(d[0]); // おはよう
    System.out.println(e[0]); // true
  }
}
