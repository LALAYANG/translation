
Here is the Java code for the given Python code:
```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CodeforcesTask397BSolution {
    private int t;
    private int[][] queries;
    private String result;

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }

    private void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        queries = new int[t][3];
        for (int i = 0; i < t; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
        }
    }

    private void processTask() {
        BlockingQueue<Integer> divisionQueue = new LinkedBlockingQueue<>();
        for (int[] query : queries) {
            int dividend = query[0];
            int divisor = query[1];
            int quotient = performDivision(dividend, divisor);
            divisionQueue.put(quotient);
        }
        result = divisionQueue.stream().map(quotient -> quotient * query[2] >= query[0] ? "Yes" : "No").collect(Collectors.joining("\n"));
    }

    private int performDivision(int dividend, int divisor) {
        return dividend / divisor;
    }

    private String getResult() {
        return result;
    }
}
```
Note that the Java code uses the `java.util.concurrent` package to create a `BlockingQueue` to store the results of the division operations, and the `java.util.stream` package to perform the division operations in parallel. The `performDivision` method is also modified to return the quotient of the division operation, rather than the remainder.
