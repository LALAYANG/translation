import java.util.*;
import java.util.concurrent.*;

class Main {
    private static String result = "";
    private static int t = 0;
    private static List<int[]> queries = new ArrayList<>();

    private static int computeIntegerDivision(int divisor, int dividend) {
        return dividend / divisor;
    }

    private static void readInput() {
        t = new Scanner(System.in).nextInt();
        for (int i = 0; i < t; i++) {
            int[] query = new int[3];
            query[0] = new Scanner(System.in).nextInt();
            query[1] = new Scanner(System.in).nextInt();
            query[2] = new Scanner(System.in).nextInt();
            queries.add(query);
        }
    }

    private static void processTask() {
        List<String> res = new ArrayList<>();
        for (int[] query : queries) {
            int dividend = query[0];
            int divisor = query[1];
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> computeIntegerDivision(divisor, dividend));
            try {
                int k = future.get();
                res.add(k * query[2] >= dividend ? "Yes" : "No");
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
            executorService.shutdown();
        }
        result = String.join("\n", res);
    }

    public static void main(String[] args) {
        readInput();
        processTask();
        System.out.println(result);
    }
}