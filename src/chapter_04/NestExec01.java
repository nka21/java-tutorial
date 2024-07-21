package chapter_04;

public class NestExec01 {
    public static void main(String[] args) {
        // 多重ループ for文の中にfor
        int i = 0, j = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.println("iは " + i + " jは " + j);
            }
            System.out.println("--------------");
        }
        System.out.println("各ループの処理が終了しました。");
    }
}
