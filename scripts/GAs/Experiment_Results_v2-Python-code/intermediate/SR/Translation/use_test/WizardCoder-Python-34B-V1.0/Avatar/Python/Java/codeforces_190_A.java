```java
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int CONDITION_CHECKER_ONE = 735;
        int CONDITION_CHECKER_TWO = 523;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int second_number = scanner.nextInt();
        if ((CONDITION_CHECKER_ONE & CONDITION_CHECKER_TWO) != 0) {
            if (n < 1) {
                if (second_number < 1) {
                    System.out.println(n + " " + second_number);
                    System.exit(0);
                }
                System.out.println("Impossible");
                System.exit(0);
            }
        }
        if (second_number > n) {
            int minimum_value = second_number;
            int third_number = 1;
            Lock lock = new ReentrantLock();
            Condition condition = lock.newCondition();
            int[] result = new int[1];

            Thread calculate_and_queue_result = new Thread(() -> {
                try {
                    lock.lock();
                    result[0] = calculate_sum_difference(n, third_number, second_number);
                    condition.signal();
                } finally {
                    lock.unlock();
                }
            });
            calculate_and_queue_result.start();

            try {
                lock.lock();
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int max = result[0];
            System.out.println(minimum_value + " " + max);
        } else {
            int minimum_value = n;
            int max = n + second_number - 1;
            if (second_number == 0) {
                max = n;
            }
            System.out.println(minimum_value + " " + max);
        }
    }

    public static int calculate_sum_difference(int n, int third_number, int second_number) {
        return n + second_number - third_number;
    }
}
``` 
