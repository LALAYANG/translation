import java.util.Scanner;

public class codeforces_397_B {
    private String result;
    private int t;
    private int[][] queries;

    public CodeforcesTask397BSolution() {
        this.result = "";
        this.t = 0;
        this.queries = new int[100][3];
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                queries[i][j] = scanner.nextInt();
            }
        }
    }

    public void processTask() {
        String[] res = new String[t];
        for (int i = 0; i < t; i++) {
            int dividend = queries[i][0];
            int divisor = queries[i][1];
            int k = dividend / divisor;
            res[i] = (k * queries[i][2] >= dividend) ? "Yes" : "No";
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