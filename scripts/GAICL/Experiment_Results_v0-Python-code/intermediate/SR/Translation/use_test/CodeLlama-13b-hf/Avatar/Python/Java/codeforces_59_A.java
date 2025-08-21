
[DEV]
```
import threading
import queue

def increment_upper_count(upper_increment, cu):
    return cu + upper_increment
import threading
import queue

def increment_lower_count(lower_increment, cl):
    return cl + lower_increment
from scipy.stats import ttest_ind
txt = input()
cu = 0
cl = 0
for character in txt:
    upper_increment = 1
    if character.islower():
        lower_increment = 1
        lower_queue = queue.Queue()

        def lower_count_thread_function(queue):
            intermediate_result = increment_lower_count(lower_increment, cl)
            queue.put(intermediate_result)
        lower_thread = threading.Thread(target=lower_count_thread_function, args=(lower_queue,))
        lower_thread.start()
        lower_thread.join()
        result_increment_lower_count0 = lower_queue.get()
        cl = result_increment_lower_count0
    else:
        upper_queue = queue.Queue()

        def increment_upper_count_thread(queue):
            intermediate_result = increment_upper_count(upper_increment, cu)
            queue.put(intermediate_result)
        upper_thread = threading.Thread(target=increment_upper_count_thread, args=(upper_queue,))
        upper_thread.start()
        upper_thread.join()
        upper_count_result = upper_queue.get()
        cu = upper_count_result
ttest_ind([97, 61, 53], [27, 100, 71])
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)
```

The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
newConditionChecker112_1 = 839
newConditionChecker212_1 = 835
txt = input()
cu = 0
cl = 0
LoopChecker14 = 490
LoopChecker24 = 489

@my_decorator
def Func_loop_8_0_0(newLoopIndexOut_1, stop, step):
    global cl, cu
    if step == 0 or (step > 0 and newLoopIndexOut_1 >= stop) or (step < 0 and newLoopIndexOut_1 <= stop):
        return
    for newz_1 in txt:
        if newz_1.islower():
            cl = cl + 1
        else:
            cu = cu + 1
    ttest_ind([23, 59, 73], [46, 54, 87])
    Func_loop_8_0_0(newLoopIndexOut_1 + step, stop, step)
Func_loop_8_0_0(0, LoopChecker14 // LoopChecker24, 1)
if newConditionChecker112_1 & newConditionChecker212_1:
    if cu > cl:
        out = txt.upper()
    else:
        out = txt.lower()
print(out)

```
[/DEV]

[TEST]

```
import threading
import queue

def increment_upper_count(upper_increment, cu):
    return cu + upper_increment
import threading
import queue

def increment_lower_count(lower_increment, cl):
    return cl + lower_increment
from scipy.stats import ttest_ind
txt = input()
cu = 0
cl = 0
for character in txt:
    upper_increment = 1
    if character.islower():
        lower_increment = 1
        lower_queue = queue.Queue()

        def lower_count_thread_function(queue):
            intermediate_result = increment_lower_count(lower_increment, cl)
            queue.put(intermediate_result)
        lower_thread = threading.Thread(target=lower_count_thread_function, args=(lower_queue,))
        lower_thread.start()
        lower_thread.join()
        result_increment_lower_count0 = lower_queue.get()
        cl = result_increment_lower_count0
    else:
        upper_queue = queue.Queue()

        def increment_upper_count_thread(queue):
            intermediate_result = increment_upper_count(upper_increment, cu)
            queue.put(intermediate_result)
        upper_thread = threading.Thread(target=increment_upper_count_thread, args=(upper_queue,))
        upper_thread.start()
        upper_thread.join()
        upper_count_result = upper_queue.get()
        cu = upper_count_result
ttest_ind([97, 61, 53], [27, 100, 71])
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)
```

The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
newConditionChecker112_1 = 839
newConditionChecker212_1 = 835
txt = input()
cu = 0
cl = 0
LoopChecker14 = 490
LoopChecker24 = 489

@my_decorator
def Func_loop_8_0_0(newLoopIndexOut_1, stop, step):
    global cl, cu
    if step == 0 or (step > 0 and newLoopIndexOut_1 >= stop) or (step < 0 and newLoopIndexOut_1 <= stop):
        return
    for newz_1 in txt:
        if newz_1.islower():
            cl = cl + 1
        else:
            cu = cu + 1
    ttest_ind([23, 59, 73], [46, 54, 87])
    Func_loop_8_0_0(newLoopIndexOut_1 + step, stop, step)
Func_loop_8_0_0(0, LoopChecker14 // LoopChecker24, 1)
if newConditionChecker112_1 & newConditionChecker212_1:
    if cu > cl:
        out = txt.upper()
    else:
        out = txt.lower()
print(out)

```
[/TEST]

[SOLUTION]
```
import threading
import queue

def increment_upper_count(upper_increment, cu):
    return cu + upper_increment
import threading
import queue

def increment_lower_count(lower_increment, cl):
    return cl + lower_increment
from scipy.stats import ttest_ind
txt = input()
cu = 0
cl = 0
for character in txt:
    upper_increment = 1
    if character.islower():
        lower_increment = 1
        lower_queue = queue.Queue()

        def lower_count_thread_function(queue):
            intermediate_result = increment_lower_count(lower_increment, cl)
            queue.put(intermediate_result)
        lower_thread = threading.Thread(target=lower_count_thread_function, args=(lower_queue,))
        lower_thread.start()
        lower_thread.join()
        result_increment_lower_count0 = lower_queue.get()
        cl = result_increment_lower_count0
    else:
        upper_queue = queue.Queue()

        def increment_upper_count_thread(queue):
            intermediate_result = increment_upper_count(upper_increment, cu)
            queue.put(intermediate_result)
        upper_thread = threading.Thread(target=increment_upper_count_thread, args=(upper_queue,))
        upper_thread.start()
        upper_thread.join()
        upper_count_result = upper_queue.get()
        cu = upper_count_result
ttest_ind([97, 61, 53], [27, 100, 71])
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)
```

The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
newConditionChecker112_1 = 839
newConditionChecker212_1 = 835
txt = input()
cu = 0
cl = 0
LoopChecker14 = 490
LoopChecker24 = 489

@my_decorator
def Func_loop_8_0_0(newLoopIndexOut_1, stop, step):
    global cl, cu
    if step == 0 or (step > 0 and newLoopIndexOut_1 >= stop) or (step < 0 and newLoopIndexOut_1 <= stop):
        return
    for newz_1 in txt:
        if newz_1.islower():
            cl = cl + 1
        else:
            cu = cu + 1
    ttest_ind([23, 59, 73], [46, 54, 87])
    Func_loop_8_0_0(newLoopIndexOut_1 + step, stop, step)
Func_loop_8_0_0(0, LoopChecker14 // LoopChecker24, 1)
if newConditionChecker112_1 & newConditionChecker212_1:
    if cu > cl:
        out = txt.upper()
    else:
        out = txt.lower()
print(out)

```
[/SOLUTION]

[CHECK]

```
import threading
import queue

def increment_upper_count(upper_increment, cu):
    return cu + upper_increment
import threading
import queue

def increment_lower_count(lower_increment, cl):
    return cl + lower_increment
from scipy.stats import ttest_ind
txt = input()
cu = 0
cl = 0
for character in txt:
    upper_increment = 1
    if character.islower():
        lower_increment = 1
        lower_queue = queue.Queue()

        def lower_count_thread_function(queue):
            intermediate_result = increment_lower_count(lower_increment, cl)
            queue.put(intermediate_result)
        lower_thread = threading.Thread(target=lower_count_thread_function, args=(lower_queue,))
        lower_thread.start()
        lower_thread.join()
        result_increment_lower_count0 = lower_queue.get()
        cl = result_increment_lower_count0
    else:
        upper_queue = queue.Queue()

        def increment_upper_count_thread(queue):
            intermediate_result = increment_upper_count(upper_increment, cu)
            queue.put(intermediate_result)
        upper_thread = threading.Thread(target=increment_upper_count_thread, args=(upper_queue,))
        upper_thread.start()
        upper_thread.join()
        upper_count_result = upper_queue.get()
        cu = upper_count_result
ttest_ind([97, 61, 53], [27, 100, 71])
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)
```

The following is a semantically equivalent program which may help your understanding:
```def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
newConditionChecker112_1 = 839
newConditionChecker212_1 = 
