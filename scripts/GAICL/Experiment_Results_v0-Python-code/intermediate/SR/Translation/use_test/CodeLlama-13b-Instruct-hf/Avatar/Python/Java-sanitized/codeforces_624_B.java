import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_624_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> values = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        values.sort(Integer::compareTo);
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