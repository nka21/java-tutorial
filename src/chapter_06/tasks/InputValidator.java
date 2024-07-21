package chapter_06.tasks;

/**
 * 入力値のバリデーションを行うクラス 元金、年利率、運用年数の入力値が適切な範囲内にあるかをチェックします。
 */
public class InputValidator {
    /**
     * 元金のバリデーションを行います。
     *
     * @param principal 元金
     * @return 元金が1から10億の範囲内であればtrue、それ以外はfalse
     */
    public boolean isValidPrincipal(int principal) {
        // 元金が1から10億の範囲内にあるかチェック
        if (principal <= 0 || principal > 1_000_000_000) {
            System.err.println("[ERROR]元金は1〜10億までの範囲で指定ください。");
            return false;
        }
        return true;
    }

    /**
     * 年利率のバリデーションを行います。
     *
     * @param rate 年利率
     * @return 年利率が1から20の範囲内であればtrue、それ以外はfalse
     */
    public boolean isValidRate(int rate) {
        // 年利率が1から20の範囲内にあるかチェック
        if (rate <= 0 || rate > 20) {
            System.err.println("[ERROR]年利は1〜20までの範囲で指定ください。");
            return false;
        }
        return true;
    }

    /**
     * 運用年数のバリデーションを行います。
     *
     * @param year 運用年数
     * @return 運用年数が1から20の範囲内であればtrue、それ以外はfalse
     */
    public boolean isValidYear(int year) {
        // 運用年数が1から20の範囲内にあるかチェック
        if (year <= 0 || year > 20) {
            System.err.println("[ERROR]年数は1〜20までの範囲で指定ください。");
            return false;
        }
        return true;
    }
}
