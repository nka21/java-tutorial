package chapter_03;

public class EnzansiExec15 {
    public static void main(String[] args) {

        /*
         * 三項演算子
         */
        int a = Integer.parseInt(args[0]);

        // aが2の倍数なら10、そうでなければ20
        int n = a % 2 == 0 ? 10 : 20;
        System.out.println("n = " + n);

    }
}
