import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.List;

class Main {
    private static int calculateDifference(int a, int b) {
        return b - a;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[] sa = scanner.nextLine().split(" ");
        int saCount = 0;
        for (String s : sa) {
            if (s.equals("-1")) {
                saCount++;
            }
        }

        int saMin = Math.min(n - saCount, saCount);
        List<Future<Integer>> results = new ArrayList<>();
        ExecutorService executor = Executors.newFixedThreadPool(m);

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            Future<Integer> future = executor.submit(() -> calculateDifference(a, b));
            results.add(future);
        }

        for (Future<Integer> result : results) {
            int difference = result.get();
            System.out.println((difference % 2 == 0 || difference > saMin * 2) ? "0" : "1");
        }

        executor.shutdown();
    }
}