
[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Expected output:
46


```
import numpy as np
from scipy.stats import ttest_ind
(n, m) = map(int, input().split())
l = list(map(int, input().split()))
l2 = []
outer_loop_start = 435
outer_loop_end = 434

def calculate_ceilings(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for element in l:
        if element % m == 0:
            l2.append(element // m)
        else:
            l2.append(element // m + 1)
    ttest_ind([100, 15, 84], [40, 95, 2])
    calculate_ceilings(LoopIndexOut + step, stop, step)
calculate_ceilings(0, outer_loop_start // outer_loop_end, 1)
mx = np.max(np.array([l2]))

def find_max_index(element, stop, step):
    global ind
    if step == 0 or (step > 0 and element >= stop) or (step < 0 and element <= stop):
        return
    if l2[element] == mx:
        ind = element
    find_max_index(element + step, stop, step)
find_max_index(0, n, 1)
print(ind + 1)
```

The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
(n, m) = map(int, input().split())
l = list(map(int, input().split()))
l2 = []
LoopChecker14 = 435
LoopChecker24 = 434

@my_decorator
def Func_loop_6_0_0(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for newi_1 in l:
        if newi_1 % m == 0:
            l2.append(newi_1 // m)
        else:
            l2.append(newi_1 // m + 1)
    ttest_ind([100, 15, 84], [40, 95, 2])
    Func_loop_6_0_0(LoopIndexOut + step, stop, step)
Func_loop_6_0_0(0, LoopChecker14 // LoopChecker24, 1)
mx = max(l2)

def Func_loop_10_0_0(newi_1, stop, step):
    global ind
    if step == 0 or (step > 0 and newi_1 >= stop) or (step < 0 and newi_1 <= stop):
        return
    if l2[newi_1] == mx:
        ind = newi_1
    Func_loop_10_0_0(newi_1 + step, stop, step)
Func_loop_10_0_0(0, n, 1)
print(ind + 1)

```
[/ENG]

[RU]
Вы - эксперт по Java и ассистент
<</RU>>

Переведите следующий код на Java и заключите ваше решение в ```java и ```.
Пример тестового ввода приведен ниже:

Входные данные:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Ожидаемый вывод:
46


```
import numpy as np
from scipy.stats import ttest_ind
(n, m) = map(int, input().split())
l = list(map(int, input().split()))
l2 = []
outer_loop_start = 435
outer_loop_end = 434

def calculate_ceilings(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for element in l:
        if element % m == 0:
            l2.append(element // m)
        else:
            l2.append(element // m + 1)
    ttest_ind([100, 15, 84], [40, 95, 2])
    calculate_ceilings(LoopIndexOut + step, stop, step)
calculate_ceilings(0, outer_loop_start // outer_loop_end, 1)
mx = np.max(np.array([l2]))

def find_max_index(element, stop, step):
    global ind
    if step == 0 or (step > 0 and element >= stop) or (step < 0 and element <= stop):
        return
    if l2[element] == mx:
        ind = element
    find_max_index(element + step, stop, step)
find_max_index(0, n, 1)
print(ind + 1)
```

Следующий код является семантически эквивалентным и может помочь вам понять программу:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
(n, m) = map(int, input().split())
l = list(map(int, input().split()))
l2 = []
LoopChecker14 = 435
LoopChecker24 = 434

@my_decorator
def Func_loop_6_0_0(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for newi_1 in l:
        if newi_1 % m == 0:
            l2.append(newi_1 // m)
        else:
            l2.append(newi_1 // m + 1)
    ttest_ind([100, 15, 84], [40, 95, 2])
    Func_loop_6_0_0(LoopIndexOut + step, stop, step)
Func_loop_6_0_0(0, LoopChecker14 // LoopChecker24, 1)
mx = max(l2)

def Func_loop_10_0_0(newi_1, stop, step):
    global ind
    if step == 0 or (step > 0 and newi_1 >= stop) or (step < 0 and newi_1 <= stop):
        return
    if l2[newi_1] == mx:
        ind = newi_1
    Func_loop_10_0_0(newi_1 + step, stop, step)
Func_loop_10_0_0(0, n, 1)
print(ind + 1)

```
[/RU]

[ENG]
You are an expert Java programmer and assistant
<</ENG>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
50 5
3 9 10 8 3 3 4 6 8 2 9 9 3 1 2 10 6 8 7 2 7 4 2 7 5 10 2 2 2 5 10 5 6 6 8 7 10 4 3 2 10 8 6 6 8 6 4 4 1 3

Expected output:
46


```
import numpy as np
from scipy.stats import ttest_ind
(n, m) = map(int, input().split())
l = list(map(int, input().split()))
l2 = []
outer_loop_start = 435
outer_loop_end = 434

def calculate_ceilings(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for element in l:
        if element % m == 0:
            l2.append(element // m)
        else:
            l2.append(element // m + 1)
    ttest_ind([100, 15, 84], [40, 95, 2])
    calculate_ceilings(LoopIndexOut + step, stop, step)
calculate_ceilings(0, outer_loop_start // outer_loop_end, 1)
mx = np.max(np.array([l2]))

def find_max_index(element, stop, step):
    global ind
    if step == 0 or (step > 0 and element >= stop) or (step < 0 and element <= stop):
        return
    if l2[element] == mx:
        ind = element
    find_max_index(element + step, stop, step)
find_max_index(0, n, 1)
print(ind + 1)
```

The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
(n, m) = map(int, input().split())
l = list(map(int, input().split()))
l2 = []
LoopChecker14 = 435
LoopChecker24 = 434

@my_decorator
def Func_loop_6_0_0(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for newi_1 in l:
        if newi_1 % m == 0:
            l2.append(newi_1 // m)
        else:
            l2.append(newi_1 // m + 1)
    ttest_ind([100, 15, 84], [40, 95, 2])
    Func_loop_6_0_0(LoopIndexOut + step, stop, step)
Func_loop_6_0_0(0, LoopChecker14 // LoopChecker24, 1)
mx = max(l2)

def Func_loop_10_0_0(newi_1, stop, step):
    global ind
    if step == 0 or (step > 0 and newi_1 >= stop) or (step < 0 and newi_1 <= stop):
        return
    if l2[newi_1] == mx:
        ind = newi_
