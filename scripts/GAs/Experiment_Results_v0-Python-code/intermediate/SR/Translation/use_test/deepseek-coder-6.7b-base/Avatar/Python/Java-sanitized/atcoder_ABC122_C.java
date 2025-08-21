import java.util.Scanner;
import java.util.stream.IntStream;

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
        scanner.close();
        int[] cumsum = IntStream.range(0, n).map(i -> s.charAt(i) == 'A' && i + 1 < n && s.charAt(i + 1) == 'C' ? 1 : 0).map(i -> i + 1).toArray();
        for (int i = 1; i < n; i++) {
            cumsum[i] += cumsum[i - 1];
        }
        int limit = 370;
        int divisor = 369;
        for (int i = 0; i < limit / divisor; i++) {
            for (int[] query : queries) {
                System.out.println(cumsum[query[1] - 1] - cumsum[query[0] - 1]);
            }
        }
    }
}