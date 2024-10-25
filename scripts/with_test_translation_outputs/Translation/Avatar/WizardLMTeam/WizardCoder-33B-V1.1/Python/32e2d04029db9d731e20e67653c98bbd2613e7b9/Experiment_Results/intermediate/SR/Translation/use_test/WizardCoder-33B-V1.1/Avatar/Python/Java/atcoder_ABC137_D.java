<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
5 3
1 2
1 3
1 4
2 1
2 3

Expected output:
10


```
import heapq
n , m = map ( int , input ( ).split ( ) )
x = [ ]
y = [ ]
for i in range ( n ) :
    day , salary = map ( int , input ( ).split ( ) )
    heapq.heappush ( x , ( - day , - salary ) )
while x :
    d , s = heapq.heappop ( x )
    r = m - len ( y )
    if r >= - d :
        heapq.heappush ( y , - s )
    else :
        heapq.heappush ( y , - s )
        heapq.heappop ( y )
print ( sum ( y ) )


```

### Response:
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
            x.offer(new int[]{-day, -salary});
        }
        while (!x.isEmpty()) {
            int[] pair = x.poll();
            int d = -pair[0];
            int s = -pair[1];
            int r = m - y.size();
            if (r >= d) {
                y.offer(s);
            } else if (!y.isEmpty() && y.peek() < s) {
                y.poll();
                y.offer(s);
            }
        }
        int sum = 0;
        while (!y.isEmpty()) {
            sum += y.poll();
        }
        System.out.println(sum);
    }
}
``` <｜end▁of▁sentence｜>
