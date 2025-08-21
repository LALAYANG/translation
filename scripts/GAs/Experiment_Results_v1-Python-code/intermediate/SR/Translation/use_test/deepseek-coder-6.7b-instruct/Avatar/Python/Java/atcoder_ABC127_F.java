```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> heapOne = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>(Collections.reverseOrder());
        long sumB = 0;
        long sumP1 = 0;
        long sumP2 = 0;
        for (int i = 0; i < q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == 2) {
                if (heapOne.size() == p2.size()) {
                    System.out.println(p2.peek() + " " + (sumP1 - heapOne.size() * p2.peek() + p2.size() * p2.peek() - sumP2 + sumB));
                } else {
                    System.out.println(heapOne.peek() + " " + (sumP1 - heapOne.size() * heapOne.peek() + p2.size() * heapOne.peek() - sumP2 + sumB));
                }
            } else {
                sumB += c;
                if (heapOne.isEmpty()) {
                    heapOne.add(b);
                    sumP1 += b;
                } else if (heapOne.peek() <= b) {
                    heapOne.add(b);
                    sumP1 += b;
                } else {
                    p2.add(-b);
                    sumP2 += b;
                }
                if (heapOne.size() < p2.size()) {
                    int k = p2.poll();
                    heapOne.add(-k);
                    sumP2 = sumP2 - k;
                    sumP1 += k;
                }
                if (heapOne.size() - 1 > p2.size()) {
                    int k = heapOne.poll();
                    p2.add(-k);
                    sumP1 = sumP1 - k;
                    sumP2 += k;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the number of queries `q` and then for each query, it reads three integers `a`, `b`, and `c`. If `a` is 2, it prints the maximum value in the heap and the sum of all elements in the heap. If `a` is not 2, it adds `b` to the appropriate heap and updates the sums. The heap with the smaller maximum value is moved to the heap with the larger maximum value. The sum of all elements in the heap is printed after each query.

