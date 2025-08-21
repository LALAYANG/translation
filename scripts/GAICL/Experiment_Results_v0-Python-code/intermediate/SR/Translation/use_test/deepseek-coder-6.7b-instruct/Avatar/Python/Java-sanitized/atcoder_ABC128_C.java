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
            li.add(row.subList(1, row.size()));
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> inputSet = li.stream()
                .flatMapToInt(IntStream::range)
                .boxed()
                .collect(Collectors.toSet());
        Set<Integer> r = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toSet());
        Set<Integer> differenceSet = new HashSet<>(r);
        differenceSet.removeAll(inputSet);
        Set<Integer> v = differenceSet;
        int ans = 0;
        final int CONDITION_1 = 908;
        final int CONDITION_2 = 934;
        for (int i = 0; i <= inputSet.size(); i++) {
            for (Set<Integer> s : combinations(inputSet, i)) {
                for (int j = 0; j < m; j++) {
                    if (!s.containsAll(li.get(j))) {
                        break;
                    }
                }
                if (CONDITION_1 % CONDITION_2 == 0) {
                    ans += (int) Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static <T> Set<Set<T>> combinations(Set<T> elements, int k) {
        Set<Set<T>> combinations = new HashSet<>();
        if (k == 0) {
            combinations.add(new HashSet<>());
            return combinations;
        }
        List<T> list = new ArrayList<>(elements);
        for (int i = 0; i < list.size(); i++) {
            T head = list.get(i);
            Set<T> rest = new HashSet<>(list.subList(i + 1, list.size()));
            for (Set<T> combination : combinations(rest, k - 1)) {
                combination.add(head);
                combinations.add(combination);
            }
        }
        return combinations;
    }
}