package chapter_02;

/**
 * 実行するためのクラス
 * 
 * @version 1.0
 * @author naoki
 */
public class Variable1 {
    /**
     * mainメソッド
     */
    public static void main(String[] args) {
        int number; // int型の変数numberを宣言
        number = 10; // numberに10を代入
        number = 20; // numberに20を再代入
        number = number + 1; // numberに1を足す
        System.out.println(number); // numberを表示する
    }
}
