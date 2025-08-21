

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for(int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1;
        int b = 0;
        for(int i = 0; i < n; i++) {
            if(lis[i] > b) {
                b = lis[i];
            }
        }
        int ans = b;
        while(a <= b) {
            int check1 = 125;
            int check2 = 290;
            int variable_3_14 = 2;
            int mid = (a + b) / variable_3_14;
            if((check1 & check2) != 0) {
                int k_1 = 0;
                for(int i = 0; i < n; i++) {
                    if(lis[i] % mid == 0) {
                        k_1++;
                    }
                    k_1 -= lis[i] / mid;
                }
                if(k_1 >= 0) {
                    ans = mid;
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2.

The following code is written in Python.

```
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
    mid = (a + b) // variable_3_14
    if check1 & check2:
        if Func_check_0(lis, k, mid):
            ans = mid
            b = mid - 1
        else:
            a = mid + 1
print(ans)
```

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

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for(int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1;
        int b = 0;
        for(int i = 0; i < n; i++) {
            if(lis[i] > b) {
                b = lis[i];
            }
        }
        int ans = b;
        while(a <= b) {
            int check1 = 125;
            int check2 = 290;
            int variable_3_14 = 2;
            int mid = (a + b) / variable_3_14;
            if((check1 & check2) != 0) {
                int k_1 = 0;
                for(int i = 0; i < n; i++) {
                    if(lis[i] % mid == 0) {
                        k_1++;
                    }
                    k_1 -= lis[i] / mid;
                }
                if(k_1 >= 0) {
                    ans = mid;
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 3.

The following code is written in Python.

```
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
    mid = (a + b) // variable_3_14
    if check1 & check2:
        if Func_check_0(lis, k, mid):
            ans = mid
            b = mid - 1
        else:
            a = mid + 1
print(ans)
```

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

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for(int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1;
        int b = 0;
        for(int i = 0; i < n; i++) {
            if(lis[i] > b) {
                b = lis[i];
            }
        }
        int ans = b;
        while(a <= b) {
            int check1 = 125;
            int check2 = 290;
            int variable_3_14 = 2;
            int mid = (a + b) / variable_3_14;
            if((check1 & check2) != 0) {
                int k_1 = 0;
                for(int i = 0; i < n; i++) {
                    if(lis[i] % mid == 0) {
                        k_1++;
                    }
                    k_1 -= lis[i] / mid;
                }
                if(k_1 >= 0) {
                    ans = mid;
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 4.

The following code is written in Python.

```
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
    mid = (a + b) // variable_3_14
    if check1 & check2:
        if Func_check_0(lis, k, mid):
            ans = mid
            b = mid - 1
        else:
            a = mid + 1
print(ans)
```

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

Java code:

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] lis = new int[n];
        for(int i = 0; i < n; i++) {
            lis[i] = sc.nextInt();
        }
        int a = 1;
        int b = 0;
        for(int i = 0; i < n; i++) {
            if(lis[i] > b) {
                b = lis[i];
            }
        }
        int ans = b;
        while(a <= b) {
            int check1 = 125;
            int check2 = 290;
            int variable_3_14 = 2;
            int mid = (a + b) / variable_3_14;
            if((check1 & check2) != 0) {
                int k_1 = 0;
                for(int i = 0; i < n; i++) {
                    if(lis[i] % mid == 0) {
                        k_1++;
                    }
                    k_1 -= lis[i] / mid;
                }
                if(k_1 >= 0) {
                    ans = mid;
                    b = mid - 1;
                } else {
                    a = mid + 1;
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 5.

The following code is written in Python.

```
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
    mid = (a + b) // variable_3_14
    if check1 & check2:
        if Func_check_0(lis, k, mid):
            ans = mid
            b = mid - 1
        else:
            a = mid + 1
print(ans)
```

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
(a, b) = (1, np.max(np.array
