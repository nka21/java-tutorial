package chapter_04.tasks_02;

public class ShoppingExec {
    public static void main(String[] args) {
        int totalPrice = Integer.parseInt(args[0]);
        int totalPayment = 0;

        if (totalPrice >= 10000) {
            totalPayment = (int) (totalPrice * 0.8 * 1.1);
        } else if (totalPrice >= 5000) {
            totalPayment = (int) (totalPrice * 1.1);
        } else {
            totalPayment = (int) (totalPrice * 1.1) + 800;
        }

        System.out.println("商品金額は:" + totalPrice + "円です");
        System.out.println("支払金額は:" + totalPayment + "円です");
    }
}
