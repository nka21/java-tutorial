package chapter_05.tasks;

public class SentenceExec {
    // メインメソッド: プログラムのエントリーポイント
    public static void main(String[] args) {
        // 解析する文
        String sentence =
                "The Java programming language stands out as a versatile, concurrent, class-based, and object-oriented language. Its design prioritizes simplicity, ensuring that a broad spectrum of programmers can attain proficiency in its usage. While Java shares some similarities with C and C++, its organizational structure sets it apart, omitting certain aspects from its predecessors and incorporating ideas from other programming languages. Unlike a research-oriented language, Java is meticulously crafted to serve as a production language. Following C. A. R. Hoare's advice on language design, the developers have steered clear of introducing untested features, emphasizing stability and reliability.Java boasts strong and static typing, a feature that clearly delineates between compile-time errors, which must be identified during compilation, and runtime errors. During compile time, programs are translated into a machine-independent byte code representation, contributing to the language's portability and versatility. This approach aligns with Hoare's principles, ensuring that the design is robust and error-free, providing a solid foundation for the development of a wide range of applications.";

        // 文中の特定の文字の出現回数をカウント
        int[] values = countSentence(sentence);
        // X軸の最大値を設定
        int xMaxAxis = values.length;
        // Y軸の最大値を取得
        int yMaxAxis = getMaxValue(values);

        // 出力用の真偽値マトリックスを生成
        boolean[][] output = generateOutputMatrix(xMaxAxis, yMaxAxis, values);
        // マトリックスを出力
        printOutputMatrix(output, xMaxAxis, yMaxAxis);

        // 区切り線と文字列を出力
        System.out.println("-----");
        System.out.println("abcde");
    }

    // 文中の'a', 'b', 'c', 'd', 'e'の出現回数をカウントし、それぞれ5で割った結果を配列で返す
    private static int[] countSentence(String sentence) {
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;
        for (char ch : sentence.toCharArray()) {
            switch (ch) {
                case 'a':
                    countA++;
                    break;
                case 'b':
                    countB++;
                    break;
                case 'c':
                    countC++;
                    break;
                case 'd':
                    countD++;
                    break;
                case 'e':
                    countE++;
                    break;
            }
        }
        return new int[] {countA / 5, countB / 5, countC / 5, countD / 5, countE / 5};
    }

    // 配列内の最大値を返す
    private static int getMaxValue(int[] values) {
        int max = 0;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    // 指定された値に基づいて真偽値マトリックスを生成する
    private static boolean[][] generateOutputMatrix(int xMaxAxis, int yMaxAxis, int[] values) {
        boolean[][] output = new boolean[xMaxAxis][yMaxAxis];
        for (int x = 0; x < xMaxAxis; x++) {
            for (int y = 0; y < values[x]; y++) {
                output[x][y] = true;
            }
        }
        return output;
    }

    // 真偽値マトリックスを基に、'*'または空白を出力してグラフを描画する
    private static void printOutputMatrix(boolean[][] output, int xMaxAxis, int yMaxAxis) {
        for (int y = yMaxAxis - 1; y >= 0; y--) {
            for (int x = 0; x < xMaxAxis; x++) {
                System.out.print(output[x][y] ? "*" : " ");
            }
            System.out.println();
        }
    }
}
