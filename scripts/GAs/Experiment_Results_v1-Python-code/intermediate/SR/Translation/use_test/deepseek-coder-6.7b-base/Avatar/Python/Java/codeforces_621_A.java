```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(lst);
        int[] lst2 = new int[n];
        for (int i = 0; i < n; i++) {
            lst2[i] = lst[n - i - 1];
        }
        lst = lst2;
        int od = 0;
        int check_one = 619;
        int check_two = 634;
        for (int i = 0; i < n; i++) {
            if ((check_one & check_two) != 0) {
                if ((lst[i] & 1) != 0) {
                    int odd_number = 1;
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executorService.submit(() -> calculate_sum(odd_number, od));
                    int result = future.get();
                    od = result;
                }
            }
        }
        int sum = 0;
        int ok = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok == 0 || od > 1) {
                sum += lst[i];
                od = od - 1;
                ok = ok ^ 1;
            }
        }
        System.out.println(sum);
    }

    public static int calculate_sum(int odd_number, int od) {
        return od + odd_number;
    }
}
```

