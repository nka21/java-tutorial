package chapter_06.tasks_02;

public class CompoundInterestResultBean {
    // 経過月データ管理
    int everyMonth;
    // 複利合計(元金+利息)データ管理
    int totalInterest;

    public CompoundInterestResultBean(int everyMonth, int totalInterest) {
        this.everyMonth = everyMonth;
        this.totalInterest = totalInterest;
    }
}
