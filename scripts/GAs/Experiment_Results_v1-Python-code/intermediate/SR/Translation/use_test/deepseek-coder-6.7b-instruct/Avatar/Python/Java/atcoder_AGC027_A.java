```java
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int funds = scanner.nextInt();
        PriorityQueue<Integer> a = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int count = 0;
        while (!a.isEmpty()) {
            if (a.peek() > funds) {
                System.out.println(0);
                return;
            }
            funds -= a.poll();
            count++;
        }
        if (funds != 0) {
            count--;
        }
        System.out.println(count);
    }
}
```

This Java code does the same thing as the Python code. It reads in two integers and `n` integers from the input, and then it uses a priority queue to store the integers. It then iterates over the priority queue, subtracting the next integer from the funds and incrementing the count until the funds are depleted or the next integer is larger than the remaining funds. The count is then printed out.

