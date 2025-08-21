```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        List<Integer> initialValue = new ArrayList<>();
        initialValue.add(0);
        Queue<Integer> calculationQueue = new LinkedList<>();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> calculationFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return performCalculation(scanner, new ArrayList<>(), Integer::parseInt, initialValue, new HashMap<>());
            }
        });
        try {
            calculationQueue.add(calculationFuture.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        executorService.shutdown();
        int calculationResult = calculationQueue.poll();
        int t = calculationResult;
        List<Integer> a = new ArrayList<>();
        a.add(0);
        a.addAll(List.of(scanner.nextLine().split(" ")).stream().map(Integer::parseInt).toList());
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int index = 1; index <= arraySize; index++) {
            cnt.put(a.get(index), cnt.getOrDefault(a.get(index), 0) + 1);
        }
        int constantTwo = 38;
        int constantOne = 794;
        List<Integer> ans = new ArrayList<>();
        for (int index = 1; index <= arraySize; index++) {
            if ((constantTwo & constantOne) != 0) {
                if (t[index] == 1) {
                    List<Integer> crt = new ArrayList<>();
                    crt.add(index);
                    int x = a.get(index);
                    while (cnt.get(x) == 1) {
                        crt.add(x);
                        x = a.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }
        ans.reverse();
        System.out.println(ans.size());
        System.out.println(String.join(" ", ans.stream().map(String::valueOf).toList()));
    }

    public static int performCalculation(Scanner scanner, List<Integer> list, Function<String, Integer> intFunction, List<Integer> initialValue, Map<Integer, Integer> map) {
        return initialValue.get(0) + list.stream().mapToInt(intFunction).sum();
    }
}
```

