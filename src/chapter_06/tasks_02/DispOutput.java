package chapter_06.tasks_02;

public class DispOutput {
    public void outputExec(CompoundInterestResultBean[] resultBeanArray) {
        // 配列の最後を取得したいので、-1をする
        CompoundInterestResultBean lastResultBean = resultBeanArray[resultBeanArray.length - 1];
        // 最後のインデックスの値を取得
        int lastTotalInterest = lastResultBean.totalInterest;

        System.out.println("===============================");
        for (CompoundInterestResultBean result : resultBeanArray) {

            // 最終行かどうか
            if (lastTotalInterest == result.totalInterest) {
                System.out.println("===============================");
                System.out.println("元利合計: " + result.totalInterest + "円");
                System.out.println("===============================");
            } else {
                System.out.println(result.everyMonth + "ヶ月目: " + result.totalInterest + "円");
            }
        }
    }
}
