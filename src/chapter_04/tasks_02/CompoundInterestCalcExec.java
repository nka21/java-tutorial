package chapter_04.tasks_02;

public class CompoundInterestCalcExec {
    public static void main(String[] args) {
        // コマンドライン引数が要件通り正しく入力されているか
        boolean errFlag = false;
        if (!(args.length == 3)) {
            System.err.println("[ERROR] 元金 / 金利 / 年数 のみ指定して下さい。");
            return;
        }

        // 各データの入力
        int principal = Integer.parseInt(args[0]);
        int interestRate = Integer.parseInt(args[1]);
        int years = Integer.parseInt(args[2]);

        // エラーチェック
        if (!(1 <= principal && principal <= 1000000000)) {
            System.err.println("[ERROR]元金は1〜10億までの範囲で指定ください。");
            errFlag = true;
        }
        if (!(1 <= interestRate && interestRate <= 20)) {
            System.err.println("[ERROR]年利は1〜20までの範囲で指定ください。");
            errFlag = true;
        }
        if (!(1 <= years && years <= 20)) {
            System.err.println("[ERROR]年数は1〜20までの範囲で指定ください。");
            errFlag = true;
        }

        // 計算ロジック
        if (!errFlag) {
            // 変数の初期化
            int totalMonths = years * 12;
            int totalInterest = principal;

            System.out.println("===============================");

            for (int i = 0; i <= totalMonths; i++) {
                if (i == totalMonths) {
                    System.out.println("===============================");
                    System.out.println("元利合計:" + totalInterest + "円");
                    System.out.println("===============================");
                } else {
                    System.out.println(i + "ヶ月目: " + totalInterest + "円");
                }
                // 複利計算
                totalInterest =
                        totalInterest + (int) (totalInterest * interestRate * 0.01 * 1 / 12);
            }

        }
    }
}
