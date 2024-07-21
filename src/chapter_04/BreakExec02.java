package chapter_04;

public class BreakExec02 {
    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            i++;

            if (i == 5) {
                break;
            }
            System.out.println("iは" + i + "です");
        }
        System.out.println("while文を終了しました。");
    }
}
