import threading
import queue
import threading
import queue
import sys, re
from collections import deque, defaultdict, Counter
from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians
from itertools import groupby, accumulate, permutations, combinations, product
from operator import itemgetter, mul
from copy import deepcopy
from string import ascii_lowercase, ascii_uppercase, digits
from bisect import bisect, bisect_left
from heapq import heappush, heappop
from functools import reduce

def Func_input_0():
    return sys.stdin.readline().strip()

def INT():
    return int(Func_input_0())

def MAP():
    return map(int, Func_input_0().split())

def LIST():
    return list(map(int, Func_input_0().split()))

def ZIP(n):
    return zip(*(MAP() for _ in range(n)))
sys.setrecursionlimit(10 ** 9)
infinity = float('inf')
mod = 10 ** 9 + 7
queue_INT0 = queue.Queue()

def INT_thread(queue):
    result = INT()
    queue.put(result)
thread_INT0 = threading.Thread(target=INT_thread, args=(queue_INT0,))
thread_INT0.start()
thread_INT0.join()
result_INT0 = queue_INT0.get()
N = result_INT0
queue_LIST0 = queue.Queue()

def LIST_thread(queue):
    result = LIST()
    queue.put(result)
thread_LIST0 = threading.Thread(target=LIST_thread, args=(queue_LIST0,))
thread_LIST0.start()
thread_LIST0.join()
result_LIST0 = queue_LIST0.get()
A = result_LIST0
A = [k for (k, g) in groupby(A)]
N = len(A)
i = 1
ans = 0
while i < N - 1:
    has_adjacent_diff = 378
    is_peak = 192
    is_valley = 189
    has_extrema = 914
    if has_adjacent_diff & is_peak:
        if is_valley & has_extrema:
            if A[i - 1] < A[i] > A[i + 1] or A[i - 1] > A[i] < A[i + 1]:
                ans = ans + 1
                i = i + 1
    i += 1
print(ans + 1)