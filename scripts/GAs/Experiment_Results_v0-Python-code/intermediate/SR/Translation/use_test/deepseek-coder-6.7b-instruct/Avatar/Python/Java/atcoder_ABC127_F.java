```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        long sumP1 = 0, sumP2 = 0, sumAdjustment = 0;
        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();
            int value = scanner.nextInt();
            int adjustment = scanner.nextInt();
            if (type == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sumP1 - p2.size() * p2.peek() + p1.size() * p2.peek() - sumP2 + sumAdjustment));
                } else {
                    System.out.println(p1.peek() + " " + (sumP1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sumP2 + sumAdjustment));
                }
            } else {
                sumAdjustment += adjustment;
                if (p1.isEmpty()) {
                    p1.add(value);
                    sumP1 += value;
                } else if (p1.peek() <= value) {
                    p1.add(value);
                    sumP1 += value;
                } else {
                    p2.add(-value);
                    sumP2 += value;
                }
                if (p1.size() < p2.size()) {
                    int k = p2.poll();
                    p1.add(-k);
                    sumP2 = sumP2 - k;
                    sumP1 = sumP1 + k;
                }
                if (p1.size() - 1 > p2.size()) {
                    int k = p1.poll();
                    p2.add(-k);
                    sumP1 = sumP1 - k;
                    sumP2 = sumP2 + k;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of queries `q` and then for each query, it reads the type, value, and adjustment. If the type is 2, it prints the median and the sum of the values in the queue. If the type is not 2, it adds the value to the appropriate queue and adjusts the sums accordingly. The Java code uses a PriorityQueue to implement the heap data structure.

