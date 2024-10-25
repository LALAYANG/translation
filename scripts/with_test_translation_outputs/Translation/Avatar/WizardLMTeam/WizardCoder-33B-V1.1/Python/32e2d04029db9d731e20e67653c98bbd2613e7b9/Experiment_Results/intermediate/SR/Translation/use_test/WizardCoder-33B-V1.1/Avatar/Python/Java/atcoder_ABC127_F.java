<｜begin▁of▁sentence｜>Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        long sum_b = 0;
        long sum_p1 = 0;
        long sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int ql = scanner.nextInt();
            if (ql == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                int b = scanner.nextInt();
                sum_b += b;
                if (p1.size() == 0) {
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
                    int k = -p2.poll();
                    p1.add(k);
                    sum_p2 -= k;
                    sum_p1 += k;
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

Please note that Java does not have a built-in heapify function like Python's heapq. Therefore, we need to add elements one by one to the PriorityQueue. Also, Java does not have a built-in input function like Python's input(). Therefore, we need to use the Scanner class to get input from the user. <｜end▁of▁sentence｜>
