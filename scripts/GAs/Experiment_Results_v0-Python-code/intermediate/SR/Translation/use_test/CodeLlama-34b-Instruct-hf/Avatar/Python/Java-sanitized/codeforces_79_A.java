import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_79_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int number = 744;
        int divisor = 743;
        int variable_3_8 = 1;
        int sum_result = 0;
        int a = 0;

        while (number % divisor == 1) {
            Queue<Integer> result_queue = new Queue<>();

            Thread worker_thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = sum_func(number, variable_3_8);
                    result_queue.add(result);
                }
            });

            worker_thread.start();
            worker_thread.join();

            sum_result = result_queue.poll();
            number = sum_result;

            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int condition1 = 793;
                int condition2 = 669;
                if (condition1 & condition2) {
                    if (a == 1) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x -= 1;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else if (x >= 2 && y >= 2) {
                        x -= 2;
                        y -= 2;
                    } else if (x >= 1 && y >= 12) {
                        x -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                a = 1 - a;
            }
        }

        System.out.println(["Ciel", "Hanako"][1 - a]);
    }

    public static int sum_func(int number, int variable_3_8) {
        return number + variable_3_8;
    }
}