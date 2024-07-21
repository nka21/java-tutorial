package chapter_04;

public class NestExec05 {
    public static void main(String[] args) {

        int i = 0;

        while (i < 8) {
            i++;
            if (i == 5) {
                continue; // iが5の時のみ実行されない(スキップされる)
            }
            System.out.println("iは" + i + "です。");
        }

        System.out.println("while文を抜けました。");

    }
}
