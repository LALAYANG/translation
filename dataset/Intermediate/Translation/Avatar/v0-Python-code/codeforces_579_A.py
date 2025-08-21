def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def add_numbers(variable_3_9, loop_counter):
    return loop_counter + variable_3_9
from scipy.stats import ttest_ind
import math
n = int(input())
x = 1
ttest_ind([56, 68, 4], [66, 43, 18])
loop_counter = 317
loop_condition = 316
while loop_counter % loop_condition == 1:
    variable_3_9 = 1
    result_queue = queue.Queue()

    def worker_thread(queue):
        result = add_numbers(variable_3_9, loop_counter)
        queue.put(result)
    worker_thread_instance = threading.Thread(target=worker_thread, args=(result_queue,))
    worker_thread_instance.start()
    worker_thread_instance.join()
    result = result_queue.get()
    loop_counter = result
    while math.log2(n) % 1:
        x = x + 1
        n -= 2 ** int(math.log2(n))
print(x)