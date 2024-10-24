package chapter_05.tasks_02;

public class SentenceExec {
    public static void main(String[] args) {
        // 解析する文字列
        String sentence =
                "The Java programming language stands out as a versatile, concurrent, class-based, and object-oriented language. Its design prioritizes simplicity, ensuring that a broad spectrum of programmers can attain proficiency in its usage. While Java shares some similarities with C and C++, its organizational structure sets it apart, omitting certain aspects from its predecessors and incorporating ideas from other programming languages. Unlike a research-oriented language, Java is meticulously crafted to serve as a production language. Following C. A. R. Hoare's advice on language design, the developers have steered clear of introducing untested features, emphasizing stability and reliability.Java boasts strong and static typing, a feature that clearly delineates between compile-time errors, which must be identified during compilation, and runtime errors. During compile time, programs are translated into a machine-independent byte code representation, contributing to the language's portability and versatility. This approach aligns with Hoare's principles, ensuring that the design is robust and error-free, providing a solid foundation for the development of a wide range of applications.";

        // 文字のカウント
        int[] letterCounts = countLetters(sentence);

        // 最大値の取得
        int maxCount = getMaxCount(letterCounts);

        // グラフの構築
        boolean[][] graph = buildGraph(letterCounts, maxCount);

        // グラフの出力
        printGraph(graph);

        // 項目出力
        System.out.println("-----");
        System.out.println("abcde");
    }

    /*
     * sentense定数のa~eの文字の個数をカウントするメソッド グラフ構築の時に、X軸として必要になる
     */
    private static int[] countLetters(String sentence) {
        // A~Eのカウントをするために、int型で初期化
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;

        // a~eがあれば、各変数をインクリメント
        for (char count : sentence.toCharArray()) {
            switch (count) {
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
                default:
                    break;
            }
        }

        return new int[] {countA / 5, countB / 5, countC / 5, countD / 5, countE / 5};
    }

    /*
     * countLetters配列の最大値を求めるメソッド グラフ構築の時に、Y軸として必要になる
     */
    private static int getMaxCount(int[] letterCounts) {
        int maxCount = 0;

        // 最大値の更新
        for (int count : letterCounts) {
            if (count > maxCount) {
                maxCount = count;
            }
        }

        return maxCount;
    }

    /*
     * グラフの構築をするメソッド
     */
    private static boolean[][] buildGraph(int[] letterCounts, int maxCount) {
        // letterCountsとmaxCountで何行何列かを定義して、全てをfalseにする
        boolean[][] graph = new boolean[letterCounts.length][maxCount];

        // falseにされた2次元配列を、trueにしていく
        for (int x = 0; x < letterCounts.length; x++) {
            for (int y = 0; y < maxCount; y++) {
                graph[x][y] = y < letterCounts[x];
            }
        }

        return graph;
    }

    /*
     * グラフの出力
     */
    private static void printGraph(boolean[][] graph) {
        // 上から右へとアスタリスクの記述
        for (int y = graph[0].length - 1; y >= 0; y--) {
            for (int x = 0; x < graph.length; x++) {
                System.out.print(graph[x][y] ? "*" : " ");
            }
            System.out.println("");
        }
    }
}
