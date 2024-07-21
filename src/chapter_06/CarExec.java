// CarExec.java
package chapter_06;

public class CarExec {
    public static void main(String[] args) {
        Car car = new Car("RX7", 1234, 20, "blue");

        car.display();
        car.goRun("右");
        car.stop();
    }
}
