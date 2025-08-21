import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_79_A {
    public static int sum_func(int number, int variable_3_8) {
        return number + variable_3_8;
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 23;
        int number = 744;
        int divisor = 743;

        while (number % divisor == 1) {
            int variable_3_8 = 1;
            Queue<Integer> result_queue = new LinkedBlockingQueue<>();

            Thread worker_thread = new Thread(() -> {
                int result = sum_func(number, variable_3_8);
                result_queue.add(result);
            });
            worker_thread.start();
            try {
                worker_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number = result_queue.poll();

            while (x >= 0 && y >= 22 || x >= 1 && y >= 12 || x >= 2 && y >= 2) {
                int condition1 = 793;
                int condition2 = 669;
                if ((condition1 & condition2) != 0) {
                    if (a != 0) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x--;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else if (x >= 2 && y >= 2) {
                        x -= 2;
                        y -= 2;
                    } else if (x >= 1 && y >= 12) {
                        x--;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                a = 1 - a;
            }
            System.out.println(a == 1 ? "Ciel" : "Hanako");
        }
    }
}