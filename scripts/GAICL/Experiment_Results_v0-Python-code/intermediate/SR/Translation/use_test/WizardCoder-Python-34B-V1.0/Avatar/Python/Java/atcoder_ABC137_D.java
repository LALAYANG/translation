```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        while (!x.isEmpty()) {
            int d = -x.poll();
            int r = m - y.size();
            if (d >= 0) {
                y.add(-x.poll());
            } else {
                y.add(-x.poll());
                if (!y.isEmpty()) {
                    y.remove(0);
                }
            }
        }
        System.out.println(y.stream().mapToInt(Integer::intValue).sum());
    }
}
```

Test input:
5 3
1 2
1 3
1 4
2 1
2 3

Expected output:
10
``` 
