```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<int[]> x = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        PriorityQueue<Integer> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(new int[]{-day, -salary});
        }
        while (!x.isEmpty()) {
            int[] pop = x.poll();
            int d = pop[0];
            int salary = pop[1];
            int r = m - y.size();
            if (r >= -d) {
                y.add(salary);
            } else {
                y.add(salary);
                y.poll();
            }
        }
        int sum = 0;
        while (!y.isEmpty()) {
            sum += y.poll();
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of days and the capacity, then reads the days and salaries, pushes them into a priority queue, and pops them out. If the remaining capacity is greater than or equal to the current day, it adds the salary to the priority queue, otherwise it adds the salary and removes the smallest salary. Finally, it sums up all the salaries and prints the result.

