```java
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>();
        PriorityQueue<Integer> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(-day);
            y.add(-salary);
        }
        while (!x.isEmpty()) {
            int d = x.poll();
            int s = y.poll();
            int r = m - y.size();
            if (r >= -d) {
                y.add(-s);
            } else {
                y.add(-s);
                y.poll();
            }
        }
        System.out.println(y.stream().mapToInt(Integer::intValue).sum());
    }
}
```
Note: This solution uses Java 8's Stream API to sum the elements of the `y` queue. If you are using an earlier version of Java, you can use a loop to sum the elements instead.
