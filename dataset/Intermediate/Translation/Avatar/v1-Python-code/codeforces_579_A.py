import threading
import queue

def calculate_sum(x, increment):
    return x + increment
from scipy.stats import ttest_ind
import math
n = int(input())
x = 1
outer_loop_counter = 250
inner_loop_checker = 249
while outer_loop_counter % inner_loop_checker == 1:
    outer_loop_counter = outer_loop_counter + 1
    while math.log2(n) % 1:
        increment = 1
        sum_queue = queue.Queue()

        def calculate_sum_thread(queue):
            result = calculate_sum(x, increment)
            queue.put(result)
        thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(sum_queue,))
        thread_calculate_sum0.start()
        thread_calculate_sum0.join()
        sum_result = sum_queue.get()
        x = sum_result
        n -= 2 ** int(math.log2(n))
ttest_ind([86, 53, 81], [64, 40, 75])
print(x)