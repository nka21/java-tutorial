package chapter_03;

public class EnzansiExec05 {
    public static void main(String[] args) {
        int total = 1000;
        double tax = 0.1;
        System.out.println("合計金額" + total + "円(税抜)です。");
        System.out.println("合計金額" + (total * (1 + tax)) + "円(税抜)です。");
    }
}
