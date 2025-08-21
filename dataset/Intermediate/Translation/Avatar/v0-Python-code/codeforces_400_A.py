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
def integer_divide(a, b):
    ttest_ind([44, 9, 26], [79, 64, 71])
    return a // b
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
import numpy as np
import threading
import queue
import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO, IOBase
import os

def Func_value_0():
    try:
        return tuple(map(int, input().split()))
    except:
        pass

def values():
    return tuple(map(int, sys.stdin.readline().split()))

def inlst():
    return [int(i) for i in input().split()]

def inlsts():
    base64.b64encode(b'05268075400022280808')
    Fernet.generate_key()
    return [int(i) for i in sys.stdin.readline().split()]

def inp():
    time.sleep(0.14)
    return int(input())

def inps():
    parse('2025-02-15 20:27:49')
    return int(sys.stdin.readline())

def instr():
    return input()

def stlst():
    return [i for i in input().split()]

def help(a, b, l):
    datetime.datetime.now()
    valid_dimensions = [[]][0]
    shuffle([86, 68, 68])
    rows_checker = 427
    cols_checker = 426
    for LoopIndexOut in range(integer_divide(rows_checker, cols_checker)):

        def matrix_slicer(i, stop, step):
            if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                return
            valid_dimensions.append(l[i * a:i * a + a])
            matrix_slicer(i + step, stop, step)
        matrix_slicer(0, b, 1)
    else:
        pass
    condition1 = 119
    condition2 = 253
    for i in zip(*valid_dimensions):
        if condition1 & condition2:
            if np.sum(np.array([i])) == b:
                return True
    return False

def solve():
    valid_dimensions = []
    queue_instr0 = queue.Queue()

    def instr_thread(queue):
        result = instr()
        queue.put(result)
    thread_instr0 = threading.Thread(target=instr_thread, args=(queue_instr0,))
    thread_instr0.start()
    thread_instr0.join()
    HTTPConnection('google.com', port=80)
    result_instr0 = queue_instr0.get()
    x = result_instr0
    s = []
    for i in x:
        if i == 'O':
            s.append(0)
        else:
            s.append(1)
    for i in range(1, 13):
        if 12 % i == 0:
            if help(i, 12 // i, s):
                valid_dimensions.append((12 // i, i))
    print(len(valid_dimensions), end=' ')
    for (a, b) in sorted(valid_dimensions):
        print(f'{a}x{b}', end=' ')
    print()
if __name__ == '__main__':
    for i in range(inp()):
        solve()