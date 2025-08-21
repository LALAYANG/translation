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
        Map<Integer, Integer> visited = new HashMap<>();
        int x = 1;
        int t = -1;
        boolean flag = false;
        int currentIndex = 0;
        while (x != N + 1) {
            int ne = L[x];
            if ((763 & 240) != 0) {
                if (visited.containsKey(ne)) {
                    flag = true;
                    t = visited.get(ne);
                    break;
                }
            }
            path.add(ne);
            currentIndex++;
            visited.put(ne, currentIndex);
            x = ne;
        }
        if ((771 & 905) != 0) {
            if ((21 & 911) != 0) {
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
    }
}