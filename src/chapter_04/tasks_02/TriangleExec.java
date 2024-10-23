package chapter_04.tasks_02;

public class TriangleExec {
    public static void main(String[] args) {
        if (args.length > 0) {
            int inputRows = Integer.parseInt(args[0]);
            if (inputRows > 0) {
                System.out.println("Input number: " + inputRows);

                for (int i = 0; i < inputRows; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            } else {
                System.out.println("Input number: " + inputRows);
                System.out.println("Please input again.");
            }
        } else {
            System.out.println("Please input one number.");
        }
    }
}
