package chapter_04.tasks_02;

public class TriangleExec {
    public static void main(String[] args) {
        if (args.length > 0) {
            // 入力値があったとき
            int inputRows = Integer.parseInt(args[0]);
            if (inputRows > 0) {
                System.out.println("Input number: " + inputRows);

                // 三角形作るロジック
                for (int i = 0; i < inputRows; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            } else {
                // 入力値があったけれど、0以下の数字だった場合
                System.out.println("Input number: " + inputRows);
                System.out.println("Please input again.");
            }
        } else {
            // そもそも入力値に値がなかった場合
            System.out.println("Please input one number.");
        }
    }
}
