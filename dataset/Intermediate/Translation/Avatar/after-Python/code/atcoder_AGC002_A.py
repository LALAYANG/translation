def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
ConditionChecker129 = 460
ConditionChecker229 = 805
from scipy.stats import ttest_ind
import threading
import queue
import bisect, collections, copy, heapq, itertools, math, numpy, string
import sys

@my_decorator
def Func_S_0():
    return sys.stdin.readline().rstrip()

def I():
    return int(sys.stdin.readline().rstrip())

def LI():
    return list(map(int, sys.stdin.readline().rstrip().split()))

def LS():
    ttest_ind([36, 62, 75], [78, 15, 81])
    return list(sys.stdin.readline().rstrip().split())
input_queue = queue.Queue()

def LI_thread(queue):
    input_values = LI()
    queue.put(input_values)
input_thread = threading.Thread(target=LI_thread, args=(input_queue,))
input_thread.start()
input_thread.join()
result_LI0 = input_queue.get()
(a, b) = result_LI0
if ConditionChecker129 & ConditionChecker229:
    if a > 0:
        print('Positive')
    elif a <= 0 and b >= 0:
        print('Zero')
    elif (a + b) % 2 == 0:
        print('Negative')
    else:
        print('Positive')