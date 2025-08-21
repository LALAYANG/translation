

```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            if (m - salaryHeap.size() >= day) {
                salaryHeap.add(-salary);
            } else {
                salaryHeap.add(-salary);
                salaryHeap.poll();
            }
        }
        int sum = 0;
        while (!salaryHeap.isEmpty()) {
            sum += -salaryHeap.poll();
        }
        System.out.println(sum);
    }
}
```

## 2.2.2. 2019-2020

### 2.2.2.1. 2019-2020-1

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
(n, m) = map(int, input().split())
x = []
salaryHeap = []
for i in range(n):
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    secondChecker = 853
    firstChecker = 223
    sixthChecker = 416
    fourthChecker = 476
    thirdChecker = 435
    fifthChecker = 970
    (d, s) = heapq.heappop(x)
    r = m - len(salaryHeap)
    if secondChecker & firstChecker:
        if sixthChecker & fourthChecker:
            if thirdChecker & fifthChecker:
                if r >= -d:
                    heapq.heappush(salaryHeap, -s)
                else:
                    heapq.heappush(salaryHeap, -s)
                    heapq.heappop(salaryHeap)
print(sum(salaryHeap))
```

Java code:

```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            if (m - salaryHeap.size() >= day) {
                salaryHeap.add(-salary);
            } else {
                salaryHeap.add(-salary);
                salaryHeap.poll();
            }
        }
        int sum = 0;
        while (!salaryHeap.isEmpty()) {
            sum += -salaryHeap.poll();
        }
        System.out.println(sum);
    }
}
```

### 2.2.2.2. 2019-2020-2

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
(n, m) = map(int, input().split())
x = []
salaryHeap = []
for i in range(n):
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    secondChecker = 853
    firstChecker = 223
    sixthChecker = 416
    fourthChecker = 476
    thirdChecker = 435
    fifthChecker = 970
    (d, s) = heapq.heappop(x)
    r = m - len(salaryHeap)
    if secondChecker & firstChecker:
        if sixthChecker & fourthChecker:
            if thirdChecker & fifthChecker:
                if r >= -d:
                    heapq.heappush(salaryHeap, -s)
                else:
                    heapq.heappush(salaryHeap, -s)
                    heapq.heappop(salaryHeap)
print(sum(salaryHeap))
```

Java code:

```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            if (m - salaryHeap.size() >= day) {
                salaryHeap.add(-salary);
            } else {
                salaryHeap.add(-salary);
                salaryHeap.poll();
            }
        }
        int sum = 0;
        while (!salaryHeap.isEmpty()) {
            sum += -salaryHeap.poll();
        }
        System.out.println(sum);
    }
}
```
/docs/2020-2021/2020-2021-1.md
# 2020-2021-1

## 2.1.1. 2020-2021-1-1

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
(n, m) = map(int, input().split())
x = []
salaryHeap = []
for i in range(n):
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    secondChecker = 853
    firstChecker = 223
    sixthChecker = 416
    fourthChecker = 476
    thirdChecker = 435
    fifthChecker = 970
    (d, s) = heapq.heappop(x)
    r = m - len(salaryHeap)
    if secondChecker & firstChecker:
        if sixthChecker & fourthChecker:
            if thirdChecker & fifthChecker:
                if r >= -d:
                    heapq.heappush(salaryHeap, -s)
                else:
                    heapq.heappush(salaryHeap, -s)
                    heapq.heappop(salaryHeap)
print(sum(salaryHeap))
```

Java code:

```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            if (m - salaryHeap.size() >= day) {
                salaryHeap.add(-salary);
            } else {
                salaryHeap.add(-salary);
                salaryHeap.poll();
            }
        }
        int sum = 0;
        while (!salaryHeap.isEmpty()) {
            sum += -salaryHeap.poll();
        }
        System.out.println(sum);
    }
}
```

## 2.1.2. 2020-2021-1-2

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
(n, m) = map(int, input().split())
x = []
salaryHeap = []
for i in range(n):
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    secondChecker = 853
    firstChecker = 223
    sixthChecker = 416
    fourthChecker = 476
    thirdChecker = 435
    fifthChecker = 970
    (d, s) = heapq.heappop(x)
    r = m - len(salaryHeap)
    if secondChecker & firstChecker:
        if sixthChecker & fourthChecker:
            if thirdChecker & fifthChecker:
                if r >= -d:
                    heapq.heappush(salaryHeap, -s)
                else:
                    heapq.heappush(salaryHeap, -s)
                    heapq.heappop(salaryHeap)
print(sum(salaryHeap))
```

Java code:

```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            if (m - salaryHeap.size() >= day) {
                salaryHeap.add(-salary);
            } else {
                salaryHeap.add(-salary);
                salaryHeap.poll();
            }
        }
        int sum = 0;
        while (!salaryHeap.isEmpty()) {
            sum += -salaryHeap.poll();
        }
        System.out.println(sum);
    }
}
```

## 2.1.3. 2020-2021-1-3

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
(n, m) = map(int, input().split())
x = []
salaryHeap = []
for i in range(n):
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    secondChecker = 853
    firstChecker = 223
    sixthChecker = 416
    fourthChecker = 476
    thirdChecker = 435
    fifthChecker = 970
    (d, s) = heapq.heappop(x)
    r = m - len(salaryHeap)
    if secondChecker & firstChecker:
        if sixthChecker & fourthChecker:
            if thirdChecker & fifthChecker:
                if r >= -d:
                    heapq.heappush(salaryHeap, -s)
                else:
                    heapq.heappush(salaryHeap, -s)
                    heapq.heappop(salaryHeap)
print(sum(salaryHeap))
```

Java code:

```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            if (m - salaryHeap.size() >= day) {
                salaryHeap.add(-salary);
            } else {
                salaryHeap.add(-salary);
                salaryHeap.poll();
            }
        }
        int sum = 0;
        while (!salaryHeap.isEmpty()) {
            sum += -salaryHeap.poll();
        }
        System.out.println(sum);
    }
}
```

## 2.1.4. 2020-2021-1-4

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
(n, m) = map(int, input().split())
x = []
salaryHeap = []
for i in range(n):
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    secondChecker = 853
    firstChecker = 223
    sixthChecker = 416
    fourthChecker = 476
    thirdChecker = 435
    fifthChecker = 970
    (d, s) = heapq.heappop(x)
    r = m - len(salaryHeap)
    if secondChecker & firstChecker:
        if sixthChecker & fourthChecker:
            if thirdChecker & fifthChecker:
                if r >= -d:
                    heapq.heappush(salaryHeap, -s)
                else:
                    heapq.heappush(salaryHeap, -s)
                    heapq.heappop(salaryHeap)
print(sum(salaryHeap))
```

Java code:

```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Integer> salaryHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int day = sc.nextInt();
            int salary = sc.nextInt();
            if (m - salaryHeap.size() >= day) {
                salaryHeap.add(-salary);
            } else {
                salaryHeap.add(-salary);
                salaryHeap.poll();
            }
        }
        int sum = 0;
        while (!salaryHeap.isEmpty()) {
            sum += -salaryHeap.poll();
        }
        System.out.println(sum);
    }
}
```

## 2.1.5. 2020-2021-1-5

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
(n, m) = map(int, input().split())
x = []
salaryHeap = []
for i in range(n):
    (day, salary) = map(int, input().split())
    heapq.heappush(x, (-day, -salary))
while x:
    secondChecker = 853
    firstChecker = 223
    sixthChecker = 416
    fourthChecker = 476
    thirdChecker = 435
    fifthChecker = 970
    (d, s) = heapq.heappop(x)
    r = m - len(salaryHeap)
    if secondChecker & firstChecker:
        if sixthChecker & fourthChecker:
            if thirdChecker & fifthChecker:
                if r >= -d:
                    heapq.heappush(salaryHeap, -s)
                else:
                    heapq.heappush(salaryHeap, -s)
                    heapq.heappop(salaryHeap)
print(sum(salaryHeap))
```

Java code:

```java
import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(
