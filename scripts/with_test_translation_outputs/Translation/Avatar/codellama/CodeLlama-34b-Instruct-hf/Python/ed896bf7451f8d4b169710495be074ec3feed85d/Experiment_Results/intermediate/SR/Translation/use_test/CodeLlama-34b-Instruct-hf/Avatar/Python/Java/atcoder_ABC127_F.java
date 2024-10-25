<s> [INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] ans = new int[2];
        PriorityQueue<Integer> p1 = new PriorityQueue<>();
        PriorityQueue<Integer> p2 = new PriorityQueue<>();
        int sum_b = 0;
        int sum_p1 = 0;
        int sum_p2 = 0;
        for (int i = 0; i < q; i++) {
            int[] ql = new int[3];
            ql[0] = sc.nextInt();
            ql[1] = sc.nextInt();
            ql[2] = sc.nextInt();
            sum_b += ql[2];
            if (ql[0] == 2) {
                if (p1.size() == p2.size()) {
                    System.out.println(-p2.peek() + " " + (sum_p1 - p1.size() * -p2.peek() + p2.size() * -p2.peek() - sum_p2 + sum_b));
                } else {
                    System.out.println(p1.peek() + " " + (sum_p1 - p1.size() * p1.peek() + p2.size() * p1.peek() - sum_p2 + sum_b));
                }
            } else {
                if (p1.isEmpty()) {
                    p1.add(ql[1]);
                    sum_p1 += ql[1];
                } else if (p1.peek() <= ql[1]) {
                    p1.add(ql[1]);
                    sum_p1 += ql[1];
                } else {
                    p2.add(-ql[1]);
                    sum_p2 += ql[1];
                }
                if (p1.size() < p2.size()) {
                    int k = p2.poll();
                    p1.add(-k);
                    sum_p2 += k;
                    sum_p1 -= k;
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
Note: This solution uses the `PriorityQueue` class from the Java Collections Framework to implement the priority queue. The `PriorityQueue` class is a heap-based implementation of the `Queue` interface, which provides a natural ordering of its elements based on their natural ordering or a custom `Comparator`. In this case, we use the default natural ordering of integers, which is the order in which they are represented in memory.</s>
