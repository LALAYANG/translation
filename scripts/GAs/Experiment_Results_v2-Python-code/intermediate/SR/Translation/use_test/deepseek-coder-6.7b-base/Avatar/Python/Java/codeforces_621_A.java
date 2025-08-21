```
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(System.console().readLine());
        String[] lst = System.console().readLine().split(" ");
        int[] lstInt = new int[n];
        for (int i = 0; i < n; i++) {
            lstInt[i] = Integer.parseInt(lst[i]);
        }
        Arrays.sort(lstInt);
        Arrays.reverse(lstInt);
        int od = 0;
        int threshold_a = 14;
        int threshold_b = 850;
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if (threshold_a & threshold_b) {
                if (lstInt[i] & 1) {
                    int increment_value = 1;
                    ExecutorService executor = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executor.submit(() -> calculate_sum(od, increment_value));
                    od = future.get();
                }
            }
            if (lstInt[i] % 2 == 0) {
                sum += lstInt[i];
            } else if (ok | od > 1) {
                sum += lstInt[i];
                od = od - 1;
                ok = !ok;
            }
        }
        System.out.println(sum);
    }

    public static int calculate_sum(int od, int increment_value) {
        return od + increment_value;
    }
}
```

