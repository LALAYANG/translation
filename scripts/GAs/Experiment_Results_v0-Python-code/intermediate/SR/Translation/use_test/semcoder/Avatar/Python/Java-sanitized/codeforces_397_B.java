import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_397_B {
    private String result;
    private int t;
    private int[][] queries;

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        queries = new int[t][3];
        for (int i = 0; i < t; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
        }
    }

    public void processTask() {
        StringBuilder res = new StringBuilder();
        for (int[] query : queries) {
            int dividend = query[0];
            int divisor = query[1];
            int k = computeIntegerDivision(divisor, dividend);
            res.append(k * query[2] >= query[0] ? "Yes" : "No").append('\n');
        }
        result = res.toString();
    }

    private int computeIntegerDivision(int divisor, int dividend) {
        return dividend / divisor;
    }

    public String getResult() {
        return result;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.print(solution.getResult());
    }
}