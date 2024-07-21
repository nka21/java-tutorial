package chapter_04.tasks;

public class MaxValueExec {
    public static void main(String[] args) {

        if (args.length > 0) {
            // コマンドラインに入力されるデータは正の数値のみとする(データ範囲は int 型とする)
            // 最大値を格納するための変数を宣言し、0 を代入する
            int max = 0;
            int num = 0;
            // コマンドラインに入力されたデータの要素数分、次の内容の処理を繰り返し行う
            for (int i = 0; i < args.length; i++) {
                num = Integer.parseInt(args[i]);
                // 最大値を格納している変数とコマンドラインから取得したデータを比較
                // コマンドライン引数のデータのほうが大きい場合は、最大値を格納する変数に格納する
                if (max < num) {
                    max = num;
                }
            }

            // 最大値を標準出力する
            System.out.println("最大値は " + max + " です");
        } else {
            // コマンドラインから入力されるデータが無い場合、エラーメッセージを表示し、プログラムを終了させる
            System.out.println("Please input one number.");
        }
    }
}
