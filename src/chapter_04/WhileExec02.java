package chapter_04;

public class WhileExec02 {
    public static void main(String[] args) {

        int n = -5;

        do {
            System.out.println(n); // 繰り返したい処理
            n++;
        } while (n < 0); // 条件式
    }
}
