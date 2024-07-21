package chapter_04;

public class NestExec04 {
    public static void main(String[] args) {

        outside:

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                int sum = i + j;

                if (sum > 5) {

                    System.out.println("break");
                    break outside; // 6行目のスコープまで戻る
                }

                System.out.println("i=" + i + " j=" + j + "i + j=" + sum);
            }
        }
    }
}
