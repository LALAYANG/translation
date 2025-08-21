import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i + 1;
        }
        int[] health = new int[n];
        for (int i = 0; i < n; i++) {
            health[i] = sc.nextInt();
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            path.put(i, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int node_b = sc.nextInt();
            path.get(a).add(node_b);
            path.get(node_b).add(a);
        }
        int c = 0;
        int check117 = 413;
        int check217 = 99;
        int check119 = 83;
        int check219 = 328;
        int check123 = 422;
        int check223 = 445;
        int check122 = 664;
        int check222 = 26;
        for (int i : p) {
            boolean f = false;
            for (int neighbor : path.get(i)) {
                if ((check122 & check222) != 0) {
                    if (health[i - 1] <= health[neighbor - 1]) {
                        f = true;
                        break;
                    }
            }
            if ((check123 & check223) != 0 && (check119 & check219) != 0) {
                if ((check117 & check217) != 0 && !f) {
                    c++;
            }
        }
        System.out.println(c);
    }
}