import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.math.*;
import java.util.stream.*;

public class atcoder_AGC019_A {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<int[]> futureMap = executor.submit(new Callable<int[]>() {
            public int[] call() {
                Scanner scanner = new Scanner(System.in);
                int[] arr = new int[4];
                for (int i = 0; i < 4; i++) {
                    arr[i] = scanner.nextInt();
                }
                return arr;
            }
        });

        Future<Integer> futureInt = executor.submit(new Callable<Integer>() {
            public Integer call() {
                Scanner scanner = new Scanner(System.in);
                return scanner.nextInt();
            }
        });

        int[] arr = futureMap.get();
        int n = futureInt.get();

        int q = arr[0];
        int h = arr[1];
        int s = arr[2];
        int d = arr[3];

        int best1L = IntStream.of(q * 4, h * 2, s).min().getAsInt();
        int best2L = IntStream.of(d, best1L * 2).min().getAsInt();

        if (n % 2 == 0) {
            System.out.println((long)best2L * (n / 2));
        } else {
            System.out.println((long)best2L * (n / 2) + best1L);
        }

        executor.shutdown();
    }
}