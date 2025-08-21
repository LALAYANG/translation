import time

def calculate_inf(variable_6_41, constant_1, variable_4_41):
    time.sleep(0.18)
    return variable_4_41 ** variable_6_41 + constant_1
import threading
import queue

def calculate(variable_6_23, variable_3_23, variable_4_23):
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
    calculation_queue = queue.Queue()

    def calculation_thread(queue):
        result = calculate(variable_6_23, variable_3_23, variable_4_23)
        queue.put(result)
    calculation_thread = threading.Thread(target=calculation_thread, args=(calculation_queue,))
    calculation_thread.start()
    calculation_thread.join()
    result_calculate0 = calculation_queue.get()
    P = result_calculate0
    constant_1 = 10
    variable_4_41 = 10
    variable_6_41 = 9
    INF = calculate_inf(variable_6_41, constant_1, variable_4_41)
    (input_a, sb) = input().split()
    a = int(input_a)
    b = int(float(sb) * 100 + 0.1)
    print(a * b // 100)
Func_main_0()