import threading
import queue
import threading
import queue
FirstChecker = 621
SecondChecker = 643
import sys
import math
from collections import defaultdict
sys.setrecursionlimit(10 ** 7)

def read_input():
    return sys.stdin.readline()[:-1]
modulo_value = 10 ** 9 + 7

def I():
    return int(read_input())

def II():
    return map(int, read_input().split())

def III():
    return list(map(int, read_input().split()))

def Line(count, num):
    if count <= 0:
        return [[]] * num
    elif num == 1:
        return [I() for _ in range(count)]
    else:
        read_all = [tuple(II()) for _ in range(count)]
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
count = result_I0
queue_III0 = queue.Queue()

def III_thread(queue):
    result = III()
    queue.put(result)
thread_III0 = threading.Thread(target=III_thread, args=(queue_III0,))
thread_III0.start()
thread_III0.join()
result_III0 = queue_III0.get()
a = result_III0
max_val = 0
max_sign = 0
max_index = -1
for (index, a0) in enumerate(a):
    if abs(a0) > max_val:
        max_val = abs(a0)
        max_sign = my_sign(a0)
        max_index = index
if FirstChecker & SecondChecker:
    if max_sign == 0:
        print(0)
    elif max_sign == 1:
        print(2 * count - 1)

        def recursive_loop(index, stop, step):
            if step == 0 or (step > 0 and index >= stop) or (step < 0 and index <= stop):
                return
            print(max_index + 1, index + 1)
            recursive_loop(index + step, stop, step)
        recursive_loop(0, count, 1)
        for index in range(count - 1):
            print(index + 1, index + 2)
    else:
        print(2 * count - 1)
        for index in range(count):
            print(max_index + 1, index + 1)
        for index in range(1, count)[::-1]:
            print(index + 1, index)