```java
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>((a, b) -> b - a);
        long sum_p1 = 0, sum_p2 = 0, sum_adjustment = 0;
        for (int i = 0; i < q; i++) {
            int type = scanner.nextInt();
            int value = scanner.nextInt();
            int adjustment = scanner.nextInt();
            if (type == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p2.size() * p2.peek() + sum_p2 - sum_adjustment));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + sum_p2 - sum_adjustment));
                }
            } else {
                sum_adjustment += adjustment;
                if (p1.isEmpty()) {
                    p1.add(value);
                    sum_p1 += value;
                } else if (p1.peek() <= value) {
                    p1.add(value);
                    sum_p1 += value;
                } else {
                    p2.add(value);
                    sum_p2 += value;
                }
                if (p1.size() < p2.size()) {
                    int k = p2.poll();
                    p1.add(-k);
                    sum_p2 -= k;
                    sum_p1 += k;
                } else if (p1.size() - 1 > p2.size()) {
                    int k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of queries `q` and then for each query, it reads the type, value, and adjustment. If the type is 2, it prints the median and the sum of the numbers minus the median plus the sum of adjustments. If the type is not 2, it adds the value to the appropriate priority queue and adjusts the sums accordingly. If the size of the two priority queues differ by more than 1, it moves a number from the larger queue to the smaller queue and adjusts the sums accordingly.

