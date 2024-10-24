package chapter_05.tasks_02;

public class SentenceExec {
    public static void main(String[] args) {
        // 解析対象の文字列
        String sentence =
                "The Java programming language stands out as a versatile, concurrent, class-based, and object-oriented language. Its design prioritizes simplicity, ensuring that a broad spectrum of programmers can attain proficiency in its usage. While Java shares some similarities with C and C++, its organizational structure sets it apart, omitting certain aspects from its predecessors and incorporating ideas from other programming languages. Unlike a research-oriented language, Java is meticulously crafted to serve as a production language. Following C. A. R. Hoare's advice on language design, the developers have steered clear of introducing untested features, emphasizing stability and reliability.Java boasts strong and static typing, a feature that clearly delineates between compile-time errors, which must be identified during compilation, and runtime errors. During compile time, programs are translated into a machine-independent byte code representation, contributing to the language's portability and versatility. This approach aligns with Hoare's principles, ensuring that the design is robust and error-free, providing a solid foundation for the development of a wide range of applications.";

        // 各文字（a〜e）の出現回数をカウント
        int[] letterCounts = countLetters(sentence);

        // 文字カウントの最大値を取得
        int maxLetterCount = getMaxCount(letterCounts);

        // グラフの構築
        boolean[][] graph = buildGraph(letterCounts, maxLetterCount);

        // グラフの出力
        printGraph(graph);

        // 項目名の出力
        System.out.println("-----");
        System.out.println("abcde");
    }

    /*
     * 文字列中のa〜eの文字をカウントし、それぞれの数を配列として返すメソッド
     */
    private static int[] countLetters(String sentence) {
        // a〜eの各文字をカウントする変数
        int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;

        // 文字列を1文字ずつ確認し、a〜eの出現回数を数える
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

        // 各文字のカウント結果を配列として返す（例: [countA, countB, ...]）
        return new int[] {countA / 5, countB / 5, countC / 5, countD / 5, countE / 5};
    }

    /*
     * 配列内の最大値を求めるメソッド
     */
    private static int getMaxCount(int[] letterCounts) {
        int maxLetterCount = 0;

        // 配列を走査して最大値を取得
        for (int count : letterCounts) {
            if (count > maxLetterCount) {
                maxLetterCount = count;
            }
        }

        return maxLetterCount;
    }

    /*
     * 文字カウントに基づいてグラフを構築するメソッド
     */
    private static boolean[][] buildGraph(int[] letterCounts, int maxLetterCount) {
        // 各文字のカウントに基づき、グラフを作成（初期値はfalse）
        boolean[][] graph = new boolean[letterCounts.length][maxLetterCount];

        // 文字数に応じて、対応するグラフ部分をtrueに設定
        for (int x = 0; x < letterCounts.length; x++) {
            for (int y = 0; y < maxLetterCount; y++) {
                graph[x][y] = y < letterCounts[x];
            }
        }

        return graph;
    }

    /*
     * グラフを可視化して出力するメソッド
     */
    private static void printGraph(boolean[][] graph) {
        // グラフを上から下へ、左から右へ出力
        for (int y = graph[0].length - 1; y >= 0; y--) {
            for (int x = 0; x < graph.length; x++) {
                System.out.print(graph[x][y] ? "*" : " ");
            }
            System.out.println("");
        }
    }
}
