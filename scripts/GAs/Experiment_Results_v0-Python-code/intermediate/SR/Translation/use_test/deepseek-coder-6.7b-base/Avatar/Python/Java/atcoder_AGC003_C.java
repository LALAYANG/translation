```
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(System.console().readLine());
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(System.console().readLine()) * N + i;
        }
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int element = A[i];
            int variable_3_9 = 2;
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Future<Integer> future = executor.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return element % N % variable_3_9;
                }
            });
            int remainder = future.get();
            if (remainder % 2 != i % 2) {
                cnt = cnt + 1;
            }
            executor.shutdown();
        }
        System.out.println(cnt / 2);
    }
}
```

