import java.util.*;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] low = new int[n];
        int[] highs = new int[n];
        for (int i = 0; i < n; i++) {
            low[i] = scanner.nextInt();
            highs[i] = scanner.nextInt();
        }
        Arrays.sort(low);
        Arrays.sort(highs);
        if (n % 2 == 1) {
            System.out.println(highs[n / 2] - low[n / 2] + 1);
        } else {
            double high_mid = (highs[n / 2 - 1] + highs[n / 2]) / 2.0;
            double ll = (low[n / 2 - 1] + low[n / 2]) / 2.0;
            System.out.println((int) ((high_mid - ll) * 2) + 1);
        }
    }
}