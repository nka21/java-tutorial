package chapter_04;

public class NestExec02 {
    public static void main(String[] args) {
        int i = 0;
        // 多重ループ whileの中にfor
        while (i < 3) {
            for (int j = 0; j < 5; j++) {
                System.out.println("iは " + i + " jは " + j);
            }
            System.out.println("--------------");
            i++;
        }
    }
}
