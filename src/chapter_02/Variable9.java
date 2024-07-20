package chapter_02;

public class Variable9 {
    public static void main(String[] args) {
        int i = (int) 97.6; // doubleをintへキャスト
        double d = (double) i; // intをdoubleへキャスト
        byte b = (byte) d; // doubleをbyteへキャスト
        char c = (char) b; // byteをcharへキャスト
        int a = (int) (99 * 99.9); // 計算式もキャストできる

        System.out.println(i); // 97
        System.out.println(d); // 97.0
        System.out.println(b); // 97
        System.out.println(c); // a
        System.out.println(a); // 9890
    }
}
