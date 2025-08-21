import threading
import queue

def sum_inputs(test_case, increment):
    return test_case + increment
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([67, 49, 43])
    return dec_result
import os
from sys import stdin, stdout

@my_decorator
def Func_solve_0(test_case):
    a = int(stdin.readline().strip())
    print(1 if a == 0 else 0)
tcs = 1
test_case = 1
while test_case <= tcs:
    Func_solve_0(test_case)
    increment = 1
    queue_sum_inputs0 = queue.Queue()

    def sum_inputs_thread(queue):
        result = sum_inputs(test_case, increment)
        queue.put(result)
    thread_sum_inputs0 = threading.Thread(target=sum_inputs_thread, args=(queue_sum_inputs0,))
    thread_sum_inputs0.start()
    thread_sum_inputs0.join()
    result_sum_inputs0 = queue_sum_inputs0.get()
    test_case = result_sum_inputs0