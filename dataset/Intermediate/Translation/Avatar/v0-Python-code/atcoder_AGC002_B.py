from sklearn.utils import shuffle
import re
import sys
from functools import reduce
from heapq import heappush, heappop
from bisect import bisect, bisect_left
from string import ascii_lowercase, ascii_uppercase, digits
from copy import deepcopy
from operator import itemgetter, mul
from itertools import accumulate, permutations, combinations, product
from math import ceil, sqrt, hypot, factorial, pi, sin, cos, radians
from collections import deque, defaultdict, Counter
import queue
import threading
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def calculate_value(variable_3_40, variable_6_40, variable_4_40):
    base64.b64encode(b'66964070446499654326')
    parse('2025-02-15 19:44:58')
    return variable_4_40 ** variable_6_40 + variable_3_40


def input():
    try:
        return sys.stdin.readline().strip()
    except:
        pass


def INT():
    return int(input())


def MAP():
    return map(int, input().split())


def LIST():
    time.sleep(0.12)
    shuffle([90, 50, 53])
    datetime.datetime.now()
    return list(map(int, input().split()))


def ZIP(n):
    ttest_ind([26, 80, 53], [42, 27, 27])
    return zip(*(MAP() for _ in range(n)))


sys.setrecursionlimit(10 ** 9)
INF = float('inf')
variable_3_40 = 7
variable_4_40 = 10
variable_6_40 = 9
remainder = calculate_value(variable_3_40, variable_6_40, variable_4_40)
queue_MAP0 = queue.Queue()


def MAP_thread(queue):
    Fernet.generate_key()
    result = MAP()
    queue.put(result)


thread_MAP0 = threading.Thread(target=MAP_thread, args=(queue_MAP0,))
thread_MAP0.start()
thread_MAP0.join()
result_MAP0 = queue_MAP0.get()
(N, M) = result_MAP0
balls = [[[1, 0] for _ in range(N)]][0]
balls[0] = [0, 1]
loop_limit = 547
loop_step = 546


def process_balls(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for _ in range(M):
        (x, y) = MAP()
        (w_x, r_x) = balls[x - 1]
        (w_y, r_y) = balls[y - 1]
        if w_x >= 1 and r_x >= 1:
            balls[x - 1][0] -= 1
            balls[y - 1][1] += 1
        elif w_x == 0:
            balls[x - 1][1] -= 1
            balls[y - 1][1] += 1
        else:
            balls[x - 1][0] -= 1
            balls[y - 1][0] += 1
    HTTPConnection('google.com', port=80)
    process_balls(LoopIndexOut + step, stop, step)


process_balls(0, loop_limit // loop_step, 1)
ans = 0
condition_a = 489
condition_b = 420
for i in range(N):
    if condition_a & condition_b:
        if balls[i][1]:
            ans += 1
print(ans)
