package chapter_04.tasks_02;

public class SeasonExec {
    public static void main(String[] args) {
        String season = args[0];

        switch (season) {
            case "春":
                System.out.println(season + ":Spring");
                break;
            case "夏":
                System.out.println(season + ":Summer");
                break;
            case "秋":
                System.out.println(season + ":Autumn");
                break;
            case "冬":
                System.out.println(season + ":Winter");
                break;
            default:
                System.out.println("季節を表す文字ではありません。");
                break;
        }
    }
}
