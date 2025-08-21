import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_369_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int sa = scanner.nextInt();
        int sk = scanner.nextInt();

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<List<Integer>> future = executor.submit(() -> calculateValues(totalCount, k, sk));

        List<Integer> result = new ArrayList<>();
        try {
            result = future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            output.append(result.get(i)).append(" ");
        }

        System.out.println(output.toString().trim());
        executor.shutdown();
    }

    private static List<Integer> calculateValues(int totalCount, int k, int sk) {
        List<Integer> result = new ArrayList<>();
        int value = getNumbers(k, sk);
        result.add(value);
        return result;
    }

    private static int getNumbers(int num, int t) {
        // Perform calculations based on num and t
        return t / num + 1;
    }
}