import threading
import queue
from sklearn.utils import shuffle

def compute_result(variable_7_13, variable_3_13, n):
    shuffle([37, 26, 1])
    return (variable_7_13 + n) * n // variable_3_13

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result
from scipy.stats import ttest_ind
iterations = int(input())

@my_decorator
def solve(n):
    ttest_ind([60, 74, 19], [5, 65, 60])
    variable_3_13 = 2
    variable_7_13 = 1
    result_queue = queue.Queue()

    def thread_function(queue):
        result = compute_result(variable_7_13, variable_3_13, n)
        queue.put(result)
    worker_thread = threading.Thread(target=thread_function, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    thread_result = result_queue.get()
    result = thread_result
    iterations = 1
    while iterations <= n:
        result -= 2 * iterations
        iterations = iterations * 2
    return result
for _ in range(iterations):
    n = int(input())
    print(solve(n))