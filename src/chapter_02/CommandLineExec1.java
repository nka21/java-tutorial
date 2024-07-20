package chapter_02;

public class CommandLineExec1 {
    public static void main(String[] args) {
        /*
         * 入力例 abc 123 3.45 こんにちは
         */
        System.out.println(args[0]); // abc
        System.out.println(args[1]); // 123
        System.out.println(args[2]); // 3.45
        System.out.println(args[3]); // こんにちは
    }
}
