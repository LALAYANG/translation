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
        this.t = scanner.nextInt();
        for (int i = 0; i < this.t; i++) {
            for (int j = 0; j < 3; j++) {
                this.queries[i][j] = scanner.nextInt();
            }
        }
    }

    public void processTask() {
        String[] res = new String[this.t];
        for (int i = 0; i < this.t; i++) {
            int k = this.queries[i][0] / this.queries[i][1];
            res[i] = (k * this.queries[i][2] >= this.queries[i][0]) ? "Yes" : "No";
        }
        for (int i = 0; i < this.t; i++) {
            this.result += res[i] + "\n";
        }
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