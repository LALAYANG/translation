import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_397_B {
    private String result;
    private int t;
    private List<int[]> queries;

    public void solve(int testNumber, Scanner in) {
        t = in.nextInt();
        queries = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int[] query = new int[3];
            query[0] = in.nextInt();
            query[1] = in.nextInt();
            query[2] = in.nextInt();
            queries.add(query);
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        List<Future<String>> futures = new ArrayList<>();
        for (int[] query : queries) {
            Future<String> future = executor.submit(() -> {
                int dividend = query[0];
                int divisor = query[1];
                int quotient = dividend / divisor;
                return quotient * query[2] >= query[0] ? "Yes" : "No";
            });
            futures.add(future);
        }

        StringBuilder sb = new StringBuilder();
        for (Future<String> future : futures) {
            try {
                sb.append(future.get()).append('\n');
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        result = sb.toString();
    }

    public String getResult() {
        return result;
    }
}