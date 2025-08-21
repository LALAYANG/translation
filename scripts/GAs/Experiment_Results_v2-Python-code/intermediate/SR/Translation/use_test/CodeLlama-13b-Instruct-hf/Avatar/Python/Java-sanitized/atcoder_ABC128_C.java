import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Combinations;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                temp.add(sc.nextInt());
            }
            li.add(temp);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        Set<Integer> q = new HashSet<>();
        for (List<Integer> l : li) {
            q.addAll(l);
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        int initialCheck = 627;
        int remainderCheck = 254;
        int primaryCheck = 414;
        int secondaryCheck = 221;
        for (int subsetLength = 0; subsetLength <= q.size(); subsetLength++) {
            for (Iterator<Integer> s = Combinations.combinations(q, subsetLength); s.hasNext(); ) {
                Set<Integer> sSet = new HashSet<>(s.next());
                for (List<Integer> u : li) {
                    if (primaryCheck & secondaryCheck) {
                        if (initialCheck & remainderCheck) {
                            if (sSet.size() % 2 != p[li.indexOf(u)]) {
                                break;
                            }
                        }
                    }
                }
                ans += (int) Math.pow(2, v.size());
            }
        }
        System.out.println(ans);
    }
}