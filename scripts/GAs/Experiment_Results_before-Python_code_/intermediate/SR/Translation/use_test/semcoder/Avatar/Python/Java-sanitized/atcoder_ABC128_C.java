import java.util.*;
import java.util.stream.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][];
        for (int i = 0; i < m; i++) {
            li[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).skip(1).toArray();
        }
        int[] p = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> q = IntStream.range(0, m).map(i -> li[i][0]).boxed().flatMap(x -> Arrays.stream(li[x - 1])).collect(Collectors.toSet());
        Set<Integer> r = IntStream.range(1, n + 1).boxed().collect(Collectors.toSet());
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            for (Set<Integer> s : Sets.combinations(q, i)) {
                boolean flag = true;
                for (int u : li) {
                    Set<Integer> set = new HashSet<>(Arrays.stream(u).boxed().collect(Collectors.toSet()));
                    if (set.size() != s.size() || !set.containsAll(s)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans += 1 << v.size();
                }
            }
        }
        System.out.println(ans);
    }
}