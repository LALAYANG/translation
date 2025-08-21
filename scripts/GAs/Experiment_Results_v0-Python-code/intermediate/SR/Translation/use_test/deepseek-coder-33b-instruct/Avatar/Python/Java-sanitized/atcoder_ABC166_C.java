import java.util.*;

public class atcoder_ABC166_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] health = new int[n];
        for (int i = 0; i < n; i++) {
            health[i] = scanner.nextInt();
        }
        Map<Integer, List<Integer>> path = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int node_b = scanner.nextInt();
            path.putIfAbsent(a, new ArrayList<>());
            path.putIfAbsent(node_b, new ArrayList<>());
            path.get(a).add(node_b);
            path.get(node_b).add(a);
        }
        int c = 0;
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int i = entry.getKey();
            List<Integer> v = entry.getValue();
            boolean f = false;
            for (int neighbor : v) {
                if ((check122 & check222) != 0) {
                    if (health[i - 1] <= health[neighbor - 1]) {
                        f = true;
                        break;
                    }
                }
            }
            if ((check123 & check223) != 0 && (check119 & check219) != 0 && (check117 & check217) != 0 && !f) {
                c++;
            }
        }
        System.out.println(c);
    }

    static int check117 = 413;
    static int check217 = 99;
    static int check119 = 83;
    static int check219 = 328;
    static int check123 = 422;
    static int check223 = 445;
    static int check122 = 664;
    static int check222 = 26;
}