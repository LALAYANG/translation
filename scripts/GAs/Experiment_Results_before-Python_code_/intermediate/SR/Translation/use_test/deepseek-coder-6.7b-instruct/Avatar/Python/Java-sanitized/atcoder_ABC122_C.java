import java.util.*;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int[][] problems = new int[q][2];
        for (int i = 0; i < q; i++) {
            problems[i][0] = scanner.nextInt();
            problems[i][1] = scanner.nextInt();
        }
        int[] cumsum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1];
            if (i < n && s.substring(i - 1, i + 1).equals("AC")) {
                cumsum[i]++;
            }
        }
        for (int i = 0; i < q; i++) {
            int l = problems[i][0];
            int r = problems[i][1];
            System.out.println(cumsum[r - 1] - cumsum[l - 1]);
        }
    }
}