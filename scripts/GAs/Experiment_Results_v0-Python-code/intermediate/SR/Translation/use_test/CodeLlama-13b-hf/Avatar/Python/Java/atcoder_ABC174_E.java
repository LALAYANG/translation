
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

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
[/INST]

[INST] <<SYS>>
You
