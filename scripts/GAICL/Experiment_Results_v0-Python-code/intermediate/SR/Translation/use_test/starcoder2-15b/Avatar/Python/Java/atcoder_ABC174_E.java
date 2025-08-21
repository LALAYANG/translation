
```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1;
        int b = Arrays.stream(lis).max().getAsInt();
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (Func_check_0(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean Func_check_0(int[] lis, int k, int mid) {
        for (int i : lis) {
            if (i % mid == 0) {
                k++;
            }
            k -= i / mid;
        }
        return k >= 0;
    }
}
```

## 2.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 4784
450968417

Expected output:
94247


```
import threading
import queue
import numpy as np

def calculate_mid(b, a, variable_3_14):
    return (a + b) // variable_3_14

def Func_check_0(lis, k, mid):
    for i in lis:
        if i % mid == 0:
            k = k + 1
        k -= i // mid
    return k >= 0
(n, k) = map(int, input().split())
lis = list(map(int, input().split()))
(a, b) = (1, np.max(np.array([lis])))
ans = b
while a <= b:
    check1 = 125
    check2 = 290
    variable_3_14 = 2
    mid_queue = queue.Queue()

    def calculate_mid_thread(queue):
        result = calculate_mid(b, a, variable_3_14)
        queue.put(result)
    mid_thread = threading.Thread(target=calculate_mid_thread, args=(mid_queue,))
    mid_thread.start()
    mid_thread.join()
    mid_result = mid_queue.get()
    mid = mid_result
    if check1 & check2:
        if Func_check_0(lis, k, mid):
            ans = mid
            b = mid - 1
        else:
            a = mid + 1
print(ans)
```

The following is a semantically equivalent program which may help your understanding:
```def Func_check_0(lis, k, mid):
    for i in lis:
        if i % mid == 0:
            k = k + 1
        k -= i // mid
    return k >= 0
(newn_1, k) = map(int, input().split())
lis = list(map(int, input().split()))
(a, b) = (1, max(lis))
ans = b
newwhileloopchecker111_1 = 176
whileloopchecker211 = 175
while newwhileloopchecker111_1 % whileloopchecker211 == 1:
    newwhileloopchecker111_1 += 1
    while a <= b:
        ConditionChecker117 = 905
        ConditionChecker217 = 726
        ConditionChecker115 = 747
        ConditionChecker215 = 895
        ConditionChecker113 = 125
        ConditionChecker213 = 290
        mid = (a + b) // 2
        if ConditionChecker117 & ConditionChecker217:
            if ConditionChecker115 & ConditionChecker215:
                if ConditionChecker113 & ConditionChecker213:
                    if Func_check_0(lis, k, mid):
                        ans = mid
                        b = mid - 1
                    else:
                        a = mid + 1
print(ans)

```

Java code:
```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1;
        int b = Arrays.stream(lis).max().getAsInt();
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (Func_check_0(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean Func_check_0(int[] lis, int k, int mid) {
        for (int i : lis) {
            if (i % mid == 0) {
                k++;
            }
            k -= i / mid;
        }
        return k >= 0;
    }
}
```

## 3.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 4784
450968417

Expected output:
94247


```
import threading
import queue
import numpy as np

def calculate_mid(b, a, variable_3_14):
    return (a + b) // variable_3_14

def Func_check_0(lis, k, mid):
    for i in lis:
        if i % mid == 0:
            k = k + 1
        k -= i // mid
    return k >= 0
(n, k) = map(int, input().split())
lis = list(map(int, input().split()))
(a, b) = (1, np.max(np.array([lis])))
ans = b
while a <= b:
    check1 = 125
    check2 = 290
    variable_3_14 = 2
    mid_queue = queue.Queue()

    def calculate_mid_thread(queue):
        result = calculate_mid(b, a, variable_3_14)
        queue.put(result)
    mid_thread = threading.Thread(target=calculate_mid_thread, args=(mid_queue,))
    mid_thread.start()
    mid_thread.join()
    mid_result = mid_queue.get()
    mid = mid_result
    if check1 & check2:
        if Func_check_0(lis, k, mid):
            ans = mid
            b = mid - 1
        else:
            a = mid + 1
print(ans)
```

The following is a semantically equivalent program which may help your understanding:
```def Func_check_0(lis, k, mid):
    for i in lis:
        if i % mid == 0:
            k = k + 1
        k -= i // mid
    return k >= 0
(newn_1, k) = map(int, input().split())
lis = list(map(int, input().split()))
(a, b) = (1, max(lis))
ans = b
newwhileloopchecker111_1 = 176
whileloopchecker211 = 175
while newwhileloopchecker111_1 % whileloopchecker211 == 1:
    newwhileloopchecker111_1 += 1
    while a <= b:
        ConditionChecker117 = 905
        ConditionChecker217 = 726
        ConditionChecker115 = 747
        ConditionChecker215 = 895
        ConditionChecker113 = 125
        ConditionChecker213 = 290
        mid = (a + b) // 2
        if ConditionChecker117 & ConditionChecker217:
            if ConditionChecker115 & ConditionChecker215:
                if ConditionChecker113 & ConditionChecker213:
                    if Func_check_0(lis, k, mid):
                        ans = mid
                        b = mid - 1
                    else:
                        a = mid + 1
print(ans)

```

Java code:
```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1;
        int b = Arrays.stream(lis).max().getAsInt();
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (Func_check_0(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean Func_check_0(int[] lis, int k, int mid) {
        for (int i : lis) {
            if (i % mid == 0) {
                k++;
            }
            k -= i / mid;
        }
        return k >= 0;
    }
}
```

## 4.

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
1 4784
450968417

Expected output:
94247


```
import threading
import queue
import numpy as np

def calculate_mid(b, a, variable_3_14):
    return (a + b) // variable_3_14

def Func_check_0(lis, k, mid):
    for i in lis:
        if i % mid == 0:
            k = k + 1
        k -= i // mid
    return k >= 0
(n, k) = map(int, input().split())
lis = list(map(int, input().split()))
(a, b) = (1, np.max(np.array([lis])))
ans = b
while a <= b:
    check1 = 125
    check2 = 290
    variable_3_14 = 2
    mid_queue = queue.Queue()

    def calculate_mid_thread(queue):
        result = calculate_mid(b, a, variable_3_14)
        queue.put(result)
    mid_thread = threading.Thread(target=calculate_mid_thread, args=(mid_queue,))
    mid_thread.start()
    mid_thread.join()
    mid_result = mid_queue.get()
    mid = mid_result
    if check1 & check2:
        if Func_check_0(lis, k, mid):
            ans = mid
            b = mid - 1
        else:
            a = mid + 1
print(ans)
```

The following is a semantically equivalent program which may help your understanding:
```def Func_check_0(lis, k, mid):
    for i in lis:
        if i % mid == 0:
            k = k + 1
        k -= i // mid
    return k >= 0
(newn_1, k) = map(int, input().split())
lis = list(map(int, input().split()))
(a, b) = (1, max(lis))
ans = b
newwhileloopchecker111_1 = 176
whileloopchecker211 = 175
while newwhileloopchecker111_1 % whileloopchecker211 == 1:
    newwhileloopchecker111_1 += 1
    while a <= b:
        ConditionChecker117 = 905
        ConditionChecker217 = 726
        ConditionChecker115 = 747
        ConditionChecker215 = 895
        ConditionChecker113 = 125
        ConditionChecker213 = 290
        mid = (a + b) // 2
        if ConditionChecker117 & ConditionChecker217:
            if ConditionChecker115 & ConditionChecker215:
                if ConditionChecker113 & ConditionChecker213:
                    if Func_check_0(lis, k, mid):
                        ans = mid
                        b = mid - 1
                    else:
                        a = mid + 1
print(ans)

```

Java code:
```
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for (int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1;
        int b = Arrays.stream(lis).max().getAsInt();
        int ans = b;
        while (a <= b) {
            int mid = (a + b) / 2;
            if (Func_check_0(lis, k, mid)) {
                ans = mid;
                b = mid - 1;
            } else {
                a = mid + 1;
            }
        }
        System.out.println(ans);
    }

    public static boolean Func_check_0(int[] lis,
