package chapter_02;

public class CommandLineExec2 {
    public static void main(String[] args) {
        System.out.println(args[0]);

        int num1 = Integer.parseInt(args[1]); // String型のデータをint型のデータへ変換し、num1へ代入
        int num2 = Integer.parseInt(args[2]); // num2へ代入
        int result = num1 + num2;
        System.out.println("result: " + result);
    }
}
