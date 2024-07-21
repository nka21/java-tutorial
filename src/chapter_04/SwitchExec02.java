package chapter_04;

public class SwitchExec02 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        switch (n) {
            case 1:
                System.out.println("1です。");
            case 2:
                System.out.println("2です。");
            case 3:
                System.out.println("3です。");
            default:
                System.out.println("1、2、3以外です。");
        }

    }
}
