import threading
import queue

def calculate_sum_of_powers(variable_6_23, variable_3_23, variable_4_23):
    return variable_4_23 ** variable_6_23 + variable_3_23
import datetime

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def Func_main_0():
    from sys import setrecursionlimit, stdin
    from os import environ
    from collections import defaultdict, deque, Counter
    from math import ceil, floor, gcd
    from itertools import accumulate, combinations, combinations_with_replacement
    setrecursionlimit(10 ** 6)
    debug_print = (lambda *something: print(*something)) if 'TERM_PROGRAM' in environ else lambda *x: 0
    input = lambda : stdin.readline().rstrip()
    LMIIS = lambda : list(map(int, input().split()))
    datetime.datetime.now()
    read_int = lambda : int(input())
    variable_3_23 = 7
    variable_4_23 = 10
    variable_6_23 = 9
    result_queue = queue.Queue()

    def calculation_thread(queue):
        result = calculate_sum_of_powers(variable_6_23, variable_3_23, variable_4_23)
        queue.put(result)
    worker_thread = threading.Thread(target=calculation_thread, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    calculated_value = result_queue.get()
    P = calculated_value
    INF = 10 ** 9 + 10
    (sa, sb) = input().split()
    a = int(sa)
    b = int(float(sb) * 100 + 0.1)
    print(a * b // 100)
Func_main_0()