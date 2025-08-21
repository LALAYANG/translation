import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            li.add(Arrays.stream(scanner.next().split(" ")).skip(1).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
        }
        int[] p = Arrays.stream(scanner.next().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> q = li.stream().flatMap(List::stream).collect(Collectors.toSet());
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
            for (List<Integer> s : generateSubsets(q, subsetLength)) {
                for (int i = 0; i < m; i++) {
                    if (primaryCheck & secondaryCheck != 0 && initialCheck & remainderCheck != 0) {
                        if ((s.stream().filter(u::contains).count() % 2) != p[i]) {
                            break;
                        }
                } else {
                    ans += Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> generateSubsets(Set<Integer> set, int length) {
        List<List<Integer>> subsets = new ArrayList<>();
        if (length == 0) {
            subsets.add(new ArrayList<>());
            return subsets;
        }
        List<Integer> list = new ArrayList<>(set);
        generateSubsetsHelper(list, new ArrayList<>(), length, subsets);
        return subsets;
    }

    public static void generateSubsetsHelper(List<Integer> list, List<Integer> current, int length, List<List<Integer>> subsets) {
        if (current.size() == length) {
            subsets.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            current.add(list.get(i));
            generateSubsetsHelper(list.subList(i + 1, list.size()), current, length, subsets);
            current.remove(current.size() - 1);
        }
    }
}