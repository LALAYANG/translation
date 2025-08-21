import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC166_C {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n_m = br.readLine().split(" ");
        int n = Integer.parseInt(n_m[0]);
        int m = Integer.parseInt(n_m[1]);
        int[] health = new int[n];
        String[] health_str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            health[i] = Integer.parseInt(health_str[i]);
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] ab = br.readLine().split(" ");
            int a = Integer.parseInt(ab[0]);
            int b = Integer.parseInt(ab[1]);
            if (!path.containsKey(a)) {
                path.put(a, new ArrayList<>());
            }
            if (!path.containsKey(b)) {
                path.put(b, new ArrayList<>());
            }
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> v = path.get(i);
            if (v == null) {
                continue;
            }
            boolean f = false;
            for (int neighbor : v) {
                if (health[i - 1] <= health[neighbor - 1]) {
                    f = true;
                    break;
                }
            }
            if (f) {
                c++;
            }
        }
        System.out.println(c);
    }
}