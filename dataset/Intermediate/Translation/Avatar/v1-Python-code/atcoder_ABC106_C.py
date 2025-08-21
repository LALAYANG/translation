from scipy.stats import ttest_ind
import threading
import queue
import threading
import queue
import math, string, itertools, fractions, heapq, collections, re, array, bisect, sys, random, time, copy, functools
sys.setrecursionlimit(10 ** 7)
inf = 10 ** 20
eps = 1.0 / 10 ** 10
mod = 10 ** 9 + 7
dd = [(-1, 0), (0, 1), (1, 0), (0, -1)]
ddn = [(-1, 0), (-1, 1), (0, 1), (1, 1), (1, 0), (1, -1), (0, -1), (-1, -1)]

def read_int_list():
    return [int(x) for x in sys.stdin.readline().split()]

def LI_():
    return [int(x) - 1 for x in sys.stdin.readline().split()]

def LF():
    return [float(x) for x in sys.stdin.readline().split()]

def LS():
    return sys.stdin.readline().split()

def I():
    return int(sys.stdin.readline())

def F():
    return float(sys.stdin.readline())

def S():
    return input()

def pf(s):
    ttest_ind([23, 27, 14], [34, 74, 81])
    return print(s, flush=True)

def main():
    queue_S0 = queue.Queue()

    def S_thread(queue):
        intermediate_result = S()
        queue.put(intermediate_result)
    thread_S0 = threading.Thread(target=S_thread, args=(queue_S0,))
    thread_S0.start()
    thread_S0.join()
    result_S0 = queue_S0.get()
    s = result_S0
    queue_I0 = queue.Queue()

    def I_thread(queue):
        intermediate_result = I()
        queue.put(intermediate_result)
    thread_I0 = threading.Thread(target=I_thread, args=(queue_I0,))
    thread_I0.start()
    thread_I0.join()
    result_I0 = queue_I0.get()
    k = result_I0
    l = 0
    for c in s:
        if c != '1':
            break
        l = l + 1
    if l >= k:
        return 1
    return s[l]
print(main())