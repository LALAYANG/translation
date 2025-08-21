```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] input_array = new int[n];
        for (int i = 0; i < n; i++) {
            input_array[i] = scanner.nextInt();
        }
        int[] result_array = new int[n];
        int mx = input_array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            result_array[i] = Math.max(0, mx - input_array[i] + 1);
            if (input_array[i] > mx) {
                mx = input_array[i];
            }
        }
        for (int i : result_array) {
            System.out.print(i + " ");
        }
    }
}
``` 
