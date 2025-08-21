import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_203_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] xxs = scanner.nextLine().split(" ");
        int initial_value = Integer.parseInt(xxs[0]);
        int t = Integer.parseInt(xxs[1]);
        int a = Integer.parseInt(xxs[2]);
        int b = Integer.parseInt(xxs[3]);
        int da = Integer.parseInt(xxs[4]);
        int db = Integer.parseInt(xxs[5]);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            if (initial_value == 0) {
                return "Result Found";
            }
            int a_time = Math.min(a / da, t - 1);
            int b_time = Math.min(b / db, t - 1);
            for (int i = 0; i <= a_time; i++) {
                for (int j = 0; j <= b_time; j++) {
                    if (a - da * i == initial_value || b - db * j == initial_value) {
                        return "Result Found";
                    }
                    if (a - da * i + (b - db * j) == initial_value) {
                        return "Result Found";
                    }
                }
            }
            return "Result Not Found";
        });
        try {
            String result = future.get();
            if (result.equals("Result Not Found")) {
                System.out.println("NO");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();
    }
}