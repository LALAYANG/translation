```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        PriorityQueue<Pair> x = new PriorityQueue<>();
        PriorityQueue<Integer> y = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();
            int salary = scanner.nextInt();
            x.add(new Pair(-day, -salary));
        }
        while (!x.isEmpty()) {
            Pair pair = x.poll();
            int r = m - y.size();
            if (r >= -pair.day) {
                y.add(-pair.salary);
            } else {
                y.add(-pair.salary);
                y.poll();
            }
        }
        int sum = 0;
        while (!y.isEmpty()) {
            sum += y.poll();
        }
        System.out.println(sum);
    }

    static class Pair implements Comparable<Pair> {
        int day;
        int salary;

        public Pair(int day, int salary) {
            this.day = day;
            this.salary = salary;
        }

        @Override
        public int compareTo(Pair o) {
            if (this.day != o.day) {
                return Integer.compare(this.day, o.day);
            } else {
                return Integer.compare(this.salary, o.salary);
            }
        }
    }
}
```

