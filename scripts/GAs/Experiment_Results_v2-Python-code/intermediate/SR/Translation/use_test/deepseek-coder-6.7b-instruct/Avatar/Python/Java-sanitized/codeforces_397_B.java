import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_397_B {
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