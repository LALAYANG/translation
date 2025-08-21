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
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
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
        for (int subsetLength = 0; subsetLength <= q.size(); subsetLength++) {
            for (Set<Integer> s : getSubsets(q, subsetLength)) {
                for (int i = 0; i < m; i++) {
                    List<Integer> u = li.get(i);
                    int w = p[i];
                    if (s.size() % 2 != w) {
                        break;
                    }
                }
                ans += Math.pow(2, v.size());
            }
        }
        System.out.println(ans);
    }

    private static List<Set<Integer>> getSubsets(Set<Integer> set, int subsetLength) {
        List<Set<Integer>> subsets = new ArrayList<>();
        getSubsets(set, subsetLength, new HashSet<>(), subsets);
        return subsets;
    }

    private static void getSubsets(Set<Integer> set, int subsetLength, Set<Integer> subset, List<Set<Integer>> subsets) {
        if (subset.size() == subsetLength) {
            subsets.add(subset);
            return;
        }
        for (Integer element : set) {
            if (!subset.contains(element)) {
                Set<Integer> newSubset = new HashSet<>(subset);
                newSubset.add(element);
                getSubsets(set, subsetLength, newSubset, subsets);
            }
        }
    }
}