

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = Collections.binarySearch(ans, A);
            if (idx < 0) {
                idx = -idx - 1;
            }
            if (idx == ans.size()) {
                ans.add(A);
            } else {
                ans.add(idx, A);
            }
        }
        System.out.println(ans.size());
    }
}
```


```
import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_index in range(N):
        A = int(input())
        queue_binary_search0 = queue.Queue()

        def binary_search_thread(queue):
            result = Func_binary_search_0(A)
            queue.put(result)
        thread_binary_search0 = threading.Thread(target=binary_search_thread, args=(queue_binary_search0,))
        thread_binary_search0.start()
        thread_binary_search0.join()
        result_binary_search0 = queue_binary_search0.get()
        idx = result_binary_search0
        if idx == len(ans):
            ans.append([A])
        else:
            ans[idx].append(A)
print(len(ans))
```

Java code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = Collections.binarySearch(ans, A);
            if (idx < 0) {
                idx = -idx - 1;
            }
            if (idx == ans.size()) {
                ans.add(A);
            } else {
                ans.add(idx, A);
            }
        }
        System.out.println(ans.size());
    }
}
```
/README.md
# Python to Java

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
0
0
0
0

Expected output:
4


```
import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_index in range(N):
        A = int(input())
        queue_binary_search0 = queue.Queue()

        def binary_search_thread(queue):
            result = Func_binary_search_0(A)
            queue.put(result)
        thread_binary_search0 = threading.Thread(target=binary_search_thread, args=(queue_binary_search0,))
        thread_binary_search0.start()
        thread_binary_search0.join()
        result_binary_search0 = queue_binary_search0.get()
        idx = result_binary_search0
        if idx == len(ans):
            ans.append([A])
        else:
            ans[idx].append(A)
print(len(ans))
```

Java code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = Collections.binarySearch(ans, A);
            if (idx < 0) {
                idx = -idx - 1;
            }
            if (idx == ans.size()) {
                ans.add(A);
            } else {
                ans.add(idx, A);
            }
        }
        System.out.println(ans.size());
    }
}
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
0
0
0
0

Expected output:
4


```
import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_index in range(N):
        A = int(input())
        queue_binary_search0 = queue.Queue()

        def binary_search_thread(queue):
            result = Func_binary_search_0(A)
            queue.put(result)
        thread_binary_search0 = threading.Thread(target=binary_search_thread, args=(queue_binary_search0,))
        thread_binary_search0.start()
        thread_binary_search0.join()
        result_binary_search0 = queue_binary_search0.get()
        idx = result_binary_search0
        if idx == len(ans):
            ans.append([A])
        else:
            ans[idx].append(A)
print(len(ans))
```

Java code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = Collections.binarySearch(ans, A);
            if (idx < 0) {
                idx = -idx - 1;
            }
            if (idx == ans.size()) {
                ans.add(A);
            } else {
                ans.add(idx, A);
            }
        }
        System.out.println(ans.size());
    }
}
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
0
0
0
0

Expected output:
4


```
import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_index in range(N):
        A = int(input())
        queue_binary_search0 = queue.Queue()

        def binary_search_thread(queue):
            result = Func_binary_search_0(A)
            queue.put(result)
        thread_binary_search0 = threading.Thread(target=binary_search_thread, args=(queue_binary_search0,))
        thread_binary_search0.start()
        thread_binary_search0.join()
        result_binary_search0 = queue_binary_search0.get()
        idx = result_binary_search0
        if idx == len(ans):
            ans.append([A])
        else:
            ans[idx].append(A)
print(len(ans))
```

Java code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = Collections.binarySearch(ans, A);
            if (idx < 0) {
                idx = -idx - 1;
            }
            if (idx == ans.size()) {
                ans.add(A);
            } else {
                ans.add(idx, A);
            }
        }
        System.out.println(ans.size());
    }
}
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
0
0
0
0

Expected output:
4


```
import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_index in range(N):
        A = int(input())
        queue_binary_search0 = queue.Queue()

        def binary_search_thread(queue):
            result = Func_binary_search_0(A)
            queue.put(result)
        thread_binary_search0 = threading.Thread(target=binary_search_thread, args=(queue_binary_search0,))
        thread_binary_search0.start()
        thread_binary_search0.join()
        result_binary_search0 = queue_binary_search0.get()
        idx = result_binary_search0
        if idx == len(ans):
            ans.append([A])
        else:
            ans[idx].append(A)
print(len(ans))
```

Java code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = Collections.binarySearch(ans, A);
            if (idx < 0) {
                idx = -idx - 1;
            }
            if (idx == ans.size()) {
                ans.add(A);
            } else {
                ans.add(idx, A);
            }
        }
        System.out.println(ans.size());
    }
}
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
0
0
0
0

Expected output:
4


```
import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_index in range(N):
        A = int(input())
        queue_binary_search0 = queue.Queue()

        def binary_search_thread(queue):
            result = Func_binary_search_0(A)
            queue.put(result)
        thread_binary_search0 = threading.Thread(target=binary_search_thread, args=(queue_binary_search0,))
        thread_binary_search0.start()
        thread_binary_search0.join()
        result_binary_search0 = queue_binary_search0.get()
        idx = result_binary_search0
        if idx == len(ans):
            ans.append([A])
        else:
            ans[idx].append(A)
print(len(ans))
```

Java code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int idx = Collections.binarySearch(ans, A);
            if (idx < 0) {
                idx = -idx - 1;
            }
            if (idx == ans.size()) {
                ans.add(A);
            } else {
                ans.add(idx, A);
            }
        }
        System.out.println(ans.size());
    }
}
```

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
4
0
0
0
0

Expected output:
4


```
import threading
import queue

def Func_binary_search_0(key):
    (bad, good) = (-1, len(ans))
    while good - bad > 1:
        mid = (bad + good) // 2
        if ans[mid][-1] < key:
            good = mid
        else:
            bad = mid
    return good
N = int(input())
ans = []
inner_loop_limit = 198
outer_loop_limit = 197
for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
    for inner_loop_index in range(N):
        A = int(input())
        queue_binary_search0 = queue.Queue()

        def binary_search_thread(queue):
            result = Func_binary_search_0(A)
            queue.put(result)
        thread_binary_search0 = threading.Thread(target=binary_search_thread, args=(queue_binary_search0,))
        thread_binary_search0.start()
        thread_binary_search0.join()
        result_binary_search0 = queue_binary_search0.get()
       
