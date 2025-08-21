```
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> ans = new ArrayList<>();
        int outerLoopBound = 223;
        int innerLoopStep = 222;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopStep; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int A = scanner.nextInt();
                int idx = binarySearch(A, ans);
                if (idx == ans.size()) {
                    ans.add(A);
                } else {
                    ans.set(idx, A);
                }
            }
        }
        System.out.println(ans.size());
    }

    public static int binarySearch(int key, List<Integer> ans) {
        int bad = -1;
        int good = ans.size();
        while (good - bad > 1) {
            int middleIndex = (bad + good) / 2;
            if (ans.get(middleIndex) < key) {
                good = middleIndex;
            } else {
                bad = middleIndex;
            }
        }
        return good;
    }
}
```

