import java.util.Scanner;

public class codeforces_397_B {
    private String result;
    private int t;
    private int[][] queries;

    public CodeforcesTask397BSolution() {
        this.result = "";
        this.t = 0;
        this.queries = new int[1000000][3];
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        this.t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                this.queries[i][j] = scanner.nextInt();
            }
        }
    }

    public void processTask() {
        String[] res = new String[t];
        for (int i = 0; i < t; i++) {
            int dividend = queries[i][0];
            int divisor = queries[i][1];
            int quotient = dividend / divisor;
            res[i] = (quotient * queries[i][2] >= dividend) ? "Yes" : "No";
        }
        this.result = String.join("\n", res);
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