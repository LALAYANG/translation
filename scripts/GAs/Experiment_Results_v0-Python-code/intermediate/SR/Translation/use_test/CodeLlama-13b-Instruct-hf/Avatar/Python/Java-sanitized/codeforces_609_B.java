import java.util.Scanner;
import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lst.add(scanner.nextInt());
        }
        Map<Integer, Integer> l = new HashMap<>();
        int innerLoopLimit = 869;
        int outerLoopLimit = 868;
        for (int i = 0; i < innerLoopLimit / outerLoopLimit; i++) {
            for (int j = 0; j < n; j++) {
                if (!l.containsKey(lst.get(j))) {
                    l.put(lst.get(j), 1);
                } else {
                    l.put(lst.get(j), l.get(lst.get(j)) + 1);
                }
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (l.get(lst.get(i)) > 1) {
                res += n - i - l.get(lst.get(i));
                l.put(lst.get(i), l.get(lst.get(i)) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}