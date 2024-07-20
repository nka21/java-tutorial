package chapter_03;

public class EnzansiExec08 {
    public static void main(String[] args) {
        int a = 0;
        // 変数aの値を5だけ増やした値にする
        a += 5; // a = a + 5;
        System.out.println(a);

        int b = 5;
        // 変数bの値を3だけ減らした値にする
        b -= 3; // b = b - 3;
        System.out.println(b);

        int c = 2;
        // 変数cの値を６倍にした値にする
        c *= 6; // c = c * 6;
        System.out.println(c);

        int d = 12;
        // 変数dの値を4で割った値にする
        d /= 4; // d = d / 4;
        System.out.println(d);

        int e = 3;
        // 変数eの値を2で割った余りの値にする
        e %= 2; // e = e % 4;
        System.out.println(e);
    }
}
