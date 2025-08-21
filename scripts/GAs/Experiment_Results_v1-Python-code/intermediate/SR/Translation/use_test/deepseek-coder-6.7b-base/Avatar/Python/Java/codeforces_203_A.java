```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] xxs = scanner.nextLine().split(" ");
        int initialValue = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int da = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> checkCombination(initialValue, t, a, b, da, db));
        String result = future.get();
        if (result.equals("Result Not Found")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        executor.shutdown();
    }

    public static String checkCombination(int initialValue, int t, int a, int b, int da, int db) {
        if (initialValue == 0) {
            return "Result Found";
        }
        int aTime = Math.min(a / da, t - 1);
        int bTime = Math.min(b / db, t - 1);
        for (int i = 0; i <= aTime; i++) {
            for (int j = 0; j <= bTime; j++) {
                if (a - da * i == initialValue || b - db * j == initialValue) {
                    return "Result Found";
                }
                if (a - da * i + (b - db * j) == initialValue) {
                    return "Result Found";
                }
            }
        }
        return "Result Not Found";
    }
}
```

