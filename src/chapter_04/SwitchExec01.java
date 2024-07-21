package chapter_04;

public class SwitchExec01 {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        switch (n) {
            case 1:
                System.out.println("1です。");
                break;
            case 2:
                System.out.println("2です。");
                break;
            case 3:
                System.out.println("3です。");
                break;
            default:
                System.out.println("1、2、3以外です。");
        }

    }
}
