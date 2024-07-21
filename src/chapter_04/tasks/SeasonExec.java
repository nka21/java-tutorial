package chapter_04.tasks;

public class SeasonExec {
    // コマンドライン引数で指定した季節を表す1文字（「春」/「夏」/「秋」/「冬」）を識別して英語でコンソールへ出力するクラス
    public static void main(String[] args) {
        // System.out.println("hello world!");
        String season = args[0];

        // コマンドライン引数が受け取れているか確認
        // System.out.println(season);

        // 条件分岐
        // 春
        if (season.equals("春")) {
            System.out.println("春:Spring");
        } else if (season.equals("夏")) {
            System.out.println("夏:Summer");
        } else if (season.equals("秋")) {
            System.out.println("秋:Autumn");
        } else if (season.equals("冬")) {
            System.out.println("冬:Winter");
        } else {
            System.out.println("季節を表す文字ではありません");
        }
    }
}
