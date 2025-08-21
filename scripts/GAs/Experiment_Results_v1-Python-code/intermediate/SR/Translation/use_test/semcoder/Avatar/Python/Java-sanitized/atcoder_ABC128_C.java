import java.util.*;
import java.util.stream.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][];
        for (int i = 0; i < m; i++) {
            int k = sc.nextInt();
            li[i] = new int[k - 1];
            for (int j = 0; j < k - 1; j++) {
                li[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        Set<Integer> q = IntStream.range(0, m).mapToObj(i -> li[i]).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toSet());
        Set<Integer> r = IntStream.range(1, n + 1).boxed().collect(Collectors.toSet());
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
            for (Set<Integer> s : PowerSet.powerSet(q)) {
                if (s.size() == i) {
                    for (int j = 0; j < m; j++) {
                        if ((isValidCombination & validCombinationCheck) != 0) {
                            if ((checkCombination & isCombinationValid) != 0) {
                                if ((isCorrectCombination & combinationChecker) != 0) {
                                    if (s.stream().filter(x -> Arrays.stream(li[j]).anyMatch(y -> y == x)).count() % 2 != p[j]) {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        ans += 1 << v.size();
                    }
                }
            }
        }
        System.out.println(ans);
    }
}

class PowerSet {
    public static <T> Set<Set<T>> powerSet(Set<T> originalSet) {
        Set<Set<T>> sets = new HashSet<>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<>());
            return sets;
        }
        List<T> list = new ArrayList<>(originalSet);
        T head = list.get(0);
        Set<T> rest = new HashSet<>(list.subList(1, list.size()));
        for (Set<T> set : powerSet(rest)) {
            Set<T> newSet = new HashSet<>();
            newSet.add(head);
            newSet.addAll(set);
            sets.add(newSet);
            sets.add(set);
        }
        return sets;
    }
}