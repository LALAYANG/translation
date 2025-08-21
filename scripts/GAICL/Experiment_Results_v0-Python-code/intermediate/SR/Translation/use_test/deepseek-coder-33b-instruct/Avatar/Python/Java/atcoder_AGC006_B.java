Here is the Java translation of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static int outer_loop_limit = 875;
    private static int inner_loop_step = 874;
    private static int is_condition_133_met = 785;
    private static int is_condition_233_met = 484;
    private static int is_condition_131_met = 127;
    private static int is_condition_231_met = 718;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        if ((is_condition_133_met & is_condition_233_met) != 0) {
            if ((is_condition_131_met & is_condition_231_met) != 0) {
                if (X == 1 || X == N * 2 - 1) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    List<Integer> xs;
                    if (X == N * 2 - 2) {
                        xs = new ArrayList<>();
                        for (int i = N - 1; i <= X + 2; i++) {
                            xs.add(i);
                        }
                        for (int i = 1; i < N - 1; i++) {
                            xs.add(i);
                        }
                    } else {
                        List<Integer> ys = new ArrayList<>();
                        for (int i = 1; i < X - 1; i++) {
                            ys.add(i);
                        }
                        for (int i = X + 3; i < N * 2; i++) {
                            ys.add(i);
                        }
                        xs = new ArrayList<>(ys.subList(0, N - 3));
                        xs.add(X + 2);
                        xs.add(X - 1);
                        xs.add(X);
                        xs.add(X + 1);
                        xs.addAll(ys.subList(N - 3, ys.size()));
                    }
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    for (int x : xs) {
                        Future<Integer> future = executorService.submit(new Callable<Integer>() {
                            @Override
                            public Integer call() throws Exception {
                                return calc(x);
                            }
                        });
                        System.out.println(future.get());
                    }
                    executorService.shutdown();
                }
            }
        }
    }

    private static int calc(int x) {
        List<Integer> y = new ArrayList<>();
        y.add(x);
        while (y.size() > 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < y.size() - 2; i++) {
                List<Integer> subList = y.subList(i, i + 3);
                Collections.sort(subList);
                temp.add(subList.get(1));
            }
            y = temp;
        }
        return y.get(0);
    }
}
```

Please note that the Java translation is not exactly the same as the Python code. The Python code uses threads to perform some calculations, but Java does not support threading in the same way. Therefore, the Java code uses an ExecutorService to perform the calculations in a separate thread.

