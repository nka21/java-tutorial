package chapter_06.tasks;

/**
 * 複利計算を行うクラスです。
 */
public class CompoundInterestCalculator {
    // 元金
    private int principal;
    // 年利率(%)
    private int rate;
    // 運用年数
    private int year;

    /**
     * コンストラクタ
     *
     * @param principal 元金
     * @param rate 年利率(%)
     * @param year 運用年数
     */
    public CompoundInterestCalculator(int principal, int rate, int year) {
        this.principal = principal;
        this.rate = rate;
        this.year = year;
    }

    /**
     * 複利計算を行い、結果を出力します。
     */
    public void calculateAndPrintCompoundInterest() {
        // 目標とする月数を計算（運用年数 * 12ヶ月）
        int targetMonth = year * 12;
        // 合計利息を元金で初期化
        int totalInterest = principal;
        // 計算結果を格納する配列
        int[] resultBeanArray = new int[targetMonth + 1];

        // 結果のヘッダを出力
        System.out.println("===============================");
        for (int month = 0; month <= targetMonth; month++) {
            // 各月の合計利息を配列に格納
            resultBeanArray[month] = totalInterest;

            if (month == targetMonth) {
                // 最終月の場合、合計利息を出力
                System.out.println("===============================");
                System.out.println("元利合計:" + totalInterest + "円");
                System.out.println("===============================");
            } else {
                // それ以外の場合、月ごとの利息を出力
                System.out.println(month + "ヶ月目:" + totalInterest + "円");
            }

            // 複利計算を行い、合計利息を更新
            // 月利率 = 年利率 / 12ヶ月
            totalInterest += (int) (totalInterest * rate * 0.01 / 12);
        }
    }
}
