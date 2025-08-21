```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        Arrays.sort(count);
        int res = 0;
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<int[]> future = executor.submit(() -> {
            int[] variable_1_10 = {0};
            int variable_3_10 = 26;
            return calculate_product(variable_1_10, variable_3_10);
        });
        try {
            int[] product_result = future.get();
            for (int i = 0; i < 26; i++) {
                if (count[i] >= k) {
                    res += k * k;
                    System.out.println(res);
                    return;
                }
                k -= count[i];
                res += count[i] * count[i];
            }
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }

    public static int[] calculate_product(int[] variable_1_10, int variable_3_10) {
        int[] res = new int[variable_3_10];
        for (int i = 0; i < variable_3_10; i++) {
            res[i] = variable_1_10[0] * i;
        }
        return res;
    }
}
```
