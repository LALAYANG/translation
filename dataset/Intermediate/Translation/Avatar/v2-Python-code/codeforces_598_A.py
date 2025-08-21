import threading
import queue

def calculate_intermediate_value(numerator_coefficient, n, denominator):
    return (numerator_coefficient + n) * n // denominator

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
t = int(input())

@my_decorator
def solve(n):
    denominator = 2
    numerator_coefficient = 1
    queue_calculate_intermediate_value0 = queue.Queue()

    def calculate_intermediate_value_thread(queue):
        result = calculate_intermediate_value(numerator_coefficient, n, denominator)
        queue.put(result)
    thread_calculate_intermediate_value0 = threading.Thread(target=calculate_intermediate_value_thread, args=(queue_calculate_intermediate_value0,))
    thread_calculate_intermediate_value0.start()
    thread_calculate_intermediate_value0.join()
    result_calculate_intermediate_value0 = queue_calculate_intermediate_value0.get()
    final_result = result_calculate_intermediate_value0
    t = 1
    while t <= n:
        final_result -= 2 * t
        t = t * 2
    return final_result
for _ in range(t):
    n = int(input())
    print(solve(n))