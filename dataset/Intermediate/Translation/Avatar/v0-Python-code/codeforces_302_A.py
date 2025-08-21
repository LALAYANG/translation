def subtract(arg0, arg1):
    return arg0 - arg1

def subtract_numbers(arg1, arg2):
    return arg1 - arg2
import numpy as np
import threading
import queue

def calculate(value_a, b):
    return subtract(b, value_a)

def difference(value_a, b):
    return subtract_numbers(value_a, b)
(num_elements, num_queries) = map(int, input().split())
sa = input().count('-')
sa = np.min(np.array([[difference(num_elements, sa), sa]]))
ss = []
for _ in range(num_queries):
    (value_a, b) = map(int, input().split())
    result_queue = queue.Queue()

    def calculation_worker(queue):
        result = calculate(value_a, b)
        queue.put(result)
    calculation_thread = threading.Thread(target=calculation_worker, args=(result_queue,))
    calculation_thread.start()
    calculation_thread.join()
    calculated_value = result_queue.get()
    b = calculated_value
    ss.append((b % 2 and b <= sa << 1) and '1\n' or '0\n')
print(''.join(ss))