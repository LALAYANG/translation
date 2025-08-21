import java.util.Scanner;
import java.util.concurrent.Thread;

public class codeforces_397_B {

    private int t;
    private int[][] queries;
    private String result;

    public CodeforcesTask397BSolution() {
        t = 0;
        queries = new int[0][0];
        result = "";
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();

        int[][] queries = new int[t][3];
        for (int i = 0; i < t; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
        }
        this.queries = queries;
    }

    public void processTask() {
        int[] results = new int[t];
        for (int i = 0; i < t; i++) {
            int dividend = queries[i][0];
            int divisor = queries[i][1];
            int k = dividend / divisor;
            results[i] = k * queries[i][2] >= dividend ? 1 : 0;
        }
        result = "";
        for (int i = 0; i < t; i++) {
            result += results[i] == 1 ? "Yes" : "No";
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