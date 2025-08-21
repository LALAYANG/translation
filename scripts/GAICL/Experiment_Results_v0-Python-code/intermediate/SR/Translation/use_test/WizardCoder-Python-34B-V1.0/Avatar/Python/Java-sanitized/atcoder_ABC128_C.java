import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Comparator;
import java.util.Arrays;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] li = new int[m][];
        for (int i = 0; i < m; i++) {
            li[i] = IntStream.of(scanner.next().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        int[] p = IntStream.of(scanner.next().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> input_set = Arrays.stream(li).flatMap(Arrays::stream).boxed().collect(Collectors.toSet());
        Set<Integer> r = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toSet());
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(input_set);
        int ans = 0;
        int CONDITION_1 = 908;
        int CONDITION_2 = 934;
        for (int i = 0; i <= input_set.size(); i++) {
            for (Set<Integer> s : generatePowerSet(input_set)) {
                boolean condition1 = true;
                boolean condition2 = true;
                for (int j = 0; j < m; j++) {
                    if ((CONDITION_1 & CONDITION_2) != 0 && (s.stream().filter(x -> li[j].contains(x)).collect(Collectors.toSet()).size() % 2 != p[j])) {
                        condition1 = false;
                        break;
                    }
                }
                if (condition1) {
                    ans += Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static Set<Set<Integer>> generatePowerSet(Set<Integer> originalSet) {
        Set<Set<Integer>> sets = new HashSet<>();
        if (originalSet.isEmpty()) {
            sets.add(new HashSet<>());
            return sets;
        }
        List<Integer> list = new ArrayList<>(originalSet);
        int size = originalSet.size();
        for (int i = 0; i < (1 << size); i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < size; j++) {
                if ((i & (1 << j)) != 0) {
                    set.add(list.get(j));
                }
            }
            sets.add(set);
        }
        return sets;
    }
}