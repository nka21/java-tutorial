package chapter_04.tasks_02;

public class StudentTest2Exec {
    public static void main(String[] args) {
        // 変数の初期化
        int[] scores = new int[args.length];
        int sum = 0;

        // コマンドライン引数から配列への格納
        for (int i = 0; i < args.length; i++) {
            scores[i] += Integer.parseInt(args[i]);
        }

        // 計算ロジック
        for (int score : scores) {
            System.out.print("[" + score + "]");
            sum += score;
        }

        // 出力
        System.out.println("");
        System.out.println("総合点: " + sum);
        System.out.println("平均点: " + sum / scores.length);
    }
}
