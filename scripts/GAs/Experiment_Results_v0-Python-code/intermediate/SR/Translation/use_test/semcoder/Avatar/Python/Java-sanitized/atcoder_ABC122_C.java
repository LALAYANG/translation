import java.util.Scanner;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numQueries = scanner.nextInt();
        String s = scanner.next();
        int[][] queries = new int[numQueries][2];
        for (int i = 0; i < numQueries; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }

        int[] cumsum = new int[n];
        for (int i = 1; i < n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }

        int limit = 370;
        int divisor = 369;

        for (int LoopIndexOut = 0; LoopIndexOut < limit / divisor; LoopIndexOut++) {
            for (int[] query : queries) {
                int l = query[0];
                int r = query[1];
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}