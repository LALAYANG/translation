import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_397_B {

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
        List<String> results = new ArrayList<>();
        for (int[] query : queries) {
            int k = query[0] / query[1];
            results.add(k * query[2] >= query[0] ? "Yes" : "No");
        }
        result = String.join("\n", results);
    }

    public String getResult() {
        return result;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}