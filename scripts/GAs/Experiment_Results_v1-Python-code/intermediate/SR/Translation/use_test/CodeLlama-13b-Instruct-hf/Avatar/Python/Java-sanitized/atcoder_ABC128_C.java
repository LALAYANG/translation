import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Combinations;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(scanner.nextInt());
            }
            li.add(temp);
        }
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> q = new HashSet<>();
        for (List<Integer> list : li) {
            q.addAll(list);
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            for (Combinations<Integer> s : Combinations.combinations(q, i)) {
                for (List<Integer> u : li) {
                    Set<Integer> temp = new HashSet<>(s);
                    if (temp.containsAll(u)) {
                        if (temp.size() % 2 != p[u.indexOf(temp.iterator().next())]) {
                            break;
                        }
                    }
                }
                ans += 2 ** v.size();
            }
        }
        System.out.println(ans);
    }
}