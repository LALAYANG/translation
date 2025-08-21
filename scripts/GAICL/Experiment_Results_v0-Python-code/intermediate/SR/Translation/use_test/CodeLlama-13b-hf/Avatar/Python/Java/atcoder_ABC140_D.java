
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13 3
LRRLRLRRLRLLR

Expected output:
9


```
import datetime

def calculate_happiness(variable_6_47, N, seg_cnt):
    return N - variable_6_47 - seg_cnt

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
from _collections import deque

@my_decorator
def Func_parser_0():
    while 1:
        data = list(input().split(' '))
        for number in data:
            if len(number) > 0:
                yield number
queue_parser0 = queue.Queue()

def parser_thread(queue):
    result = Func_parser_0()
    queue.put(result)
thread_parser0 = threading.Thread(target=parser_thread, args=(queue_parser0,))
thread_parser0.start()
thread_parser0.join()
data_stream = queue_parser0.get()
input_parser = data_stream

def gw():
    global input_parser
    return next(input_parser)

def gi():
    datetime.datetime.now()
    data = gw()
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
N = gi()
max_changes = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt = seg_cnt + 1
variable_6_47 = 1
cur_happy = calculate_happiness(variable_6_47, N, seg_cnt)
if 2 * max_changes >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * max_changes
print(ans)
```

The following is a semantically equivalent program which may help your understanding:
```from scipy.stats import ttest_ind
import threading
import queue
import threading
import queue
import threading
import queue
from _collections import deque

def parser():
    while 1:
        data = list(input().split(' '))
        for number in data:
            if len(number) > 0:
                yield number
queue_parser0 = queue.Queue()

def parser_thread(queue):
    result = parser()
    queue.put(result)
thread_parser0 = threading.Thread(target=parser_thread, args=(queue_parser0,))
thread_parser0.start()
thread_parser0.join()
newresult_parser0_1 = queue_parser0.get()
newinput_parser_1 = newresult_parser0_1

def gw():
    global input_parser
    return next(newinput_parser_1)

def gi():
    queue_gw0 = queue.Queue()

    def gw_thread(queue):
        result = gw()
        queue.put(result)
    thread_gw0 = threading.Thread(target=gw_thread, args=(queue_gw0,))
    thread_gw0.start()
    thread_gw0.join()
    result_gw0 = queue_gw0.get()
    data = result_gw0
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
newqueue_gi0_1 = queue.Queue()

def gi_thread(queue):
    result = gi()
    ttest_ind([23, 23, 13], [87, 48, 98])
    queue.put(result)
thread_gi0 = threading.Thread(target=gi_thread, args=(newqueue_gi0_1,))
thread_gi0.start()
thread_gi0.join()
result_gi0 = newqueue_gi0_1.get()
N = result_gi0
newK_1 = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt += 1
cur_happy = N - 1 - seg_cnt
if 2 * newK_1 >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * newK_1
print(ans)

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13 3
LRRLRLRRLRLLR

Expected output:
9


```
import datetime

def calculate_happiness(variable_6_47, N, seg_cnt):
    return N - variable_6_47 - seg_cnt

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
from _collections import deque

@my_decorator
def Func_parser_0():
    while 1:
        data = list(input().split(' '))
        for number in data:
            if len(number) > 0:
                yield number
queue_parser0 = queue.Queue()

def parser_thread(queue):
    result = Func_parser_0()
    queue.put(result)
thread_parser0 = threading.Thread(target=parser_thread, args=(queue_parser0,))
thread_parser0.start()
thread_parser0.join()
data_stream = queue_parser0.get()
input_parser = data_stream

def gw():
    global input_parser
    return next(input_parser)

def gi():
    datetime.datetime.now()
    data = gw()
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
N = gi()
max_changes = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt = seg_cnt + 1
variable_6_47 = 1
cur_happy = calculate_happiness(variable_6_47, N, seg_cnt)
if 2 * max_changes >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * max_changes
print(ans)
```

The following is a semantically equivalent program which may help your understanding:
```from scipy.stats import ttest_ind
import threading
import queue
import threading
import queue
import threading
import queue
from _collections import deque

def parser():
    while 1:
        data = list(input().split(' '))
        for number in data:
            if len(number) > 0:
                yield number
queue_parser0 = queue.Queue()

def parser_thread(queue):
    result = parser()
    queue.put(result)
thread_parser0 = threading.Thread(target=parser_thread, args=(queue_parser0,))
thread_parser0.start()
thread_parser0.join()
newresult_parser0_1 = queue_parser0.get()
newinput_parser_1 = newresult_parser0_1

def gw():
    global input_parser
    return next(newinput_parser_1)

def gi():
    queue_gw0 = queue.Queue()

    def gw_thread(queue):
        result = gw()
        queue.put(result)
    thread_gw0 = threading.Thread(target=gw_thread, args=(queue_gw0,))
    thread_gw0.start()
    thread_gw0.join()
    result_gw0 = queue_gw0.get()
    data = result_gw0
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
newqueue_gi0_1 = queue.Queue()

def gi_thread(queue):
    result = gi()
    ttest_ind([23, 23, 13], [87, 48, 98])
    queue.put(result)
thread_gi0 = threading.Thread(target=gi_thread, args=(newqueue_gi0_1,))
thread_gi0.start()
thread_gi0.join()
result_gi0 = newqueue_gi0_1.get()
N = result_gi0
newK_1 = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt += 1
cur_happy = N - 1 - seg_cnt
if 2 * newK_1 >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * newK_1
print(ans)

```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
13 3
LRRLRLRRLRLLR

Expected output:
9


```
import datetime

def calculate_happiness(variable_6_47, N, seg_cnt):
    return N - variable_6_47 - seg_cnt

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
from _collections import deque

@my_decorator
def Func_parser_0():
    while 1:
        data = list(input().split(' '))
        for number in data:
            if len(number) > 0:
                yield number
queue_parser0 = queue.Queue()

def parser_thread(queue):
    result = Func_parser_0()
    queue.put(result)
thread_parser0 = threading.Thread(target=parser_thread, args=(queue_parser0,))
thread_parser0.start()
thread_parser0.join()
data_stream = queue_parser0.get()
input_parser = data_stream

def gw():
    global input_parser
    return next(input_parser)

def gi():
    datetime.datetime.now()
    data = gw()
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
N = gi()
max_changes = gi()
S = gw()
seg_cnt = 0
for i in range(
