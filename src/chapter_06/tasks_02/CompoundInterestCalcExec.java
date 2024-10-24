package chapter_06.tasks_02;

public class CompoundInterestCalcExec {
    public static void main(String[] args) {
        if (!(InsertValueCheck.isCheckedArgsCount(args))) {
            // コマンドライン引数が正しく要件通り入力された時の処理
            int intPrincipal = InsertValueCheck.checkedPrincipal(args[0]);
            int intRate = InsertValueCheck.checkedRate(args[1]);
            int intYear = InsertValueCheck.checkedYear(args[2]);

            if (intPrincipal > 0 && intRate > 0 && intYear > 0) {
                // 入力値の格納
                CompoundInterestBean ciBean =
                        new CompoundInterestBean(intPrincipal, intRate, intYear);
                // 複利計算実行
                CompoundInterestResultBean[] resultBeanArray = ciBean.compoundInterestCalc();

                // 出力
                DispOutput o = new DispOutput();
                o.outputExec(resultBeanArray);
            }
        }
    }
}
