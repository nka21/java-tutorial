package chapter_04;

public class WhileExec01 {
    public static void main(String[] args) {

        int i = Integer.parseInt(args[0]);

        // 条件式を指定する場合は、無限ループにならないように
        while (i > 0) {
            System.out.println("あと" + i + "回");
            i--;
        }

    }
}
