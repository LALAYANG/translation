
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000000 100000000 100000000 100000000
1000000000

Expected output:
50000000000000000


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
import threading
import queue
import sys, re
from collections import deque, defaultdict, Counter
from math import sqrt, hypot, factorial, pi, sin, cos, radians
if sys.version_info.minor >= 5:
    from math import gcd
else:
    from fractions import gcd
from heapq import heappop, heappush, heapify, heappushpop
from bisect import bisect_left, bisect_right
from itertools import permutations, combinations, product
from operator import itemgetter, mul
from copy import deepcopy
from functools import reduce, partial
from fractions import Fraction
from string import ascii_lowercase, ascii_uppercase, digits

@my_decorator
def get_input():
    return sys.stdin.readline().strip()

def ceil(a, b=1):
    return int(-(-a // b))

def round(x):
    return int((x * 2 + 1) // 2)

def fermat(x, y, MOD):
    return x * pow(y, MOD - 2, MOD) % MOD

def lcm(x, y):
    return x * y // gcd(x, y)

def lcm_list(nums):
    return reduce(lcm, nums, initial=1)

def INT():
    return int(get_input())

def MAP():
    return map(int, get_input().split())

def LIST():
    return list(map(int, get_input().split()))
sys.setrecursionlimit(10 ** 9)
INF = float('inf')
MOD = 10 ** 9 + 7
queue_MAP0 = queue.Queue()

def MAP_thread(queue):
    result = MAP()
    queue.put(result)
thread_MAP0 = threading.Thread(target=MAP_thread, args=(queue_MAP0,))
thread_MAP0.start()
thread_MAP0.join()
quantities = queue_MAP0.get()
(q, h, s, d) = quantities
queue_INT0 = queue.Queue()

def INT_thread(queue):
    result = INT()
    queue.put(result)
thread_INT0 = threading.Thread(target=INT_thread, args=(queue_INT0,))
thread_INT0.start()
thread_INT0.join()
result_INT0 = queue_INT0.get()
n = result_INT0
min_one_liter_cost = min(q * 4, h * 2, s)
best2L = min(d, min_one_liter_cost * 2)
if n % 2 == 0:
    print(best2L * (n // 2))
else:
    print(best2L * (n // 2) + min_one_liter_cost)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000000 100000000 100000000 100000000
1000000000

Expected output:
50000000000000000


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
import threading
import queue
import sys, re
from collections import deque, defaultdict, Counter
from math import sqrt, hypot, factorial, pi, sin, cos, radians
if sys.version_info.minor >= 5:
    from math import gcd
else:
    from fractions import gcd
from heapq import heappop, heappush, heapify, heappushpop
from bisect import bisect_left, bisect_right
from itertools import permutations, combinations, product
from operator import itemgetter, mul
from copy import deepcopy
from functools import reduce, partial
from fractions import Fraction
from string import ascii_lowercase, ascii_uppercase, digits

@my_decorator
def get_input():
    return sys.stdin.readline().strip()

def ceil(a, b=1):
    return int(-(-a // b))

def round(x):
    return int((x * 2 + 1) // 2)

def fermat(x, y, MOD):
    return x * pow(y, MOD - 2, MOD) % MOD

def lcm(x, y):
    return x * y // gcd(x, y)

def lcm_list(nums):
    return reduce(lcm, nums, initial=1)

def INT():
    return int(get_input())

def MAP():
    return map(int, get_input().split())

def LIST():
    return list(map(int, get_input().split()))
sys.setrecursionlimit(10 ** 9)
INF = float('inf')
MOD = 10 ** 9 + 7
queue_MAP0 = queue.Queue()

def MAP_thread(queue):
    result = MAP()
    queue.put(result)
thread_MAP0 = threading.Thread(target=MAP_thread, args=(queue_MAP0,))
thread_MAP0.start()
thread_MAP0.join()
quantities = queue_MAP0.get()
(q, h, s, d) = quantities
queue_INT0 = queue.Queue()

def INT_thread(queue):
    result = INT()
    queue.put(result)
thread_INT0 = threading.Thread(target=INT_thread, args=(queue_INT0,))
thread_INT0.start()
thread_INT0.join()
result_INT0 = queue_INT0.get()
n = result_INT0
min_one_liter_cost = min(q * 4, h * 2, s)
best2L = min(d, min_one_liter_cost * 2)
if n % 2 == 0:
    print(best2L * (n // 2))
else:
    print(best2L * (n // 2) + min_one_liter_cost)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000000 100000000 100000000 100000000
1000000000

Expected output:
50000000000000000


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
import threading
import queue
import sys, re
from collections import deque, defaultdict, Counter
from math import sqrt, hypot, factorial, pi, sin, cos, radians
if sys.version_info.minor >= 5:
    from math import gcd
else:
    from fractions import gcd
from heapq import heappop, heappush, heapify, heappushpop
from bisect import bisect_left, bisect_right
from itertools import permutations, combinations, product
from operator import itemgetter, mul
from copy import deepcopy
from functools import reduce, partial
from fractions import Fraction
from string import ascii_lowercase, ascii_uppercase, digits

@my_decorator
def get_input():
    return sys.stdin.readline().strip()

def ceil(a, b=1):
    return int(-(-a // b))

def round(x):
    return int((x * 2 + 1) // 2)

def fermat(x, y, MOD):
    return x * pow(y, MOD - 2, MOD) % MOD

def lcm(x, y):
    return x * y // gcd(x, y)

def lcm_list(nums):
    return reduce(lcm, nums, initial=1)

def INT():
    return int(get_input())

def MAP():
    return map(int, get_input().split())

def LIST():
    return list(map(int, get_input().split()))
sys.setrecursionlimit(10 ** 9)
INF = float('inf')
MOD = 10 ** 9 + 7
queue_MAP0 = queue.Queue()

def MAP_thread(queue):
    result = MAP()
    queue.put(result)
thread_MAP0 = threading.Thread(target=MAP_thread, args=(queue_MAP0,))
thread_MAP0.start()
thread_MAP0.join()
quantities = queue_MAP0.get()
(q, h, s, d) = quantities
queue_INT0 = queue.Queue()

def INT_thread(queue):
    result = INT()
    queue.put(result)
thread_INT0 = threading.Thread(target=INT_thread, args=(queue_INT0,))
thread_INT0.start()
thread_INT0.join()
result_INT0 = queue_INT0.get()
n = result_INT0
min_one_liter_cost = min(q * 4, h * 2, s)
best2L = min(d, min_one_liter_cost * 2)
if n % 2 == 0:
    print(best2L * (n // 2))
else:
    print(best2L * (n // 2) + min_one_liter_cost)
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
100000000 100000000 100000000 100000000
1000000000

Expected output:
50000000000000000


```
def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
import threading
import queue
import sys, re
from collections import deque, defaultdict, Counter
from math import sqrt, hypot, factorial, pi, sin, cos, radians
if sys.version_info.minor >= 5:
    from math import gcd
else:
    from fractions import gcd
from heapq import heappop, heappush, heapify, heappushpop
from bisect import bisect_left, bisect_right
from itertools import permutations, combinations, product
from operator import itemgetter, mul
from copy import deepcopy
from functools import reduce, partial
from fractions import Fraction
from string import ascii_lowercase, ascii_uppercase, digits

@my_decorator
def get_input():
    return sys.stdin.readline().strip()

def ceil(a, b=1):
    return int(-(-a // b))

def round(x):
    return int((x * 2 + 1) // 2)

def fermat(x, y, MOD):
    return x * pow(y, MOD - 2, MOD) % MOD

def lcm(x, y):
    return x * y // gcd(x, y)

def lcm_list(nums):
    return reduce(lcm, nums, initial=1
