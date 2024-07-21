package chapter_04.tasks;

public class StudentTest1Exec {
    /**
     * mainメソッド コマンドライン引数として受け取った10個の学生のスコアを処理します。
     */
    public static void main(String[] args) {
        // 引数の数が10でなければエラーメッセージを表示して終了
        if (args.length != 10) {
            System.out.println("エラー:生徒の数が10名ではありません。");
            return;
        }

        // 学生のスコアを格納する配列を初期化
        int[] studentScores = new int[10];
        // スコアの合計を初期化
        int totalScore = 0;

        // 各学生のスコアを処理
        for (int i = 0; i < studentScores.length; i++) {
            try {
                // スコアを整数に変換して配列に格納
                studentScores[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                // スコアが整数でない場合はエラーメッセージを表示して終了
                System.out.println("エラー:無効な数値です。数字を入力してください。");
                return;
            }
            // スコアを表示
            System.out.print("【" + studentScores[i] + "】");
            // スコアを合計に追加
            totalScore += studentScores[i];
        }

        // 合計スコアと平均スコアを表示
        System.out.println("");
        System.out.println("総合点:" + totalScore);
        System.out.println("平均点:" + totalScore / studentScores.length);
    }
}
