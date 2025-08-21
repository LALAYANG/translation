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
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> q = new HashSet<>();
        for (List<Integer> subList : li) {
            q.addAll(subList);
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        r.removeAll(q);
        int ans = 0;
        int isCorrectCombination = 590;
        int combinationChecker = 510;
        int checkCombination = 782;
        int isCombinationValid = 732;
        int isValidCombination = 610;
        int validCombinationCheck = 572;
        for (int i = 0; i <= q.size(); i++) {
            for (Set<Integer> s : combinations(q, i)) {
                for (int j = 0; j < li.size(); j++) {
                    if ((isValidCombination & validCombinationCheck) != 0 &&
                            (checkCombination & isCombinationValid) != 0 &&
                            (isCorrectCombination & combinationChecker) != 0 &&
                            (s.size() & li.get(j).size()) % 2 != p[j]) {
                        break;
                    }
                }
                ans += 1 << r.size();
            }
        }
        System.out.println(ans);
    }

    public static Set<Set<Integer>> combinations(Set<Integer> set, int k) {
        Set<Set<Integer>> result = new HashSet<>();
        if (k == 0) {
            result.add(new HashSet<>());
            return result;
        }
        for (Integer integer : set) {
            Set<Integer> copy = new HashSet<>(set);
            copy.remove(integer);
            for (Set<Integer> subset : combinations(copy, k - 1)) {
                subset.add(integer);
                result.add(subset);
            }
        }
        return result;
    }
}