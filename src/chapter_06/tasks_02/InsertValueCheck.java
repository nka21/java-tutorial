package chapter_06.tasks_02;

public class InsertValueCheck {
    public static boolean isCheckedArgsCount(String[] args) {
        boolean errFlag = false;

        if (!(args.length == 3)) {
            System.err.println("[ERROR] 元金 / 金利 / 年数 のみ指定してください。");
            errFlag = true;
        }

        // trueで返すことで、CompoundInterestCalcExecクラスのmainメソッドで扱いやすい
        return errFlag;
    }

    // エラーが出た場合、返り値を-1として取得する
    public static int checkedPrincipal(String strPrincipal) {
        int intPrincipal = Integer.parseInt(strPrincipal);

        if (!(1 <= intPrincipal && intPrincipal <= 1000000000)) {
            System.err.println("[ERROR] 元金は1~10億までの範囲で指定してください。");
            intPrincipal = -1;
        }

        return intPrincipal;
    }

    // エラーが出た場合、返り値を-1として取得する
    public static int checkedRate(String strRate) {
        int intRate = Integer.parseInt(strRate);

        if (!(1 <= intRate && intRate <= 20)) {
            System.err.println("[ERROR] 年利は1~20までの範囲で指定してください。");
            intRate = -1;
        }

        return intRate;
    }

    // エラーが出た場合、返り値を-1として取得する
    public static int checkedYear(String strYear) {
        int intYear = Integer.parseInt(strYear);

        if (!(1 <= intYear && intYear <= 20)) {
            System.err.println("[ERROR] 年数は1~20までの範囲で指定してください。");
            intYear = -1;
        }

        return intYear;
    }
}
