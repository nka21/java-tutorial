package chapter_04;

public class SwitchExec03 {
    public static void main(String[] args) {

        switch (args[0]) {
            case "AA":
            case "BB":
                System.out.println("入力された文字列はAAかBBです。");
                break;
            case "CC":
                System.out.println("入力された文字列はCCです。");
                break;
            default:
                System.out.println("入力された文字列はAA、BB、CC以外です。");

        }

    }
}
