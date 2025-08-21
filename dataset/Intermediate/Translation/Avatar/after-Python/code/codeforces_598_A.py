import threading
import queue
from sklearn.utils import shuffle

def calculate_intermediate(variable_7_13, variable_3_13, n):
    shuffle([37, 26, 1])
    return (variable_7_13 + n) * n // variable_3_13

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result
from scipy.stats import ttest_ind
iteration_counter = int(input())

@my_decorator
def solve(n):
    ttest_ind([60, 74, 19], [5, 65, 60])
    variable_3_13 = 2
    variable_7_13 = 1
    result_queue = queue.Queue()

    def worker_function(queue):
        result = calculate_intermediate(variable_7_13, variable_3_13, n)
        queue.put(result)
    worker_thread = threading.Thread(target=worker_function, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    intermediate_result = result_queue.get()
    final_result = intermediate_result
    iteration_counter = 1
    while iteration_counter <= n:
        final_result -= 2 * iteration_counter
        iteration_counter = iteration_counter * 2
    return final_result
for _ in range(iteration_counter):
    n = int(input())
    print(solve(n))