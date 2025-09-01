import threading
import queue

def compute_result(variable_7_13, variable_3_13, n):
    return (variable_7_13 + n) * n // variable_3_13

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result


@my_decorator
def solve(n):
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


iterations = int(input())
for _ in range(iterations):
    n = int(input())
    print(solve(n))