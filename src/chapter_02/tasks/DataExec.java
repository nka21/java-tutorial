package chapter_02.tasks;

public class DataExec {
    /**
     * mainメソッド
     */
    public static void main(String[] args) {
        /**
         * 42 int型 123456789 long型 32767 short型 100 byte型 3.14 float型 2.71828 double型 42 3 2
         */

        // 初期化
        int intValue = 42;
        long longValue = 123456789L;
        short shortValue = 32767;
        byte byteValue = 100;
        float floatValue = 3.14f;
        double doubleValue = 2.71828;

        // キャスト
        long castLongValue = (long) intValue;
        int castIntValue1 = (int) floatValue;
        int castIntValue2 = (int) doubleValue;

        // 出力
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(shortValue);
        System.out.println(byteValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);
        System.out.println(castLongValue);
        System.out.println(castIntValue1);
        System.out.println(castIntValue2);
    }
}
