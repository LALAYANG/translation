import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class codeforces_79_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int a = 0;
        int number = 744;
        int divisor = 743;
        while (number % divisor == 1) {
            int variable_3_8 = 1;
            Queue<Integer> resultQueue = new LinkedList<>();

            Thread workerThread = new Thread(() -> {
                int result = sumFunc(number, variable_3_8);
                resultQueue.add(result);
            });
            workerThread.start();
            try {
                workerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sumResult = resultQueue.poll();
            number = sumResult;
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int condition1 = 793;
                int condition2 = 669;
                if ((condition1 & condition2) != 0) {
                    if (a != 0) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x -= 1;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else {
                        if (x >= 2 && y >= 2) {
                            x -= 2;
                            y -= 2;
                        } else if (x >= 1 && y >= 12) {
                            x -= 1;
                            y -= 12;
                        } else {
                            y -= 22;
                        }
                    }
                }
                a = 1 - a;
            }
        }
        System.out.println(a == 0 ? "Ciel" : "Hanako");
    }

    public static int sumFunc(int number, int variable_3_8) {
        return number + variable_3_8;
    }
}