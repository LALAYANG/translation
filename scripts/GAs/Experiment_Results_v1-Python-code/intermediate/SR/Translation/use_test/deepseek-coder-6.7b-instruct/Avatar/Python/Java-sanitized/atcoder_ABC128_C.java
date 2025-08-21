import java.util.*;
import java.util.stream.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] li = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                li[i][j] = scanner.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> q = IntStream.range(0, m * n)
                .map(i -> li[i / n][i % n])
                .boxed()
                .collect(Collectors.toSet());
        Set<Integer> r = IntStream.rangeClosed(1, n)
                .boxed()
                .collect(Collectors.toSet());
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        int isCorrectCombination = 590;
        int combinationChecker = 510;
        int checkCombination = 782;
        int isCombinationValid = 732;
        int isValidCombination = 610;
        int validCombinationCheck = 572;
        for (int i = 0; i <= q.size(); i++) {
            for (Set<Integer> s : new HashSet<>(combinations(q, i))) {
                for (int j = 0; j < m; j++) {
                    if ((isValidCombination & validCombinationCheck) != 0 &&
                            (checkCombination & isCombinationValid) != 0 &&
                            (isCorrectCombination & combinationChecker) != 0 &&
                            (s.contains(li[j][0]) ^ (p[j] == 1))
                    ) {
                        break;
                    }
                }
                ans += (int) Math.pow(2, v.size());
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