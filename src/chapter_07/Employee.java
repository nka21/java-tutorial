package chapter_07;

public class Employee {

    /**
     * 社員名を保持
     */
    private String empName; // privateアクセス修飾子を付加

    /**
     * 社員番号を保持
     */
    private int empNo; // publicアクセス修飾子を付加

    /**
     * コンストラクタ
     */
    public Employee(String empName, int empNo) {
        this.empName = empName;
        this.empNo = empNo;
    }

    /**
     * 社員データ情報表示
     * 
     * @param 無し
     * @return 無し
     */
    public void disp() {
        System.out.println("社員名:" + empName);
        System.out.println("社員番号" + empNo);
    }
}
