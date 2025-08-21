import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_397_B {

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
        result = "";
        for (int[] query : queries) {
            int dividend = query[0];
            int divisor = query[1];
            int integerDivisionResult = computeIntegerDivision(divisor, dividend);
            int k = integerDivisionResult;
            result += (k * query[2] >= query[0]) ? "Yes\n" : "No\n";
        }
    }

    private int computeIntegerDivision(int divisor, int dividend) {
        return dividend / divisor;
    }

    private String getResult() {
        return result;
    }
}