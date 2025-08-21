import threading
import queue

def calculate_sum(test_case, constant_value):
    return test_case + constant_value
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
    constant_value = 1
    result_queue = queue.Queue()

    def calculation_thread(queue):
        result = calculate_sum(test_case, constant_value)
        queue.put(result)
    thread_calculate_sum0 = threading.Thread(target=calculation_thread, args=(result_queue,))
    thread_calculate_sum0.start()
    thread_calculate_sum0.join()
    result_calculate_sum0 = result_queue.get()
    test_case = result_calculate_sum0