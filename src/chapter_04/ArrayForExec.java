package chapter_04;

public class ArrayForExec {
    public static void main(String[] args) {

        // 配列
        int[] intArray = {10, 20, 30, 40, 50};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // 拡張配列 配列全てが最初から順番にアクセス可
        int[] intArray2 = {10, 20, 30, 40, 50};

        for (int i : intArray2) {
            System.out.println(i);
        }
    }
}
