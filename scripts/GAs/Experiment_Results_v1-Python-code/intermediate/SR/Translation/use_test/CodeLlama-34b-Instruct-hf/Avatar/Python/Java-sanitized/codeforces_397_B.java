import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_397_B {

    private int t;
    private int[][] queries;
    private String result;

    public CodeforcesTask397BSolution() {
        this.t = 0;
        this.queries = new int[0][0];
        this.result = "";
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        this.t = scanner.nextInt();

        this.queries = new int[this.t][3];
        for (int i = 0; i < this.t; i++) {
            this.queries[i][0] = scanner.nextInt();
            this.queries[i][1] = scanner.nextInt();
            this.queries[i][2] = scanner.nextInt();
        }
    }

    public void processTask() {
        ExecutorService executor = Executors.newFixedThreadPool(this.t);
        for (int i = 0; i < this.t; i++) {
            int dividend = this.queries[i][0];
            int divisor = this.queries[i][1];
            int quotient = this.queries[i][2];

            executor.submit(() -> {
                int divisionResult = performDivision(dividend, divisor);
                if (divisionResult * quotient >= dividend) {
                    return "Yes";
                } else {
                    return "No";
                }
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getResult() {
        return this.result;
    }

    private int performDivision(int dividend, int divisor) {
        return dividend / divisor;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}