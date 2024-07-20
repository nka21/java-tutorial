package chapter_02;

public class ArrayExec {
    /**
     * mainメソッド
     */
    public static void main(String[] args) {
        // 配列を初期化
        int[] a = {1, 2, 3, 4, 5};
        double[] b = {1.1, 1.2, 1.3, 1.4, 1.5};
        char[] c = {'お', 'は', 'よ', 'う'};
        String[] d = {"おはよう", "こんにちは", "こんばんは", "さようなら"};
        boolean[] e = {true, true, false, true};

        // 配列の要素番号0を出力
        System.out.println(a[0]); // 1
        System.out.println(b[0]); // 1.1
        System.out.println(c[0]); // お
        System.out.println(d[0]); // おはよう
        System.out.println(e[0]); // true

        // 多次元配列の利用
        int[][] x = {{10, 2, 4, 9, 8, 7, 5}, {7, 2, 5, 4, 3}};
        System.out.println(x[0][0]); // 10
        System.out.println(x[0][1]); // 2
        System.out.println(x[0][2]); // 4
        System.out.println(x[0][3]); // 9
        System.out.println(x[0][4]); // 8
        System.out.println(x[0][5]); // 7
        System.out.println(x[0][6]); // 5
        System.out.println(x[1][0]); // 7
        System.out.println(x[1][1]); // 2
        System.out.println(x[1][2]); // 5
        System.out.println(x[1][3]); // 4
        System.out.println(x[1][4]); // 3
    }
}
