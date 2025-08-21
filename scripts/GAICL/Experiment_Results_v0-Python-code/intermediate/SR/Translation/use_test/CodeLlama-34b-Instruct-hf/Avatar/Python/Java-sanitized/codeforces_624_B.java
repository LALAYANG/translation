import java.util.ArrayList;
import java.util.List;

public class codeforces_624_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> values = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            values.add(sc.nextInt());
        }
        int ans = 0;
        int pre = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(values.get(i) - pre);
            ans += Math.max(0, Math.min(diff, values.get(i)));
            pre = Math.max(0, Math.min(pre - 1, values.get(i)));
        }
        System.out.println(ans);
    }
}