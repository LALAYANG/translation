import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

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
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            p.add(scanner.nextInt());
        }

        Set<Integer> inputSet = new HashSet<>();
        for (List<Integer> currentList : li) {
            inputSet.addAll(currentList);
        }

        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }

        int ans = 0;
        for (int i = 0; i < li.size(); i++) {
            List<Integer> currentList = li.get(i);
            int w = p.get(i);
            Set<Integer> s = new HashSet<>();
            for (int j = 0; j < currentList.size(); j++) {
                s.add(currentList.get(j));
            }
            if (s.size() == 0) {
                ans += 2 ** (r.size() - s.size());
            } else {
                ans += 2 ** (r.size() - s.size() - 1);
            }
        }
        System.out.println(ans);
    }
}