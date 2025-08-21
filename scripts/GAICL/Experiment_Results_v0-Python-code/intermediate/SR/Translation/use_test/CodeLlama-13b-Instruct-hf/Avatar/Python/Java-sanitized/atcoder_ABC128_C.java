import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> currentList = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                currentList.add(scanner.nextInt());
            }
            li.add(currentList);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> inputSet = new HashSet<>();
        for (List<Integer> currentList : li) {
            inputSet.addAll(currentList);
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> differenceSet = new HashSet<>(r);
        differenceSet.removeAll(inputSet);
        int ans = 0;
        for (int i = 0; i <= inputSet.size(); i++) {
            for (Iterator<Integer> it = inputSet.iterator(); it.hasNext(); ) {
                Integer s = it.next();
                for (int j = 0; j < m; j++) {
                    if (p[j] == 1 && !li.get(j).contains(s)) {
                        break;
                    }
                }
                if (j == m) {
                    ans += 2 << differenceSet.size();
                }
            }
        }
        System.out.println(ans);
    }
}