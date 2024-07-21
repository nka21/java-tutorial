package chapter_04;

public class BreakExec01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // iが5になった時に、for文が終わる
            }
            System.out.println("iは" + i + "です");
        }
        System.out.println("for文を終了しました。");
    }
}
