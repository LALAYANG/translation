import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        int[] h = new int[n];
        for (int i = 1; i <= n; i++) {
            p[i - 1] = i;
            h[i - 1] = sc.nextInt();
        }
        Map<Integer, Integer> hp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hp.put(p[i], h[i]);
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
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
            boolean f = false;
            for (int j : path.get(i)) {
                if (hp.get(i) <= hp.get(j)) {
                    f = true;
                    break;
                }
            }
            if (!f) {
                c++;
            }
        }
        System.out.println(c);
    }
}