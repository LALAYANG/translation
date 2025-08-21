import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class codeforces_397_B {
    private String result;
    private int t;
    private Queue<int[]> queries;

    public CodeforcesTask397BSolution() {
        result = "";
        t = 0;
        queries = new ArrayBlockingQueue<>(10000000);
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int[] query = new int[3];
            query[0] = scanner.nextInt();
            query[1] = scanner.nextInt();
            query[2] = scanner.nextInt();
            queries.add(query);
        }
    }

    public void processTask() {
        String[] res = new String[t];
        for (int i = 0; i < t; i++) {
            int[] query = queries.poll();
            int dividend = query[0];
            int divisor = query[1];
            int k = dividend / divisor;
            res[i] = (k * query[2] >= dividend) ? "Yes" : "No";
        }
        result = String.join("\n", res);
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