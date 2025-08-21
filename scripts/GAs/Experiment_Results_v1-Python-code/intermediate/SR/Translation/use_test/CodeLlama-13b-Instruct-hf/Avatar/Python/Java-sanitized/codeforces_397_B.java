import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

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