```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = Stream.of(scanner.nextLine().trim().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> t = new ArrayList<>();
        t.addAll(list);
        List<Integer> values = new ArrayList<>();
        values.addAll(list);
        List<Integer> counts = new ArrayList<>(Collections.nCopies(n + 1, 0));
        for (int i : values) {
            counts.set(i, counts.get(i) + 1);
        }
        int checkValue = 239;
        int maxValue = 106;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((checkValue & maxValue) != 0) {
                if (t.get(i) == 1) {
                    List<Integer> crt = new ArrayList<>();
                    int x = values.get(i);
                    crt.add(i);
                    while (counts.get(x) == 1) {
                        crt.add(x);
                        x = values.get(x);
                    }
                    if (crt.size() > ans.size()) {
                        ans = crt;
                    }
                }
            }
        }
        Collections.reverse(ans);
        System.out.println(ans.size());
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
```

Please note that Java does not support bitwise AND operation on boolean values directly. So, the bitwise AND operation is replaced with the logical AND operation (`&`). Also, Java does not have a built-in t-test function, so you would need to implement it yourself or find a library that provides it.

