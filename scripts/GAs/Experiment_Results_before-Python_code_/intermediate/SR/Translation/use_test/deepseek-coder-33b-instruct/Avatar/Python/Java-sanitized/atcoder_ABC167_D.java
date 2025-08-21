import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] L = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            L[i] = scanner.nextInt();
        }
        List<Integer> path = new ArrayList<>();
        path.add(1);
        Map<Integer, Integer> hash = new HashMap<>();
        int x = 1;
        int t = -1;
        boolean flag = false;
        for (int i = 0; i <= N; i++) {
            int ne = L[x];
            if (hash.containsKey(ne)) {
                flag = true;
                t = hash.get(ne);
                break;
            }
            path.add(ne);
            hash.put(ne, i);
            x = ne;
        }
        if (flag) {
            List<Integer> loop = path.subList(t, path.size());
            if (K < path.size()) {
                System.out.println(path.get(K));
            } else {
                K = K - path.size();
                K = K % loop.size();
                System.out.println(loop.get(K));
            }
        } else {
            System.out.println(path.get(K - 1));
        }
    }
}