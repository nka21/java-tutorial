package chapter_04.tasks_02;

public class MaxValueExec {
    public static void main(String[] args) {
        if (args.length > 0) {
            int maxValue = 0;

            for (int i = 0; i < args.length; i++) {
                int currentNum = Integer.parseInt(args[i]);
                if (maxValue < currentNum) {
                    maxValue = currentNum;
                }
            }

            System.out.println("最大値は " + maxValue + " です");
        } else {
            System.out.println("Please input one number.");
        }
    }
}
