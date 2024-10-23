package chapter_04.tasks_02;

public class StudentTest1Exec {
    public static void main(String[] args) {
        // 変数の初期化
        int[] scores = new int[args.length];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(args[i]);
            System.out.print("[" + scores[i] + "]");
            sum += scores[i];
        }

        // 出力
        System.out.println("");
        System.out.println("総合点: " + sum);
        System.out.println("平均点: " + sum / scores.length);
    }
}
