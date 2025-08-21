```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int candeleIntere = scanner.nextInt();
        int b = scanner.nextInt();
        int s = 0;
        int restoSciolte = 0;
        int newwhileloopchecker17_1 = 122;
        int whileloopchecker27 = 121;
        while (newwhileloopchecker17_1 % whileloopchecker27 == 1) {
            int variable_3_10 = 1;
            Queue<Integer> result_queue = new LinkedList<>();
            Thread calculation_thread = new Thread(() -> {
                result_queue.add(add_numbers(variable_3_10, newwhileloopchecker17_1));
            });
            calculation_thread.start();
            try {
                calculation_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculated_result = result_queue.peek();
            newwhileloopchecker17_1 = calculated_result;
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += newFunc0_27(b, restoSciolte);
                restoSciolte = restoSciolte % b;
                s = s + candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere = candeleIntere / b;
            }
        }
        System.out.println(s);
    }

    public static int newFunc0_27(int b, int restoSciolte) {
        return restoSciolte / b;
    }

    public static int add_numbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}
```

Test input:
3 2

Expected output:
5 
