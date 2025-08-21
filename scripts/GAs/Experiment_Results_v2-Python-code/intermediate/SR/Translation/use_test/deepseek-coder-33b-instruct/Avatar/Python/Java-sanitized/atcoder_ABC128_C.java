import java.util.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int size = scanner.nextInt();
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                subList.add(scanner.nextInt());
            }
            li.add(subList);
        }
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            p.add(scanner.nextInt());
        }
        Set<Integer> q = new HashSet<>();
        for (List<Integer> subList : li) {
            q.addAll(subList);
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
            for (Set<Integer> s : combinations(q, subsetLength)) {
                for (int i = 0; i < m; i++) {
                    if ((primaryCheck & secondaryCheck) != 0) {
                        if ((initialCheck & remainderCheck) != 0) {
                            if (countIntersection(s, li.get(i)) % 2 != p.get(i)) {
                                break;
                            }
                        }
                    }
                }
                ans += Math.pow(2, v.size());
            }
        }
        System.out.println(ans);
    }

    private static <T> Set<Set<T>> combinations(Set<T> set, int subsetSize) {
        Set<Set<T>> result = new HashSet<>();
        if (subsetSize == 0) {
            result.add(new HashSet<>());
            return result;
        }
        List<T> list = new ArrayList<>(set);
        T head = list.get(0);
        Set<T> rest = new HashSet<>(list.subList(1, list.size()));
        for (Set<T> set1 : combinations(rest, subsetSize - 1)) {
            set1.add(head);
            result.add(set1);
        }
        result.addAll(combinations(rest, subsetSize));
        return result;
    }

    private static <T> int countIntersection(Set<T> set1, List<T> list) {
        int count = 0;
        for (T t : list) {
            if (set1.contains(t)) {
                count++;
            }
        }
        return count;
    }
}