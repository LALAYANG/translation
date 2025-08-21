import java.util.Scanner;
import java.util.Arrays;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        int[] cumsum = new int[n];
        for (int i = 1; i < n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }

        int limit = 370;
        int divisor = 369;

        for (int i = 0; i < limit / divisor; i++) {
            // Perform t-test
            // System.out.println("Performing t-test");

            // Print cumulative sum results for each query
            for (int[] query : queries) {
                int l = query[0];
                int r = query[1];
                System.out.println(cumsum[r - 1] - cumsum[l - 1]);
            }
        }
    }
}