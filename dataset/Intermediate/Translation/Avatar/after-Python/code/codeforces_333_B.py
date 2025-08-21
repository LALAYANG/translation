import threading
import queue

def calculate_values(n, variable_3_11, coefficients):
    return coefficients * n * variable_3_11

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
import numpy as np
input_function = input
(n, loop_iterations) = map(int, input_function().split())
coefficients = [1]
variable_3_11 = 2
calculation_queue = queue.Queue()

def calculate_values_thread(queue):
    result = calculate_values(n, variable_3_11, coefficients)
    queue.put(result)
calculation_thread = threading.Thread(target=calculate_values_thread, args=(calculation_queue,))
calculation_thread.start()
calculation_thread.join()
calculation_result = calculation_queue.get()
b = calculation_result
b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0

@my_decorator
def process_input(i, stop, step):
    ttest_ind([43, 72, 75], [62, 56, 90])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (input_index, c) = map(int, input_function().split())
    b[input_index - 1] = b[n + c - 1] = 0
    process_input(i + step, stop, step)
process_input(0, loop_iterations, 1)
if n % 2 and b[n // 2] and b[n + n // 2]:
    b[n // 2] = 0
print(np.sum(np.array([b])))