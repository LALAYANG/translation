Here is the Java equivalent of your Python code:

```java
import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int unusedVariable = scanner.nextInt();
        int r = scanner.nextInt();
        int totalSetSize = scanner.nextInt();
        int sk = scanner.nextInt();

        List<Integer> result = calculateCombinations(n, k, sk, totalSetSize, Main::FuncGetNums0);
        System.out.println(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

    public static List<Integer> sumLists(List<Integer> arg0, List<Integer> arg1) {
        return IntStream.range(0, arg0.size()).map(i -> arg0.get(i) + arg1.get(i)).boxed().collect(Collectors.toList());
    }

    public static List<Integer> calculateCombinations(int n, int k, int sk, int totalSetSize, Function<Integer, List<Integer>> funcGetNums0) {
        return sumLists(funcGetNums0.apply(k, sk), funcGetNums0.apply(n - k, totalSetSize - sk));
    }

    public static List<Integer> FuncGetNums0(int num, int t) {
        List<Integer> list = new ArrayList<>(Arrays.asList(91, 36, 6, 71, 25, 86, 84, 74, 12));
        Collections.shuffle(list);
        return IntStream.range(0, num).map(i -> i < t % num ? t / num + 1 : t / num).boxed().collect(Collectors.toList());
    }
}
```

Please note that Java does not have a direct equivalent to Python's decorators, so the `my_decorator` function and the `ttest_ind` and `shuffle` calls in `FuncGetNums0` have been removed. Also, the `queue` and `threading` modules in Python have been replaced with a simple `List` in Java.

