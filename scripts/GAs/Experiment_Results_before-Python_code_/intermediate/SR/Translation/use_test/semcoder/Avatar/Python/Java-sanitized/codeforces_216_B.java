import java.util.*;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, Set<Integer>> g = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            g.put(i, new HashSet<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.get(a).add(b);
            g.get(b).add(a);
        }

        Set<Integer> seen = new HashSet<>();
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                int nodes = 1;
                int edges = g.get(i).size();

                Stack<Integer> stack = new Stack<>();
                stack.push(i);
                seen.add(i);

                while (!stack.isEmpty()) {
                    int curr = stack.pop();
                    for (int neighbor : g.get(curr)) {
                        if (!seen.contains(neighbor)) {
                            seen.add(neighbor);
                            nodes++;
                            edges += g.get(neighbor).size();
                            stack.push(neighbor);
                        }
                    }
                }

                if (nodes > 1 && nodes % 2 == 1 && 2 * nodes == edges) {
                    ans++;
                }
            }
        }

        if ((n - ans) % 2 == 1) {
            ans++;
        }

        System.out.println(ans);
    }
}