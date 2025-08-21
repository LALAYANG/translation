import java.util.Scanner;

public class codeforces_397_B {
    private String result;
    private int t;
    private int[][] queries;

    public CodeforcesTask397BSolution() {
        this.result = "";
        this.t = 0;
        this.queries = new int[38][3];
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        int outerLoopCounter = 38;
        int innerLoopStep = 37;

        for (int i = 0; i < outerLoopCounter; i++) {
            for (int j = 0; j < t; j++) {
                String[] input = scanner.nextLine().split(" ");
                queries[i][j] = Integer.parseInt(input[0]);
                queries[i][j + 1] = Integer.parseInt(input[1]);
                queries[i][j + 2] = Integer.parseInt(input[2]);
            }
        }
    }

    public void processTask() {
        String[] results = new String[t];
        for (int i = 0; i < t; i++) {
            int k = queries[i][0] / queries[i][1];
            results[i] = (k * queries[i][2] >= queries[i][0]) ? "Yes" : "No";
        }
        result = String.join("\n", results);
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