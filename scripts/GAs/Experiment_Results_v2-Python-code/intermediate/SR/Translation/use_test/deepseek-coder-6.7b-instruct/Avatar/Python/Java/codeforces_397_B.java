```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private String result;
    private int t;
    private List<int[]> queries;

    public static void main(String[] args) {
        Main solution = new Main();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        queries = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int[] query = new int[3];
            query[0] = scanner.nextInt();
            query[1] = scanner.nextInt();
            query[2] = scanner.nextInt();
            queries.add(query);
        }
    }

    public void processTask() {
        StringBuilder resultBuilder = new StringBuilder();
        for (int[] query : queries) {
            int k = query[0] / query[1];
            resultBuilder.append((k * query[2] >= query[0]) ? "Yes" : "No").append("\n");
        }
        result = resultBuilder.toString();
    }

    public String getResult() {
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads the number of queries and the queries themselves from the standard input, processes the queries, and writes the results to the standard output. The `readInput` method reads the input, the `processTask` method processes the queries, and the `getResult` method returns the results.

