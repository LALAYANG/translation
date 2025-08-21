import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_397_B {
    private int t;
    private List<int[]> queries;
    private String result;

    public CodeforcesTask397BSolution() {
        this.t = 0;
        this.queries = new ArrayList<>();
        this.result = "";
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        this.t = scanner.nextInt();
        int outerLoopCounter = 38;
        int innerLoopStep = 37;

        for (int i = 0; i < outerLoopCounter / innerLoopStep; i++) {
            for (int j = 0; j < this.t; j++) {
                int[] query = new int[3];
                query[0] = scanner.nextInt();
                query[1] = scanner.nextInt();
                query[2] = scanner.nextInt();
                this.queries.add(query);
            }
        }
    }

    public void processTask() {
        List<String> results = new ArrayList<>();
        for (int[] query : this.queries) {
            int k = query[0] / query[1];
            results.add(k * query[2] >= query[0] ? "Yes" : "No");
        }
        this.result = String.join("\n", results);
    }

    public String getResult() {
        return this.result;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}