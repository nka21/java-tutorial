package chapter_03;

public class EnzansiExec12 {
  public static void main(String[] args) {

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    // aは0より大きく、かつ、10より小さい
    boolean a1 = a > 0 && a < 10;
    // aは0以下、または、10以上
    boolean a2 = a <= 0 || a >= 10;
    // aは0より大きく、かつ、１０より小さくない
    boolean a3 = !(a > 0 && a < 10);
    // aかbのどちらか一方が0
    boolean a4 = (a == 0) ^ (b == 0); // <- なんこれ!?

    System.out.println("a > 0 && a < 10 = " + a1);
    System.out.println("a <= 0 || a >= 10 = " + a2);
    System.out.println("!(a > 0 && a < 10 ) = " + a3);
    System.out.println("( a == 0 ) ^ ( b == 0 ) = " + a4);

    // 実行例 input: 5 0
    // a > 0 && a < 10 = true
    // a <= 0 || a >= 10 = false
    // !(a > 0 && a < 10 ) = false
    // ( a == 0 ) ^ ( b == 0 ) = true

  }
}
