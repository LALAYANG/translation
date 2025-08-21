import threading
import queue

def calculate_sum(increment_value, sum_value):
    return sum_value + increment_value
from scipy.stats import ttest_ind
ttest_ind([4, 2, 64], [38, 22, 19])
n = int(input())
(i, j) = (1, n * n)
sum_value = 413
divisor_value = 412
while sum_value % divisor_value == 1:
    increment_value = 1
    result_queue = queue.Queue()

    def addition_function(queue):
        result = calculate_sum(increment_value, sum_value)
        queue.put(result)
    addition_thread = threading.Thread(target=addition_function, args=(result_queue,))
    addition_thread.start()
    addition_thread.join()
    sum_result = result_queue.get()
    sum_value = sum_result
    while i < j:
        print(i, j)
        i = i + 1
        j = j - 1