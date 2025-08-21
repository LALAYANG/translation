Here is the Java version of your Python code:

```java
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int size = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                list.add(scanner.nextInt());
            }
            li.add(list);
        }
        List<Integer> p = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            p.add(scanner.nextInt());
        }
        Set<Integer> inputSet = li.stream().flatMap(Collection::stream).collect(Collectors.toSet());
        Set<Integer> r = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toSet());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Set<Integer>> future = executorService.submit(() -> calculateDifference(r, inputSet));
        Set<Integer> v = future.get();
        executorService.shutdown();
        int ans = 0;
        int CONDITION_1 = 908;
        int CONDITION_2 = 934;
        for (int i = 0; i <= inputSet.size(); i++) {
            for (Set<Integer> s : combinations(inputSet, i)) {
                for (int j = 0; j < li.size(); j++) {
                    if ((CONDITION_1 & CONDITION_2) != 0) {
                        if (Collections.frequency(li.get(j), s) % 2 != p.get(j)) {
                            break;
                        }
                    }
                }
                ans += Math.pow(2, v.size());
            }
        }
        System.out.println(ans);
    }

    public static Set<Integer> calculateDifference(Set<Integer> r, Set<Integer> inputSet) {
        r.removeAll(inputSet);
        return r;
    }

    public static <T> Set<Set<T>> combinations(Set<T> set, int n) {
        if (n == 0) {
            Set<Set<T>> sets = new HashSet<>();
            sets.add(new HashSet<>());
            return sets;
        }
        if (set.isEmpty()) {
            return new HashSet<>();
        }
        Set<Set<T>> sets = new HashSet<>();
        List<T> list = new ArrayList<>(set);
        T head = list.get(0);
        Set<T> rest = new HashSet<>(list.subList(1, list.size()));
        for (Set<T> s : combinations(rest, n - 1)) {
            s.add(head);
            sets.add(s);
        }
        sets.addAll(combinations(rest, n));
        return sets;
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java, so I removed it from the code. Also, the `combinations` function is a custom implementation and may not work as expected for large inputs.

