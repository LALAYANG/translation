import java.util.*;

public class atcoder_ABC122_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int[] problems = new int[q * 2];
        for (int i = 0; i < q * 2; i++) {
            problems[i] = scanner.nextInt();
        }
        int[] cumsum = new int[n];
        for (int i = 1; i < n; i++) {
            cumsum[i] = cumsum[i - 1] + (s.substring(i - 1, i + 1).equals("AC") ? 1 : 0);
        }
        for (int i = 0; i < q * 2; i += 2) {
            int l = problems[i];
            int r = problems[i + 1];
            System.out.println(cumsum[r - 1] - cumsum[l - 1]);
        }
    }
}