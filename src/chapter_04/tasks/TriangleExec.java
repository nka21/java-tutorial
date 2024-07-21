package chapter_04.tasks;

public class TriangleExec {
    public static void main(String[] args) {
        // 入力データがあった場合
        if (args.length > 0) {
            int num = Integer.parseInt(args[0]);
            System.out.println("Input Number: " + num);
            if (num > 0) {
                for (int i = 1; i <= num; i++) {
                    for (int j = 1; j <= i; j++) {
                        // printlnだと出力した後に改行するのでprintで出力
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            // 入力データが0以下の場合
            else {
                System.out.println("0より大きい数字を入力してください。");
            }
        }
        // 入力データがなかった場合
        else {
            System.out.println("値を入力してください。");
        }
    }
}
