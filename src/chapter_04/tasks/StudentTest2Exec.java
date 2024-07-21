package chapter_04.tasks;

public class StudentTest2Exec {
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
        int index = 0;
        for (String arg : args) {
            try {
                // スコアを整数に変換して配列に格納
                studentScores[index] = Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                // スコアが整数でない場合はエラーメッセージを表示して終了
                System.out.println("エラー:無効な数値です。数字を入力してください。");
                return;
            }
            // スコアを表示
            System.out.print("【" + studentScores[index] + "】");
            // スコアを合計に追加
            totalScore += studentScores[index];
            index++;
        }

        // 合計スコアと平均スコアを表示
        System.out.println("");
        System.out.println("総合点:" + totalScore);
        System.out.println("平均点:" + totalScore / studentScores.length);
    }
}
