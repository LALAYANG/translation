import threading
import queue

def calculate_product(n, variable_3_11, factor):
    return factor * n * variable_3_11

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
import numpy as np
get_input = input
(n, num_operations) = map(int, get_input().split())
factor = [1]
variable_3_11 = 2
result_queue = queue.Queue()

def calculate_product_thread(queue):
    result = calculate_product(n, variable_3_11, factor)
    queue.put(result)
thread_calculate_product0 = threading.Thread(target=calculate_product_thread, args=(result_queue,))
thread_calculate_product0.start()
thread_calculate_product0.join()
result_calculate_product0 = result_queue.get()
b = result_calculate_product0
b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0

@my_decorator
def process_matrix(i, stop, step):
    ttest_ind([43, 72, 75], [62, 56, 90])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (row_index, c) = map(int, get_input().split())
    b[row_index - 1] = b[n + c - 1] = 0
    process_matrix(i + step, stop, step)
process_matrix(0, num_operations, 1)
if n % 2 and b[n // 2] and b[n + n // 2]:
    b[n // 2] = 0
print(np.sum(np.array([b])))