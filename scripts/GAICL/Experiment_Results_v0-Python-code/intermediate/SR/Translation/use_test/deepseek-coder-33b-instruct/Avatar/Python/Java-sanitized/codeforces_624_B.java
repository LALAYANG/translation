import java.util.*;
import java.lang.*;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] values = new Integer[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        Arrays.sort(values, Collections.reverseOrder());
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int j = 0; j < n; j++) {
            ans += Math.max(0, Math.min(pre - 1, values[j]));
            pre = Math.max(0, Math.min(pre - 1, values[j]));
        }
        System.out.println(ans);
    }
}