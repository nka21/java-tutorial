package chapter_04;

public class NextExec03 {
    public static void main(String[] args) {

        // forの中のforをbreakで終了
        for (int i = 3; i <= 5; i++) {
            System.out.println(i + "の行動開始");

            for (int j = 1; j <= 9; j++) {
                if (i * j >= 10) {
                    break;
                }

                System.out.println(i + "*" + j + "=" + (i * j));
            }
            System.out.println(i + "の行動終了");
        }
        System.out.println("計算終了");
    }
}
