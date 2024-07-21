package chapter_04;

public class IfExec03 {
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);

        if (i < 0) {
            System.out.println(i + "は0より小さいです。");
        } else if (i <= 15) {
            System.out.println(i + "は0〜15の間です。");
        } else {
            System.out.println(i + "は15よりも大きいです。");

        }

    }
}
