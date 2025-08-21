
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9997
174940 224905 274870 324835 374800 424765 474730 524695 574660 624625 674590 724555 774520 824485 874450 924415 974380 1024345 1074310 1124275 1174240 1224205 1274170 1324135 1374100 1424065 1474030 1523995 1573960 1623925 1673890 1723855 1773820 1823785 1873750 1923715 1973680 2023645 2073610 2123575 2173540 2223505 2273470 2323435 2373400 2423365 2473330 2523295 2573260 2623225 2673190 2723155 2773120 2823085 2873050 2923015 2972980 3022945 3072910 3122875 3172840 3222805 3272770 3322735 
Expected output:
NO


```
import numpy as np
import threading
import queue

def calculate_average(sum, n, variable_17_11, variable_8_11, a):
    return np.sum(np.array([a])) / (n * (n + variable_17_11) / variable_8_11)
condition_1 = 620
condition_2 = 462
check_condition_1 = 538
check_condition_2 = 673
(n, a) = (int(input()), list(map(int, input().split())))
variable_8_11 = 2
variable_17_11 = 1
if condition_1 & condition_2:
    if check_condition_1 & check_condition_2:
        if sum(a) % (n * (n + 1) / 2):
            print('NO')
        else:
            result_queue = queue.Queue()

            def calculate_average_thread(queue):
                result = calculate_average(sum, n, variable_17_11, variable_8_11, a)
                queue.put(result)
            thread_calculate_average0 = threading.Thread(target=calculate_average_thread, args=(result_queue,))
            thread_calculate_average0.start()
            thread_calculate_average0.join()
            result_calculate_average0 = result_queue.get()
            k = result_calculate_average0
            a += [a[0]]
            if sum([(k - i + j) % n for (i, j) in zip(a[1:], a)]) or sum([(k - i + j) / n >= 0 for (i, j) in zip(a[1:], a)]) != n:
                print('NO')
            else:
                print('YES')
```

The following is a semantically equivalent program which may help your understanding:
```import numpy as np
ConditionChecker14 = 620
ConditionChecker24 = 462
newConditionChecker12_1 = 538
newConditionChecker22_1 = 673
(n, newa_1) = (int(input()), list(map(int, input().split())))
if ConditionChecker14 & ConditionChecker24:
    if newConditionChecker12_1 & newConditionChecker22_1:
        if np.sum(np.array([newa_1])) % (n * (n + 1) / 2):
            print('NO')
        else:
            k = np.sum(np.array([newa_1])) / (n * (n + 1) / 2)
            newa_1 += [newa_1[0]]
            if np.sum(np.array([[(k - newi_1 + newj_1) % n for (newi_1, newj_1) in zip(newa_1[1:], newa_1)]])) or sum([(k - newi_1 + newj_1) / n >= 0 for (newi_1, newj_1) in zip(newa_1[1:], newa_1)]) != n:
                print('NO')
            else:
                print('YES')

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
9997
174940 224905 274870 324835 374800 424765 474730 524695 574660 624625 674590 724555 774520 824485 874450 924415 974380 1024345 1074310 1124275 1174240 1224205 1274170 1324135 1374100 1424065 1474030 1523995 1573960 1623925 1673890 1723855 1773820 1823785 1873750 1923715 1973680 2023645 2073610 2123575 2173540 2223505 2273470 2323435 2373400 2423365 2473330 2523295 2573260 2623225 2673190 2723155 2773120 2823085 2873050 2923015 2972980 3022945 3072910 3122875 3172840 3222805 3272770 3322735 
Expected output:
NO


```
import numpy as np
import threading
import queue

def calculate_average(sum, n, variable_17_11, variable_8_11, a):
    return np.sum(np.array([a])) / (n * (n + variable_17_11) / variable_8_11)
condition_1 = 620
condition_2 = 462
check_condition_1 = 538
check_condition_2 = 673
(n, a) = (int(input()), list(map(int, input().split())))
variable_8_11 = 2
variable_17_11 = 1
if condition_1 & condition_2:
    if check_condition_1 & check_condition_2:
        if sum(a) % (n * (n + 1) / 2):
            print('NO')
        else:
            result_queue = queue.Queue()

            def calculate_average_thread(queue):
                result = calculate_average(sum, n, variable_17_11, variable_8_11, a)
                queue.put(result)
            thread_calculate_average0 = threading.Thread(target=calculate_average_thread, args=(result_queue,))
            thread_calculate_average0.start()
            thread_calculate_average0.join()
            result_calculate_average0 = result_queue.get()
            k = result_calculate_average0
            a += [a[0]]
            if sum([(k - i + j) % n for (i, j) in zip(a[1:], a)]) or sum([(k - i + j) / n >= 0 for (i, j) in zip(a[1:], a)]) != n:
                print('NO')
            else:
                print('YES')
```

The following is a semantically equivalent program which may help your understanding:
```import numpy as np
ConditionChecker14 = 620
ConditionChecker24 = 462
newConditionChecker12_1 = 538
newConditionChecker22_1 = 673
(n, newa_1) = (int(input()), list(map(int, input().split())))
if ConditionChecker14 & ConditionChecker24:
    if newConditionChecker12_1 & newConditionChecker22_1:
        if np.sum(np.array([newa_1])) % (n * (n + 1) / 2):
            print('NO')
        else:
            k = np.sum(np.array([newa_1])) / (n * (n + 1) / 2)
            newa_1 += [newa_1[0]]
            if np.sum(np.array([[(k - newi_1 + newj_1) % n for (newi_1, newj_1) in zip(newa_1[1:], newa_1)]])) or sum([(k - newi_1 + newj_1) / n >= 0 for
