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
        int dividend = 122;
        int divisor = 121;
        while (dividend % divisor == 1) {
            int variable_3_10 = 1;
            Queue<Integer> result_queue = new LinkedList<>();
            Thread calculation_thread = new Thread(() -> {
                result_queue.add(add_numbers(variable_3_10, dividend));
            });
            calculation_thread.start();
            try {
                calculation_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int calculated_result = result_queue.peek();
            dividend = calculated_result;
            while (candeleIntere > 0 || restoSciolte >= b) {
                candeleIntere += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += candeleIntere;
                restoSciolte += candeleIntere % b;
                candeleIntere /= b;
            }
        }
        System.out.println(s);
    }

    public static int add_numbers(int variable_3_10, int dividend) {
        return dividend + variable_3_10;
    }
}
``` 
