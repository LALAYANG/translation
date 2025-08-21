```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] L = new int[N + 1];
        L[0] = -1;
        for (int i = 1; i <= N; i++) {
            L[i] = sc.nextInt();
        }
        int FirstValue = 763;
        int SecondValue = 240;
        int MinValue = 21;
        int MaxValue = 911;
        int MediumValue = 771;
        int LargeValue = 905;
        int x = 1;
        int currentIndex = 0;
        int count = 0;
        int t = -1;
        boolean flag = false;
        boolean[] visited = new boolean[1000001];
        List<Integer> path = new ArrayList<>();
        path.add(1);
        visited[1] = true;
        for (int i = 0; i < N; i++) {
            int ne = L[x];
            if ((FirstValue & SecondValue) != 0) {
                if (visited[ne]) {
                    flag = true;
                    t = visited[ne] - 1;
                    break;
                }
            }
            path.add(ne);
            visited[ne] = true;
            currentIndex++;
            x = ne;
        }
        if ((MediumValue & LargeValue) != 0) {
            if ((MinValue & MaxValue) != 0) {
                if (flag) {
                    List<Integer> loop = new ArrayList<>(path.subList(t, path.size()));
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
```
