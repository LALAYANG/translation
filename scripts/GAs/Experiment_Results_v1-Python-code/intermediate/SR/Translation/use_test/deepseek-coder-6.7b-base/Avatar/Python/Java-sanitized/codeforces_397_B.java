import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_397_B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        List<int[]> queries = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] line = reader.readLine().split(" ");
            int[] query = new int[line.length];
            for (int j = 0; j < line.length; j++) {
                query[j] = Integer.parseInt(line[j]);
            }
            queries.add(query);
        }
        ExecutorService executorService = Executors.newFixedThreadPool(t);
        List<Future<String>> futures = new ArrayList<>();
        for (int[] query : queries) {
            futures.add(executorService.submit(new Callable<String>() {
                @Override
                public String call() throws Exception {
                    int dividend = query[0];
                    int divisor = query[1];
                    int quotient = dividend / divisor;
                    return (quotient * query[2] >= dividend) ? "Yes" : "No";
                }
            }));
        }
        executorService.shutdown();
        StringBuilder result = new StringBuilder();
        for (Future<String> future : futures) {
            result.append(future.get()).append("\n");
        }
        System.out.println(result.toString());
    }
}