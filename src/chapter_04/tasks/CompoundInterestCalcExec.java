package chapter_04.tasks;

public class CompoundInterestCalcExec {
    public static void main(String[] args) {
        // 入力チェック(元金 / 金利 / 年数)
        if (args.length != 3) {
            System.err.println("[ERROR] 元金 / 金利 / 年数 のみ指定して下さい。");
            return;
        }

        int principal = Integer.parseInt(args[0]); // 元金
        int rate = Integer.parseInt(args[1]); // 金利
        int year = Integer.parseInt(args[2]); // 年数

        // 入力値のバリデーション
        if (!isValidPrincipal(principal) || !isValidRate(rate) || !isValidYear(year)) {
            return; // 不正な入力があれば処理を終了
        }

        calculateAndPrintCompoundInterest(principal, rate, year);
    }

    /*
     * 元金、金利、年数それぞれの値が正確に入力されているかの判定メソッド
     */
    private static boolean isValidPrincipal(int principal) {
        // 入力された値が正しいかどうか
        if (principal <= 0 || principal > 1_000_000_000) {
            System.err.println("[ERROR]元金は1〜10億までの範囲で指定ください。");
            return false;
        }
        return true;
    }

    private static boolean isValidRate(int rate) {
        // 入力された値が正しいかどうか
        if (rate <= 0 || rate > 20) {
            System.err.println("[ERROR]年利は1〜20までの範囲で指定ください。");
            return false;
        }
        return true;
    }

    private static boolean isValidYear(int year) {
        // 入力された値が正しいかどうか
        if (year <= 0 || year > 20) {
            System.err.println("[ERROR]年数は1〜20までの範囲で指定ください。");
            return false;
        }
        return true;
    }

    /*
     * ３つの値のそれぞれの計算メソッド
     */
    private static void calculateAndPrintCompoundInterest(int principal, int rate, int year) {
        int targetMonth = year * 12;
        int totalInterest = principal;
        int[] resultBeanArray = new int[targetMonth + 1];

        System.out.println("===============================");
        for (int month = 0; month <= targetMonth; month++) {
            resultBeanArray[month] = totalInterest;

            if (month == targetMonth) {
                System.out.println("===============================");
                System.out.println("元利合計:" + totalInterest + "円");
                System.out.println("===============================");
            } else {
                System.out.println(month + "ヶ月目:" + totalInterest + "円");
            }

            // 複利計算
            totalInterest += (int) (totalInterest * rate * 0.01 / 12);
        }
    }
}
