package chapter_02;

public class Variable8 {
    public static void main(String[] args) {

        double number = 10; // 10.0へ暗黙の型変換されて、numberへ代入

        double x = 3.5;
        double y = x + 2; // 2は2.0へ暗黙の型変換されて計算に使われる

        // int z = 12.345; // コンパイルエラーになる

        System.out.println(number);
        System.out.println("y:" + y);
    }
}
