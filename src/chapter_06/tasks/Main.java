package chapter_06.tasks;

/**
 * メイン処理を行うクラス。 コマンドライン引数から元金、金利、年数を受け取り、複利計算を行います。
 */
public class Main {
    public static void main(String[] args) {
        // コマンドライン引数のチェック（元金 / 金利 / 年数）
        if (args.length != 3) {
            System.err.println("[ERROR] 元金 / 金利 / 年数 のみ指定して下さい。");
            return; // 引数の数が不正な場合はエラーメッセージを表示して終了
        }

        // 入力値のバリデーションを行うクラスのインスタンス化
        InputValidator validator = new InputValidator();

        // コマンドライン引数から元金、金利、年数を整数に変換
        int principal = Integer.parseInt(args[0]); // 元金
        int rate = Integer.parseInt(args[1]); // 金利
        int year = Integer.parseInt(args[2]); // 年数

        // 入力値のバリデーション
        if (!validator.isValidPrincipal(principal) || !validator.isValidRate(rate)
                || !validator.isValidYear(year)) {
            return; // 不正な入力があれば処理を終了
        }

        // 複利計算を行うクラスのインスタンス化
        CompoundInterestCalculator calculator =
                new CompoundInterestCalculator(principal, rate, year);
        // 複利計算を行い、結果を出力
        calculator.calculateAndPrintCompoundInterest();
    }
}
