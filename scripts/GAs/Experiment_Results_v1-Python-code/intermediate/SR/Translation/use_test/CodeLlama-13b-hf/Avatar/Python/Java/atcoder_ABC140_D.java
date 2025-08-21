
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
result_parser0 = queue_parser0.get()
input_parser = result_parser0

def gw():
    global input_parser
    return next(input_parser)

def gi():
    queue_gw0 = queue.Queue()

    def gw_thread(queue):
        result = gw()
        queue.put(result)
    thread_gw0 = threading.Thread(target=gw_thread, args=(queue_gw0,))
    thread_gw0.start()
    thread_gw0.join()
    parsed_word = queue_gw0.get()
    data = parsed_word
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
queue_gi0 = queue.Queue()

def gi_thread(queue):
    result = gi()
    queue.put(result)
thread_gi0 = threading.Thread(target=gi_thread, args=(queue_gi0,))
thread_gi0.start()
thread_gi0.join()
result_gi0 = queue_gi0.get()
N = result_gi0
allowed_changes = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt = seg_cnt + 1
cur_happy = N - 1 - seg_cnt
if 2 * allowed_changes >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * allowed_changes
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
result_parser0 = queue_parser0.get()
input_parser = result_parser0

def gw():
    global input_parser
    return next(input_parser)

def gi():
    queue_gw0 = queue.Queue()

    def gw_thread(queue):
        result = gw()
        queue.put(result)
    thread_gw0 = threading.Thread(target=gw_thread, args=(queue_gw0,))
    thread_gw0.start()
    thread_gw0.join()
    parsed_word = queue_gw0.get()
    data = parsed_word
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
queue_gi0 = queue.Queue()

def gi_thread(queue):
    result = gi()
    queue.put(result)
thread_gi0 = threading.Thread(target=gi_thread, args=(queue_gi0,))
thread_gi0.start()
thread_gi0.join()
result_gi0 = queue_gi0.get()
N = result_gi0
allowed_changes = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt = seg_cnt + 1
cur_happy = N - 1 - seg_cnt
if 2 * allowed_changes >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * allowed_changes
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
result_parser0 = queue_parser0.get()
input_parser = result_parser0

def gw():
    global input_parser
    return next(input_parser)

def gi():
    queue_gw0 = queue.Queue()

    def gw_thread(queue):
        result = gw()
        queue.put(result)
    thread_gw0 = threading.Thread(target=gw_thread, args=(queue_gw0,))
    thread_gw0.start()
    thread_gw0.join()
    parsed_word = queue_gw0.get()
    data = parsed_word
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
queue_gi0 = queue.Queue()

def gi_thread(queue):
    result = gi()
    queue.put(result)
thread_gi0 = threading.Thread(target=gi_thread, args=(queue_gi0,))
thread_gi0.start()
thread_gi0.join()
result_gi0 = queue_gi0.get()
N = result_gi0
allowed_changes = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt = seg_cnt + 1
cur_happy = N - 1 - seg_cnt
if 2 * allowed_changes >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * allowed_changes
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
result_parser0 = queue_parser0.get()
input_parser = result_parser0

def gw():
    global input_parser
    return next(input_parser)

def gi():
    queue_gw0 = queue.Queue()

    def gw_thread(queue):
        result = gw()
        queue.put(result)
    thread_gw0 = threading.Thread(target=gw_thread, args=(queue_gw0,))
    thread_gw0.start()
    thread_gw0.join()
    parsed_word = queue_gw0.get()
    data = parsed_word
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
queue_gi0 = queue.Queue()

def gi_thread(queue):
    result = gi()
    queue.put(result)
thread_gi0 = threading.Thread(target=gi_thread, args=(queue_gi0,))
thread_gi0.start()
thread_gi0.join()
result_gi0 = queue_gi0.get()
N = result_gi0
allowed_changes = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt = seg_cnt + 1
cur_happy = N - 1 - seg_cnt
if 2 * allowed_changes >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * allowed_changes
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
result_parser0 = queue_parser0.get()
input_parser = result_parser0

def gw():
    global input_parser
    return next(input_parser)

def gi():
    queue_gw0 = queue.Queue()

    def gw_thread(queue):
        result = gw()
        queue.put(result)
    thread_gw0 = threading.Thread(target=gw_thread, args=(queue_gw0,))
    thread_gw0.start()
    thread_gw0.join()
    parsed_word = queue_gw0.get()
    data = parsed_word
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
queue_gi0 = queue.Queue()

def gi_thread(queue):
    result = gi()
    queue.put(result)
thread_gi0 = threading.Thread(target=gi_thread, args=(queue_gi0,))
thread_gi0.start()
thread_gi0.join()
result_gi0 = queue_gi0.get()
N = result_gi0
allowed_changes = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt = seg_cnt + 1
cur_happy = N - 1 - seg_cnt
if 2 * allowed_changes >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * allowed_changes
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
thread_parser0 = threading.Thread(target
