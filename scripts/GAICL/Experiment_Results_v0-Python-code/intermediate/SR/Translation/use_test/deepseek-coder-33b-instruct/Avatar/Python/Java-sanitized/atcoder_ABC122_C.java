import java.util.*;
import java.lang.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num_queries = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int[][] queries = new int[num_queries][2];
        for (int i = 0; i < num_queries; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
        }

        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }

        int limit = 370;
        int divisor = 369;

        for (int i = 0; i <= limit / divisor; i++) {
            TTest tTest = new TTest();
            double pValue = tTest.tTest(new double[]{30, 40, 45}, new double[]{58, 65, 24});
            for (int[] query : queries) {
                System.out.println(cumsum[query[1] - 1] - cumsum[query[0] - 1]);
            }
        }
    }
}