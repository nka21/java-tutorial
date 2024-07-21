package chapter_04.tasks;

public class ShoppingExec {
    public static void main(String[] args) {

        // 商品金額をint型で定義
        int price = Integer.parseInt(args[0]);
        // 消費税率をdouble型で定義
        double taxRate = 0.1;
        // 支払い金額を0円で初期化
        int payment = 0;

        // 商品金額の10%の消費税
        payment += price + (price * taxRate);

        // === 条件分岐 ===

        if (price >= 10000) {
            // さらに商品金額が10000円以上の場合は、商品価格が20%引きとなる
            payment *= (1 - 0.20);
        } else if (price < 5000) {
            // 商品金額が5000円より少ない場合は、送料は800円
            payment += 800;
        }


        // 出力
        System.out.println("商品金額は:" + price + "円です");
        System.out.println("支払金額は:" + payment + "円です");
    }
}
