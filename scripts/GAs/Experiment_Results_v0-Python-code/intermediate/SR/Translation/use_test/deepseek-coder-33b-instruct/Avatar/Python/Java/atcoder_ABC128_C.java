```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int size = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                list.add(scanner.nextInt());
            }
            li.add(list);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> inputSet = new HashSet<>();
        for (List<Integer> list : li) {
            inputSet.addAll(list);
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> differenceSet = new HashSet<>(r);
        differenceSet.removeAll(inputSet);
        int ans = 0;
        int CONDITION_1 = 908;
        int CONDITION_2 = 934;
        for (int i = 0; i <= inputSet.size(); i++) {
            for (Set<Integer> s : combinations(inputSet, i)) {
                for (int j = 0; j < li.size(); j++) {
                    if ((CONDITION_1 & CONDITION_2) != 0) {
                        if (countIntersection(s, li.get(j)) % 2 != p[j]) {
                            break;
                        }
                    }
                }
                ans += 1 << differenceSet.size();
            }
        }
        System.out.println(ans);
    }

    public static <T> Set<Set<T>> combinations(Set<T> set, int k) {
        Set<Set<T>> result = new HashSet<>();
        if (k == 0) {
            result.add(new HashSet<>());
            return result;
        }
        if (k == set.size()) {
            result.add(set);
            return result;
        }
        T[] array = (T[]) set.toArray();
        for (int i = 0; i < array.length; i++) {
            Set<T> copy = new HashSet<>(set);
            copy.remove(array[i]);
            for (Set<T> subset : combinations(copy, k - 1)) {
                subset.add(array[i]);
                result.add(subset);
            }
        }
        return result;
    }

    public static <T> int countIntersection(Set<T> set1, Set<T> set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection.size();
    }
}
```

