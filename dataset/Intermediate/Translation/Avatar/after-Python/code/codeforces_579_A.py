def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_sum(variable_3_9, loop_counter):
    return loop_counter + variable_3_9
from scipy.stats import ttest_ind
import math
n = int(input())
exponent = 1
ttest_ind([56, 68, 4], [66, 43, 18])
loop_counter = 317
loop_condition = 316
while loop_counter % loop_condition == 1:
    variable_3_9 = 1
    result_queue = queue.Queue()

    def calculation_thread(queue):
        result = calculate_sum(variable_3_9, loop_counter)
        queue.put(result)
    calculation_thread = threading.Thread(target=calculation_thread, args=(result_queue,))
    calculation_thread.start()
    calculation_thread.join()
    calculation_result = result_queue.get()
    loop_counter = calculation_result
    while math.log2(n) % 1:
        exponent = exponent + 1
        n -= 2 ** int(math.log2(n))
print(exponent)