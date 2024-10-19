package chapter_11.tasks;

public class Divide {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("2つの数値を入力してください。");
            System.exit(1);
        }
        try {
            // int型のコマンドライン引数を2つ取得
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = (a / b);

            // 第１引数を第2引数で徐算 (除算の商は整数値のみ)
            System.out.println(a + " / " + b + " = " + result);
        } catch (NumberFormatException e) {
            // 整数型以外が入力された時の例外処理
            System.err.println("Cannot parse to a number: " + e);
        } catch (ArithmeticException e) {
            // 0徐算の例外処理
            System.err.println("0 does not divide: " + e);
        }
    }
}
