import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(scanner.nextInt());
            }
            li.add(row);
        }
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            p.add(scanner.nextInt());
        }
        Set<Integer> q = new HashSet<>();
        for (List<Integer> row : li) {
            for (Integer num : row) {
                q.add(num);
            }
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            for (List<Integer> row : li) {
                Set<Integer> s = new HashSet<>(row);
                if (s.size() % 2 != p.get(i)) {
                    break;
                }
            }
            ans += Math.pow(2, v.size());
        }
        System.out.println(ans);
    }
}