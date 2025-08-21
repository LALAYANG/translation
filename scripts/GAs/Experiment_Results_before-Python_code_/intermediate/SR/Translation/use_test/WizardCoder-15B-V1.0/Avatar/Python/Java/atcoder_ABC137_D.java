```java
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> x = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> y = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            x.offer(-day * -salary);
        }
        while (!x.isEmpty()) {
            int d = -x.peek() / -salary;
            int s = -x.poll();
            int r = m - y.size();
            if (r >= d) {
                y.offer(-s);
            } else {
                y.offer(-s);
                y.poll();
            }
        }
        int sum = 0;
        while (!y.isEmpty()) {
            sum += -y.poll();
        }
        System.out.println(sum);
    }
}
```
