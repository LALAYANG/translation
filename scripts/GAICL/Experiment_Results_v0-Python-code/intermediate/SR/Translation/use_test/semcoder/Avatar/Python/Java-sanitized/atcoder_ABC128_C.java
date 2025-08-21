import java.util.*;
import java.util.stream.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            li[i] = new int[k - 1];
            for (int j = 0; j < k - 1; j++) {
                li[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        Set<Integer> inputSet = IntStream.range(1, n + 1).boxed().collect(Collectors.toSet());
        Set<Integer> r = IntStream.range(1, n + 1).boxed().collect(Collectors.toSet());
        Set<Integer> differenceSet = calculateDifference(r, inputSet);
        int v = differenceSet.size();
        int ans = 0;
        for (int i = 0; i <= inputSet.size(); i++) {
            for (Set<Integer> s : Sets.combinations(inputSet, i)) {
                for (int[] currentList : li) {
                    if (s.stream().filter(currentList::contains).count() % 2 != p[Arrays.asList(li).indexOf(currentList)]) {
                        break;
                    }
                }
                ans += 1 << v;
            }
        }
        System.out.println(ans);
    }

    private static Set<Integer> calculateDifference(Set<Integer> r, Set<Integer> inputSet) {
        return Sets.difference(r, inputSet);
    }
}