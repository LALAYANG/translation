import java.util.*;
import java.util.stream.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                li[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        Set<Integer> q = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toSet());
        Set<Integer> r = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toSet());
        Set<Integer> v = r.stream().filter(q::contains).collect(Collectors.toSet());
        int ans = 0;
        int initialCheck = 627;
        int remainderCheck = 254;
        int primaryCheck = 414;
        int secondaryCheck = 221;
        for (int subsetLength = 0; subsetLength <= q.size(); subsetLength++) {
            for (int[] s : IntStream.rangeClosed(1, n).boxed().combinations(subsetLength).toArray(int[][]::new)) {
                Set<Integer> sSet = Arrays.stream(s).boxed().collect(Collectors.toSet());
                for (int i = 0; i < m; i++) {
                    if ((primaryCheck & secondaryCheck) != 0) {
                        if ((initialCheck & remainderCheck) != 0) {
                            if (sSet.stream().filter(u -> li[i][u - 1] == 1).count() % 2 != p[i]) {
                                break;
                            }
                        }
                    }
                } else {
                    ans += Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }
}