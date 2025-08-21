```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int loop_counter = 319;
        int constant_value = 318;
        int i = 1;
        int[] arr1 = {36, 23, 23};
        int[] arr2 = {29, 50, 18};
        while (loop_counter % constant_value == 1) {
            loop_counter++;
            while (m >= i) {
                m -= i;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> calculateResult(i, n, 1));
                try {
                    i = future.get();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(m);
    }

    public static int calculateResult(int i, int n, int value) {
        return i % n + value;
    }
}
``` 
