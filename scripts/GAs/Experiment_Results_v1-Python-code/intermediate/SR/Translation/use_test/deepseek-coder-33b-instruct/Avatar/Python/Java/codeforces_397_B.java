```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CodeforcesTask397BSolution {

    private String result = "";
    private int t = 0;
    private List<int[]> queries = new ArrayList<>();

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[] query = new int[3];
            for (int j = 0; j < 3; j++) {
                query[j] = scanner.nextInt();
            }
            queries.add(query);
        }
    }

    public void processTask() {
        List<String> res = new ArrayList<>();
        for (int[] query : queries) {
            int dividend = query[0];
            int divisor = query[1];
            BlockingQueue<Integer> divisionQueue = new LinkedBlockingQueue<>();

            Thread divisionThread = new Thread(() -> {
                int divisionResult = performDivision(dividend, divisor);
                try {
                    divisionQueue.put(divisionResult);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            divisionThread.start();
            try {
                divisionThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int divisionResult = 0;
            try {
                divisionResult = divisionQueue.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int quotient = divisionResult;
            res.add(quotient * query[2] >= query[0] ? "Yes" : "No");
        }
        result = String.join("\n", res);
    }

    public String getResult() {
        return result;
    }

    private int performDivision(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}
```

