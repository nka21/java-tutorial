package chapter_03;

public class EnzansiExec14 {
    public static void main(String[] args) {

        int a = 1, b = 1;

        // 式を評価した後、a,bに1を加算する
        // trueの場合、関係式２は実行しない。
        System.out.println(a++ == 0 || b++ == 0);
        System.out.println("a = " + a + " b = " + b);
    }
}
