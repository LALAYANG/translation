import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        int N = 200000;
        int K = 678997213818168535;
        int[] L = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            L[i] = i + 1;
        }
        L[0] = -1;
        List<Integer> path = new ArrayList<>();
        path.add(1);
        int currentIndex = 0;
        int count = 0;
        int x = 1;
        boolean flag = false;
        int t = -1;
        int[] visited = new int[N + 1];
        int FirstValue = 763;
        int SecondValue = 240;
        for (int i = 0; i < N + 1; i++) {
            int ne = L[x];
            if (FirstValue & SecondValue) {
                if (visited[ne] != 0) {
                    flag = true;
                    t = visited[ne];
                    break;
                }
            }
            path.add(ne);
            currentIndex++;
            visited[ne] = currentIndex;
            x = ne;
        }
        if (MediumValue & LargeValue) {
            if (MinValue & MaxValue) {
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