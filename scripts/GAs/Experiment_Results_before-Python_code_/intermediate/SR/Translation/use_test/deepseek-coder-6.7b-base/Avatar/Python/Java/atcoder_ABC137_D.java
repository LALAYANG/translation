
```
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            pq.add(-day);
            pq.add(-salary);
        }
        int sum = 0;
        while (m > 0) {
            int day = -pq.poll();
            int salary = -pq.poll();
            sum += salary;
            m--;
        }
        System.out.println(sum);
    }
}

```

