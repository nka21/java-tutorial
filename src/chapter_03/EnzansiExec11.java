package chapter_03;

public class EnzansiExec11 {
    public static void main(String[] args) {

        /*
         * 文字型(char型)は、数値であればどんな型とでも比較は可能
         */

        char ch = 'あ';
        // 比較だけならdoubleとでも可能
        System.out.println(ch > 15.5); // true

    }
}
