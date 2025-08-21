import java.util.*;
import java.util.stream.*;

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
        Set<Integer> q = li.stream()
                .flatMapToInt(IntStream::rangeClosed)
                .boxed()
                .collect(Collectors.toSet());
        Set<Integer> r = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toSet());
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        int initialCheck = 627;
        int remainderCheck = 254;
        int primaryCheck = 414;
        int secondaryCheck = 221;
        for (int subsetLength = 0; subsetLength <= q.size(); subsetLength++) {
            for (Set<Integer> s : getCombinations(q, subsetLength)) {
                for (int i = 0; i < m; i++) {
                    if ((primaryCheck & secondaryCheck) != 0 && (initialCheck & remainderCheck) != 0) {
                        if (s.size() % 2 != p[i]) {
                            break;
                        }
                    }
                }
                ans += (int) Math.pow(2, v.size());
            }
        }
        System.out.println(ans);
    }

    public static <T> Set<Set<T>> getCombinations(Set<T> set, int length) {
        if (length == 0) {
            Set<Set<T>> result = new HashSet<>();
            result.add(new HashSet<>());
            return result;
        }
        if (set.isEmpty()) {
            return new HashSet<>();
        }
        List<T> list = new ArrayList<>(set);
        T head = list.get(0);
        Set<T> rest = new HashSet<>(list.subList(1, list.size()));
        Set<Set<T>> combinations = getCombinations(rest, length - 1);
        combinations.forEach(c -> c.add(head));
        combinations.addAll(getCombinations(rest, length));
        return combinations;
    }
}