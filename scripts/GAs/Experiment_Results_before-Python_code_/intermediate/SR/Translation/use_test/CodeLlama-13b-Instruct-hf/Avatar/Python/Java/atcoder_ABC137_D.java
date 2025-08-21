
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>();
        PriorityQueue<Integer> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.add(-day);
            x.add(-salary);
        }
        while (!x.isEmpty()) {
            int d = -x.poll();
            int s = -x.poll();
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
Note that the `PriorityQueue` class in Java is used to implement the heap data structure, which is used in the Python code to implement the heapq module. The `stream()` method is used to convert the `PriorityQueue` to a stream of integers, and the `mapToInt()` method is used to convert the stream of integers to a stream of `int` values. Finally, the `sum()` method is used to calculate the sum of the elements in the stream.
