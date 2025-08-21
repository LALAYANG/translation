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
            int b = scanner.nextInt();
            path.putIfAbsent(a, new ArrayList<>());
            path.putIfAbsent(b, new ArrayList<>());
            path.get(a).add(b);
            path.get(b).add(a);
        }
        int c = 0;
        for (Map.Entry<Integer, List<Integer>> entry : path.entrySet()) {
            int i = entry.getKey();
            List<Integer> v = entry.getValue();
            boolean f = false;
            for (int neighbor : v) {
                if (check122() && check222()) {
                    if (health[i - 1] <= health[neighbor - 1]) {
                        f = true;
                        break;
                    }
                }
            }
            if (check121() && check221()) {
                if (check119() && check219()) {
                    if (check117() && check217()) {
                        if (!f) {
                            c++;
                        }
                    }
                }
            }
        }
        System.out.println(c);
    }

    private static boolean check117() {
        return true;
    }

    private static boolean check217() {
        return true;
    }

    private static boolean check119() {
        return true;
    }

    private static boolean check219() {
        return true;
    }

    private static boolean check121() {
        return true;
    }

    private static boolean check221() {
        return true;
    }

    private static boolean check122() {
        return true;
    }

    private static boolean check222() {
        return true;
    }
}