import threading
import queue

def calculate_result(first_addend, exponent, base):
    return base ** exponent + first_addend
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def main_function():
    from sys import setrecursionlimit, stdin
    from os import environ
    from collections import defaultdict, deque, Counter
    from math import ceil, floor, gcd
    from itertools import accumulate, combinations, combinations_with_replacement
    setrecursionlimit(10 ** 6)
    dbg = (lambda *something: print(*something)) if 'TERM_PROGRAM' in environ else lambda *x: 0
    input = lambda : stdin.readline().rstrip()
    LMIIS = lambda : list(map(int, input().split()))
    II = lambda : int(input())
    first_addend = 7
    base = 10
    exponent = 9
    result_queue = queue.Queue()

    def calculation_thread_function(queue):
        result = calculate_result(first_addend, exponent, base)
        queue.put(result)
    calculation_thread = threading.Thread(target=calculation_thread_function, args=(result_queue,))
    calculation_thread.start()
    calculation_thread.join()
    calculation_result = result_queue.get()
    P = calculation_result
    INF = 10 ** 9 + 10
    (first_number_string, sb) = input().split()
    shuffle([97, 90, 48])
    a = int(first_number_string)
    b = int(float(sb) * 100 + 0.1)
    print(a * b // 100)
main_function()