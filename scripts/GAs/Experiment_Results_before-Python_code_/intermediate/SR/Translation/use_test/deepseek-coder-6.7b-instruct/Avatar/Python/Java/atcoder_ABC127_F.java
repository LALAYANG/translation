```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(p2.peek() + " " + (sum_p1 - p2.size() * p2.peek() + p2.size() * p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                sum_b += c;
                if (p1.isEmpty()) {
                    p1.add(b);
                    sum_p1 += b;
                } else if (p1.peek() <= b) {
                    p1.add(b);
                    sum_p1 += b;
                } else {
                    p2.add(b);
                    sum_p2 += b;
                }
                if (p1.size() < p2.size()) {
                    int k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
                }
                if (p1.size() - 1 > p2.size()) {
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

This Java code does the same thing as the Python code. It reads the number of queries `q` from the input, and then for each query, it reads the type `a`, the number `b`, and the cost `c`. If `a` is 2, it prints the median and the total cost. If `a` is not 2, it adds `b` to the appropriate priority queue and updates the sum of the numbers in the queue. If the sizes of the two queues differ by more than 1, it moves a number from the larger queue to the smaller queue, updating the sums accordingly.

