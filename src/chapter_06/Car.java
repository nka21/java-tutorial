package chapter_06;

public class Car {
    private String carName;
    private int number;
    private int gas;
    private String bodyColor;

    public Car(String carName, int number, int gas, String bodyColor) {
        this.carName = carName;
        this.number = number;
        this.gas = gas;
        this.bodyColor = bodyColor;
    }

    public void display() {
        System.out.println("-----------------");
        System.out.println("名前:" + this.carName);
        System.out.println("ナンバー:" + this.number);
        System.out.println("ガソリン:" + this.gas);
        System.out.println("ボディー色:" + this.bodyColor);
        System.out.println("-----------------");
    }

    /**
     * 走行するためのメソッド
     * 
     * @param direction String型 走行方向
     * @return 無し
     */
    public void goRun(String direction) {
        gas--; // "gass" を "gas" に修正
        System.out.println(direction + "へ進む");
    }

    /**
     * 停止するためのメソッド
     * 
     * @param 無し
     * @return 無し
     */
    public void stop() {
        System.out.println("止まる");
    }
}
