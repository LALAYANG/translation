import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC145_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            x.add(scanner.nextInt());
            y.add(scanner.nextInt());
        }

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i != j) {
                        int distance = (int) Math.sqrt(Math.pow(x.get(i) - x.get(j), 2) + Math.pow(y.get(i) - y.get(j), 2));
                        System.out.println(distance);
                    }
                }
            }
        });

        executor.submit(() -> {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i != j) {
                        int distance = (int) Math.sqrt(Math.pow(x.get(i) - x.get(j), 2) + Math.pow(y.get(i) - y.get(j), 2));
                        System.out.println(distance);
                    }
                }
            }
        });

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}