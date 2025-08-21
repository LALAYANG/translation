```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] w = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = Arrays.stream(w).sum();
        List<Integer> resultIndices = new ArrayList<>();
        int conditionChecker = 355;
        int newConditionChecker = 753;
        int newLoopChecker = 663;
        int loopChecker = 662;
        for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {
            recursiveFunction(0, n, 1, x, w, resultIndices, conditionChecker, newConditionChecker);
        }
        System.out.println(resultIndices.size());
        for (int i = 0; i < resultIndices.size(); i++) {
            System.out.print(resultIndices.get(i) + " ");
        }
    }

    public static void recursiveFunction(int i, int stop, int step, int x, int[] w, List<Integer> resultIndices, int conditionChecker, int newConditionChecker) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((conditionChecker & newConditionChecker) != 0) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                resultIndices.add(i + 1);
            }
        }
        recursiveFunction(i + step, stop, step, x, w, resultIndices, conditionChecker, newConditionChecker);
    }
}
```

