import datetime

def calculate_happiness(variable_6_47, N, seg_cnt):
    return N - variable_6_47 - seg_cnt

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue
from _collections import deque

@my_decorator
def Func_parser_0():
    while 1:
        data = list(input().split(' '))
        for number in data:
            if len(number) > 0:
                yield number
queue_parser0 = queue.Queue()

def parser_thread(queue):
    result = Func_parser_0()
    queue.put(result)
thread_parser0 = threading.Thread(target=parser_thread, args=(queue_parser0,))
thread_parser0.start()
thread_parser0.join()
input_stream = queue_parser0.get()
input_parser = input_stream

def gw():
    global input_parser
    return next(input_parser)

def gi():
    datetime.datetime.now()
    data = gw()
    return int(data)
MOD = int(1000000000.0 + 7)
import numpy
import scipy
from collections import deque
N = gi()
max_operations = gi()
S = gw()
seg_cnt = 0
for i in range(0, N - 1):
    if S[i] != S[i + 1]:
        seg_cnt = seg_cnt + 1
variable_6_47 = 1
cur_happy = calculate_happiness(variable_6_47, N, seg_cnt)
if 2 * max_operations >= seg_cnt:
    ans = N - 1
else:
    ans = cur_happy + 2 * max_operations
print(ans)