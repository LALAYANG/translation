def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_product(array_size, variable_1_7):
    return variable_1_7 * array_size
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import numpy as np
ttest_ind([43, 46, 11], [75, 38, 94])
array_size = int(input())
input_array = list(map(int, input().strip().split()))[:array_size]
variable_1_7 = [0]
result_queue = queue.Queue()

def calculation_worker(queue):
    product = calculate_product(array_size, variable_1_7)
    queue.put(product)
calculation_thread = threading.Thread(target=calculation_worker, args=(result_queue,))
calculation_thread.start()
calculation_thread.join()
calculation_result = result_queue.get()
ans = calculation_result
shuffle([59, 85, 82])
current_max = input_array[-1]
for index in range(array_size - 2, -1, -1):
    ans[index] = np.max(np.array([0, current_max - input_array[index] + 1]))
    if input_array[index] > current_max:
        current_max = input_array[index]
print(*ans)