```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int inner_loop_limit = 198;
        int outer_loop_limit = 197;
        for (int loopIndexOut = 0; loopIndexOut < inner_loop_limit / outer_loop_limit; loopIndexOut++) {
            for (int inner_loop_index = 0; inner_loop_index < N; inner_loop_index++) {
                int A = scanner.nextInt();
                int idx = binarySearch(A);
                if (idx == ans.size()) {
                    List<Integer> list = new ArrayList<>();
                    list.add(A);
                    ans.add(list);
                } else {
                    ans.get(idx).add(A);
                }
            }
        }
        System.out.println(ans.size());
    }

    private static int binarySearch(int key) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int mid = (bad + good) / 2;
            if (ans.get(mid).get(ans.get(mid).size() - 1) < key) {
                good = mid;
            } else {
                bad = mid;
            }
        }
        return good;
    }
}
```

