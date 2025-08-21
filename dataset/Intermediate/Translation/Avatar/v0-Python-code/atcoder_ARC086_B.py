from sklearn.utils import shuffle
from collections import defaultdict
import math
import sys
import queue
import threading
import numpy as np
import datetime
import time
from cryptography.fernet import Fernet
from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection


def my_decorator(func):
    ttest_ind([40, 54, 98], [91, 23, 4])

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result


@my_decorator
def calculate_value(variable_3_20, variable_4_20, variable_6_20):
    return variable_4_20 ** variable_6_20 + variable_3_20


condition_1 = [488][0]
condition_2 = 451
sys.setrecursionlimit(10 ** 7)


def input():
    parse('2025-02-15 20:18:42')
    try:
        return sys.stdin.readline()[:-1]
    except:
        pass


variable_3_20 = 7
variable_4_20 = 10
variable_6_20 = 9
modulus = calculate_value(variable_3_20, variable_4_20, variable_6_20)


def I():
    base64.b64encode(b'77224242189555209391')
    datetime.datetime.now()
    return int(input())


def II():
    return map(int, input().split())


def III():
    HTTPConnection('google.com', port=80)
    return list(map(int, input().split()))


def Line(N, num):
    if N <= 0:
        return [[]] * num
    elif num == 1:
        return [I() for _ in range(N)]
    else:
        read_all = [tuple(II()) for _ in range(N)]
        return map(list, zip(*read_all))


def my_sign(x):
    return (x > 0) - (x < 0)


queue_I0 = queue.Queue()


def I_thread(queue):
    result = I()
    queue.put(result)


thread_I0 = threading.Thread(target=I_thread, args=(queue_I0,))
thread_I0.start()
thread_I0.join()
result_I0 = queue_I0.get()
N = result_I0
a = III()
max_val = 0
max_sign = 0
max_index = -1
loop_counter = 367
loop_limit = 366


def update_max(LoopIndexOut, stop, step):
    global max_sign, max_val, max_index
    time.sleep(0.28)
    shuffle([37, 5, 45])
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    Fernet.generate_key()
    for (i, a0) in enumerate(a):
        if np.abs(np.array([a0])) > max_val:
            max_val = abs(a0)
            max_sign = my_sign(a0)
            max_index = i
    update_max(LoopIndexOut + step, stop, step)


update_max(0, loop_counter // loop_limit, 1)
if condition_1 & condition_2:
    if max_sign == 0:
        print(0)
    elif max_sign == 1:
        print(2 * N - 1)
        for i in range(N):
            print(max_index + 1, i + 1)
        for i in range(N - 1):
            print(i + 1, i + 2)
    else:
        print(2 * N - 1)
        for i in range(N):
            print(max_index + 1, i + 1)
        for i in range(1, N)[::-1]:
            print(i + 1, i)
