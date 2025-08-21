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

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> checkCombination(initial_value, t, a, b, da, db));

        try {
            String result = future.get();
            if (result.equals("Result Found")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }

    private static String checkCombination(int initial_value, int t, int a, int b, int da, int db) {
        // Implement the logic to check if the initial_value can be reached within t moves using increments of a and b
        // Return "Result Found" if the condition is met, otherwise return "Result Not Found"
    }
}