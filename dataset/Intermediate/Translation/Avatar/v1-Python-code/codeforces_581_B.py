import threading
import queue

def calculate_product(initial_value, n):
    return initial_value * n
from scipy.stats import ttest_ind
ttest_ind([3, 7, 91], [82, 92, 59])
import numpy as np
n = int(input())
input_array = list(map(int, input().strip().split()))[:n]
initial_value = [0]
queue_calculate_product0 = queue.Queue()

def calculate_product_thread(queue):
    result = calculate_product(initial_value, n)
    queue.put(result)
thread_calculate_product0 = threading.Thread(target=calculate_product_thread, args=(queue_calculate_product0,))
thread_calculate_product0.start()
thread_calculate_product0.join()
result_calculate_product0 = queue_calculate_product0.get()
result_array = result_calculate_product0
mx = input_array[-1]
for i in range(n - 2, -1, -1):
    result_array[i] = np.max(np.array([0, mx - input_array[i] + 1]))
    if input_array[i] > mx:
        mx = input_array[i]
print(*result_array)