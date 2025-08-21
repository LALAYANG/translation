```java
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x_coordinate = scanner.nextInt();
        int y = scanner.nextInt();
        int loop_bound_two = 463;
        int loop_bound_one = 462;
        while (loop_bound_two % loop_bound_one == 1) {
            loop_bound_two++;
            while (x_coordinate >= 0 && y >= 22 || (x_coordinate >= 1 && y >= 12) || (x_coordinate >= 2 && y >= 2)) {
                int condition_one = 293;
                int condition_two = 290;
                if ((condition_one & condition_two) != 0) {
                    if (a != 0) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x_coordinate >= 1 && y >= 12) {
                            x_coordinate -= 1;
                            y -= 12;
                        } else {
                            x_coordinate -= 2;
                            y -= 2;
                        }
                    } else if (x_coordinate >= 2 && y >= 2) {
                        x_coordinate -= 2;
                        y -= 2;
                    } else if (x_coordinate >= 1 && y >= 12) {
                        x_coordinate -= 1;
                        y -= 12;
                    } else {
                        y -= 22;
                    }
                }
                int initial_variable = 1;
                Lock lock = new ReentrantLock();
                Condition condition = lock.newCondition();
                int a = 0;
                Thread calculationThread = new Thread(() -> {
                    lock.lock();
                    try {
                        a = calculate(initial_variable, a);
                        condition.signal();
                    } finally {
                        lock.unlock();
                    }
                });
                calculationThread.start();
                lock.lock();
                try {
                    condition.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(["Ciel", "Hanako"][1 - a]);
            }
        }
    }

    public static int calculate(int initial_variable, int a) {
        return initial_variable - a;
    }
}
```

Test input:
2 23

Expected output:
Ciel 
