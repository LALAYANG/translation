<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
1 -1000000000 1000000000
1 -1000000000 1000000000
1 -1000000000 1000000000
2

Expected output:
-1000000000 3000000000


```
q = int ( input ( ) )
ans = [ 0 , 0 ]
import heapq
p1 = [ ]
p2 = [ ]
heapq.heapify ( p1 )
heapq.heapify ( p2 )
sum_b = 0
sum_p1 = 0
sum_p2 = 0
for _ in range ( q ) :
    ql = list ( map ( int , input ( ).split ( ) ) )
    if ql [ 0 ] == 2 :
        if len ( p1 ) == len ( p2 ) :
            print ( - p2 [ 0 ] , sum_p1 - len ( p1 ) * - p2 [ 0 ] + len ( p2 ) * - p2 [ 0 ] - sum_p2 + sum_b )
        else :
            print ( p1 [ 0 ] , sum_p1 - len ( p1 ) * p1 [ 0 ] + len ( p2 ) * p1 [ 0 ] - sum_p2 + sum_b )
    else :
        sum_b += ql [ 2 ]
        if len ( p1 ) == 0 :
            heapq.heappush ( p1 , ql [ 1 ] )
            sum_p1 += ql [ 1 ]
        elif p1 [ 0 ] <= ql [ 1 ] :
            heapq.heappush ( p1 , ql [ 1 ] )
            sum_p1 += ql [ 1 ]
        else :
            heapq.heappush ( p2 , - ql [ 1 ] )
            sum_p2 += ql [ 1 ]
        if len ( p1 ) < len ( p2 ) :
            k = heapq.heappop ( p2 )
            heapq.heappush ( p1 , - k )
            sum_p2 += k
            sum_p1 -= k
        if len ( p1 ) - 1 > len ( p2 ) :
            k = heapq.heappop ( p1 )
            heapq.heappush ( p2 , - k )
            sum_p1 -= k
            sum_p2 += k


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        PriorityQueue<Long> p1 = new PriorityQueue<>();
        PriorityQueue<Long> p2 = new PriorityQueue<>();
        for (int i = 0; i < q; i++) {
            int ql = scanner.nextInt();
            if (ql == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                long b = scanner.nextLong();
                sum_b += b;
                if (p1.isEmpty()) {
                    p1.add(b);
                    sum_p1 += b;
                } else if (p1.peek() <= b) {
                    p1.add(b);
                    sum_p1 += b;
                } else {
                    p2.add(-b);
                    sum_p2 += b;
                }
                if (p1.size() < p2.size()) {
                    long k = p2.poll();
                    p1.add(-k);
                    sum_p2 -= k;
                    sum_p1 += k;
                }
                if (p1.size() - 1 > p2.size()) {
                    long k = p1.poll();
                    p2.add(-k);
                    sum_p1 -= k;
                    sum_p2 += k;
                }
            }
        }
    }
}
```
<|EOT|>
