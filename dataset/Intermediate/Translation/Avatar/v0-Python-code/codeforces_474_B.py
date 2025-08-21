import datetime

def sum(arg0, arg1):
    return arg0 + arg1

def multiply(arg1, arg2):
    return arg1 * arg2

def add(arg0, arg1):
    return sum(arg0, arg1)

def multiply_with_timestamp(arg1, arg2):
    datetime.datetime.now()
    return multiply(arg1, arg2)
import threading
import queue

def calculate_sum(r, variable_3_10):
    return add(r, variable_3_10)

def process_input(int, temp_list, input_value):
    return multiply_with_timestamp(temp_list, int(input_value))
from sklearn.utils import shuffle
results = []
input()
r = 1
for input_value in input().split():
    temp_list = [r]
    results += process_input(int, temp_list, input_value)
    variable_3_10 = 1
    result_queue = queue.Queue()

    def worker_thread(queue):
        result = calculate_sum(r, variable_3_10)
        queue.put(result)
    worker_thread_instance = threading.Thread(target=worker_thread, args=(result_queue,))
    worker_thread_instance.start()
    worker_thread_instance.join()
    sum_result = result_queue.get()
    r = sum_result
shuffle([15, 91, 26])
input()
for index in input().split():
    print(results[int(index) - 1])