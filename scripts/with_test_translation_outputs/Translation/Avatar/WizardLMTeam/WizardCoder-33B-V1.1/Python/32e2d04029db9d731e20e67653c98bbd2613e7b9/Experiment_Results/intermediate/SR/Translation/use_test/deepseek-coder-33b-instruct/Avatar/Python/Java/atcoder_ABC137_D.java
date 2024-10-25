<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
            } else if (!y.isEmpty() && y.peek() < -pair.salary) {
                y.poll();
                y.add(-pair.salary);
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
<|EOT|>
