import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class codeforces_397_B {
    private String result;
    private int t;
    private List<int[]> queries;

    public CodeforcesTask397BSolution() {
        result = "";
        t = 0;
        queries = new ArrayList<>();
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            String[] query = scanner.nextLine().split(" ");
            queries.add(new int[] { Integer.parseInt(query[0]), Integer.parseInt(query[1]), Integer.parseInt(query[2]) });
        }
    }

    public void processTask() {
        for (int[] query : queries) {
            int k = query[0] / query[1];
            if (k * query[2] >= query[0]) {
                result += "Yes\n";
            } else {
                result += "No\n";
            }
        }
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