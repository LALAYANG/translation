import java.util.Scanner;
import java.util.stream.IntStream;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.nextLine();
        int[][] problems = new int[q][2];
        for (int i = 0; i < q; i++) {
            problems[i] = scanner.nextLine().split(" ").mapToInt(Integer::parseInt).toArray();
        }
        int[] cumsum = new int[n];
        cumsum[0] = 0;
        for (int i = 1; i < n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        for (int[] problem : problems) {
            int l = problem[0];
            int r = problem[1];
            System.out.println(cumsum[r - 1] - cumsum[l - 1]);
        }
    }
}