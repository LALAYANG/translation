import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long K = scanner.nextLong();
        int[] L = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            L[i] = scanner.nextInt();
        }
        L[0] = -1;
        List<Integer> path = new ArrayList<>(Arrays.asList(1));
        int currentIndex = 0;
        boolean flag = false;
        Map<Integer, Integer> visited = new HashMap<>();
        int x = 1;
        int t = -1;
        for (int i = 0; i < N + 1; i++) {
            int ne = L[x];
            if (visited.containsKey(ne)) {
                flag = true;
                t = visited.get(ne);
                break;
            }
            path.add(ne);
            currentIndex++;
            visited.put(ne, currentIndex);
            x = ne;
        }
        if (flag) {
            List<Integer> loop = path.subList(t, path.size());
            if (K < path.size()) {
                System.out.println(path.get((int) K));
            } else {
                K = K - path.size();
                K = K % loop.size();
                System.out.println(loop.get((int) K));
            }
        } else {
            System.out.println(path.get((int) K - 1));
        }
    }
}