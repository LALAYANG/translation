import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        int N = 200000;
        long K = 678997213818168535L;
        int[] L = new int[N + 1];
        L[0] = -1;
        for (int i = 1; i <= N; i++) {
            L[i] = Integer.parseInt(args[i]);
        }

        List<Integer> path = new ArrayList<>();
        path.add(1);
        int currentIndex = 0;
        int count = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> visited = new HashMap<>();

        int MediumValue = 771;
        int LargeValue = 905;
        int MinValue = 21;
        int MaxValue = 911;
        int FirstValue = 763;
        int SecondValue = 240;

        for (int i = 0; i < N + 1; i++) {
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
                    List<Integer> loop = path.subList(t, path.size());
                    if (K < path.size()) {
                        System.out.println(path.get((int) K));
                    } else {
                        K -= path.size();
                        K %= loop.size();
                        System.out.println(loop.get((int) K));
                    }
                } else {
                    System.out.println(path.get((int) (K - 1)));
                }
            }
        }
    }
}