package chapter_04;

public class IfExec02 {
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);

        if (i < 5) {
            System.out.println(i + "は5未満です。");
        } else {
            System.out.println(i + "は5以上です。");
        }

    }
}
