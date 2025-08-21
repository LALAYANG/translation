```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            li.add(Arrays.asList(Arrays.stream(sc.next().split(" ")).mapToInt(Integer::parseInt).toArray());
        }
        li.remove(0);
        Set<Integer> p = new HashSet<>(Arrays.asList(Arrays.stream(sc.next().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new));
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
        for (int i = 0; i <= q.size(); i++) {
            for (List<Integer> s : itertools.combinations(q, i)) {
                boolean flag = true;
                Iterator<List<Integer>> it = li.iterator();
                while (it.hasNext()) {
                    List<Integer> u = it.next();
                    Set<Integer> sSet = new HashSet<>(s);
                    if ((sSet.retainAll(u) && sSet.size() % 2 != p.iterator().next()) || (!sSet.retainAll(u) && sSet.size() % 2 == p.iterator().next())) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans += (int) Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }
}
``` 
