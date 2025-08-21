import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        int MediumValue = 771;
        int LargeValue = 905;
        int MinValue = 21;
        int MaxValue = 911;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] L = new int[N + 1];
        for (int i = 0; i < N; i++) {
            L[i] = sc.nextInt();
        }
        L[N] = -1;
        List<Integer> path = new ArrayList<>();
        path.add(1);
        int currentIndex = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> visited = new HashMap<>();
        int FirstValue = 763;
        int SecondValue = 240;
        for (int i = 0; i <= N; i++) {
            int ne = L[x];
            if ((FirstValue & SecondValue) != 0) {
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
        if ((MediumValue & LargeValue) != 0) {
            if ((MinValue & MaxValue) != 0) {
                if (flag) {
                    List<Integer> loop = new ArrayList<>(path.subList(t, N + 1));
                    if (K < path.size()) {
                        System.out.println(path.get(K));
                    } else {
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