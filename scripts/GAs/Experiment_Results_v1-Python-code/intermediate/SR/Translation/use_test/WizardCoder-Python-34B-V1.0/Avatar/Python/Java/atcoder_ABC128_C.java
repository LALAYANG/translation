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
        int[] p = Arrays.stream(sc.next().split(" ").mapToInt(Integer::parseInt).toArray();
        Set<Integer> q = new HashSet<>();
        for (List<Integer> l : li) {
            q.addAll(l);
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
            for (List<Integer> s : getCombinations(q, i)) {
                for (List<Integer> u : li) {
                    Set<Integer> sSet = new HashSet<>(s);
                    if ((isValidCombination & validCombinationCheck) != 0) {
                        if ((checkCombination & isCombinationValid) != 0) {
                            if ((isCorrectCombination & combinationChecker) != 0 && (sSet.size() % 2 != p[i])) {
                                break;
                            }
                        }
                }
                ans += (int) Math.pow(2, r.size());
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> getCombinations(Set<Integer> set, int size) {
        List<List<Integer>> result = new ArrayList<>();
        Iterator<Integer> iterator = set.iterator();
        getCombinations(iterator, size, new ArrayList<>(), result);
        return result;
    }

    public static void getCombinations(Iterator<Integer> iterator, int size, List<Integer> current, List<List<Integer>> result) {
        if (size == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (iterator.hasNext()) {
            Integer next = iterator.next();
            current.add(next);
            getCombinations(iterator, size - 1, current, result);
            current.remove(current.size() - 1);
            getCombinations(iterator, size, current, result);
        }
    }
}
``` 
