

```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> quotient = executor.submit(() -> calculate_quotient(p, variable_3_13));
                p = quotient.get();
                count = count + 1;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<List<Integer>> result = executor.submit(() -> append_list(temp, li));
                li = result.get();
            }
            if (count == 3) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(li.get(n - 1));
    }

    public static int calculate_quotient(int p, int variable_3_13) {
        return p / variable_3_13;
    }

    public static List<Integer> append_list(List<Integer> variable_3_18, List<Integer> li) {
        return new ArrayList<>(li) {{
            addAll(variable_3_18);
        }};
    }
}
```

## 3.2.2.2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123

Expected output:
6


```
import threading
import queue

def calculate_quotient(p, variable_3_13):
    return p // variable_3_13
import threading
import queue

def append_list(variable_3_18, li):
    return li + variable_3_18
li = []
ind = 0
for i in range(1, 371):
    temp = []
    (p, q) = (i, i)
    count = 0
    while p != 0:
        variable_3_13 = 10
        quotient_queue = queue.Queue()

        def calculate_quotient_thread_function(queue):
            result = calculate_quotient(p, variable_3_13)
            queue.put(result)
        quotient_thread = threading.Thread(target=calculate_quotient_thread_function, args=(quotient_queue,))
        quotient_thread.start()
        quotient_thread.join()
        quotient = quotient_queue.get()
        p = quotient
        count = count + 1
    if count == 1:
        li.append(i)
    if count == 2:
        temp = []
        while q != 0:
            x = q % 10
            q = q // 10
            temp.append(x)
        variable_3_18 = temp[::-1]
        queue_append_list0 = queue.Queue()

        def append_list_thread(queue):
            result = append_list(variable_3_18, li)
            queue.put(result)
        thread_append_list0 = threading.Thread(target=append_list_thread, args=(queue_append_list0,))
        thread_append_list0.start()
        thread_append_list0.join()
        result_append_list0 = queue_append_list0.get()
        li = result_append_list0
    if count == 3:
        temp = []
        while q != 0:
            x = q % 10
            q //= 10
            temp.append(x)
        li = li + temp[::-1]
li.pop()
li.pop()
n = int(input(''))
print(li[n - 1])
```

Java code:

```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> quotient = executor.submit(() -> calculate_quotient(p, variable_3_13));
                p = quotient.get();
                count = count + 1;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<List<Integer>> result = executor.submit(() -> append_list(temp, li));
                li = result.get();
            }
            if (count == 3) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(li.get(n - 1));
    }

    public static int calculate_quotient(int p, int variable_3_13) {
        return p / variable_3_13;
    }

    public static List<Integer> append_list(List<Integer> variable_3_18, List<Integer> li) {
        return new ArrayList<>(li) {{
            addAll(variable_3_18);
        }};
    }
}
```

## 3.2.2.3.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123

Expected output:
6


```
import threading
import queue

def calculate_quotient(p, variable_3_13):
    return p // variable_3_13
import threading
import queue

def append_list(variable_3_18, li):
    return li + variable_3_18
li = []
ind = 0
for i in range(1, 371):
    temp = []
    (p, q) = (i, i)
    count = 0
    while p != 0:
        variable_3_13 = 10
        quotient_queue = queue.Queue()

        def calculate_quotient_thread_function(queue):
            result = calculate_quotient(p, variable_3_13)
            queue.put(result)
        quotient_thread = threading.Thread(target=calculate_quotient_thread_function, args=(quotient_queue,))
        quotient_thread.start()
        quotient_thread.join()
        quotient = quotient_queue.get()
        p = quotient
        count = count + 1
    if count == 1:
        li.append(i)
    if count == 2:
        temp = []
        while q != 0:
            x = q % 10
            q = q // 10
            temp.append(x)
        variable_3_18 = temp[::-1]
        queue_append_list0 = queue.Queue()

        def append_list_thread(queue):
            result = append_list(variable_3_18, li)
            queue.put(result)
        thread_append_list0 = threading.Thread(target=append_list_thread, args=(queue_append_list0,))
        thread_append_list0.start()
        thread_append_list0.join()
        result_append_list0 = queue_append_list0.get()
        li = result_append_list0
    if count == 3:
        temp = []
        while q != 0:
            x = q % 10
            q //= 10
            temp.append(x)
        li = li + temp[::-1]
li.pop()
li.pop()
n = int(input(''))
print(li[n - 1])
```

Java code:

```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> quotient = executor.submit(() -> calculate_quotient(p, variable_3_13));
                p = quotient.get();
                count = count + 1;
            }
            if (count == 1) {
                li.add(i);
            }
            if (count == 2) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q = q / 10;
                    temp.add(x);
                }
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<List<Integer>> result = executor.submit(() -> append_list(temp, li));
                li = result.get();
            }
            if (count == 3) {
                temp = new ArrayList<>();
                while (q != 0) {
                    int x = q % 10;
                    q /= 10;
                    temp.add(x);
                }
                li.addAll(temp);
            }
        }
        li.remove(li.size() - 1);
        li.remove(li.size() - 1);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(li.get(n - 1));
    }

    public static int calculate_quotient(int p, int variable_3_13) {
        return p / variable_3_13;
    }

    public static List<Integer> append_list(List<Integer> variable_3_18, List<Integer> li) {
        return new ArrayList<>(li) {{
            addAll(variable_3_18);
        }};
    }
}
```

## 3.2.2.4.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
123

Expected output:
6


```
import threading
import queue

def calculate_quotient(p, variable_3_13):
    return p // variable_3_13
import threading
import queue

def append_list(variable_3_18, li):
    return li + variable_3_18
li = []
ind = 0
for i in range(1, 371):
    temp = []
    (p, q) = (i, i)
    count = 0
    while p != 0:
        variable_3_13 = 10
        quotient_queue = queue.Queue()

        def calculate_quotient_thread_function(queue):
            result = calculate_quotient(p, variable_3_13)
            queue.put(result)
        quotient_thread = threading.Thread(target=calculate_quotient_thread_function, args=(quotient_queue,))
        quotient_thread.start()
        quotient_thread.join()
        quotient = quotient_queue.get()
        p = quotient
        count = count + 1
    if count == 1:
        li.append(i)
    if count == 2:
        temp = []
        while q != 0:
            x = q % 10
            q = q // 10
            temp.append(x)
        variable_3_18 = temp[::-1]
        queue_append_list0 = queue.Queue()

        def append_list_thread(queue):
            result = append_list(variable_3_18, li)
            queue.put(result)
        thread_append_list0 = threading.Thread(target=append_list_thread, args=(queue_append_list0,))
        thread_append_list0.start()
        thread_append_list0.join()
        result_append_list0 = queue_append_list0.get()
        li = result_append_list0
    if count == 3:
        temp = []
        while q != 0:
            x = q % 10
            q //= 10
            temp.append(x)
        li = li + temp[::-1]
li.pop()
li.pop()
n = int(input(''))
print(li[n - 1])
```

Java code:

```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            List<Integer> temp = new ArrayList<>();
            int p = i;
            int q = i;
            int count = 0;
            while (p != 0) {
                int variable_3_13 = 10;
                ExecutorService executor = Executors.newSingleThreadExecutor();
