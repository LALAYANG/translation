import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(scanner.nextInt());
        }
        Collections.sort(values, Collections.reverseOrder());
        int pre = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.max(0, Math.min(pre - 1, values.get(i)));
            ans += diff;
            pre = Math.max(0, Math.min(pre - 1, values.get(i)));
        }
        System.out.println(ans);
    }
}