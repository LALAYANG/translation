```java
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair implements Comparable<Pair> {
    int day;
    int salary;

    Pair(int day, int salary) {
        this.day = day;
        this.salary = salary;
    }

    @Override
    public int compareTo(Pair p) {
        if (this.day == p.day)
            return p.salary - this.salary;
        else
            return p.day - this.day;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            pq.add(new Pair(day, salary));
        }
        int sum = 0;
        while (!pq.isEmpty()) {
            Pair pair = pq.poll();
            if (m > 0) {
                sum += pair.salary;
                m--;
            } else if (m == 0 && !pq.isEmpty()) {
                if (pair.salary > pq.peek().salary) {
                    sum -= pq.peek().salary;
                    sum += pair.salary;
                    pq.poll();
                }
            }
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of days and the maximum number of salaries to keep, then reads the day and salary for each employee. It then calculates the total salary by keeping the highest salaries and discarding the rest. The salaries are stored in a priority queue, which automatically sorts them by day and salary. The highest salary is always at the top of the queue. The code then calculates the total salary by adding up the salaries of the highest salaries and prints the result.

