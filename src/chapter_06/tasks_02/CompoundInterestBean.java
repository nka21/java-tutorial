package chapter_06.tasks_02;

public class CompoundInterestBean {
    // 元金データ管理用
    int principal;
    // 金利データ管理用
    int rate;
    // 年数データ管理用
    int year;

    public CompoundInterestBean(int principal, int rate, int year) {
        this.principal = principal;
        this.rate = rate;
        this.year = year;
    }

    // 複利計算メソッド
    public CompoundInterestResultBean[] compoundInterestCalc() {
        int targetMonth = this.year * 12;
        int totalInterest = this.principal;

        // 0ヶ月目から計算するため+1
        CompoundInterestResultBean[] resultBeanArray =
                new CompoundInterestResultBean[targetMonth + 1];

        for (int everyMonth = 0; everyMonth <= targetMonth; everyMonth++) {
            // 各月の複利計算結果を、resultBeanArray配列に格納 例([0,100000] 0ヶ月目 100000円)
            CompoundInterestResultBean resultBean =
                    new CompoundInterestResultBean(everyMonth, totalInterest);
            resultBeanArray[everyMonth] = resultBean;

            // 複利計算
            totalInterest = totalInterest + (int) (totalInterest * rate * 0.01 * 1 / 12);
        }

        return resultBeanArray;
    }
}
