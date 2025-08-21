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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 1; j < n; j++) {
                temp.add(sc.nextInt());
            }
            li.add(temp);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        Set<Integer> q = new HashSet<>();
        for (int i = 0; i < m; i++) {
            q.addAll(li.get(i));
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            for (Combinations<Integer> s : Combinations.of(q, i)) {
                for (int j = 0; j < li.size(); j++) {
                    Set<Integer> temp = new HashSet<>(s);
                    if (temp.size() % 2 != p[j]) {
                        break;
                    }
                }
                ans += (int) Math.pow(2, v.size());
            }
        }
        System.out.println(ans);
    }
}