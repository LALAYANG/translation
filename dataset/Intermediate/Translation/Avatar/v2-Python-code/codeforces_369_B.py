import threading
import queue

def calculate_values(get_numbers, k, total_count, sk, sa):
    return get_numbers(k, sk) + get_numbers(total_count - k, sa - sk)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def get_numbers(num, t):
    ttest_ind([20, 79, 18], [45, 32, 55])
    return [t // num + 1 if i in range(t % num) else t // num for i in range(num)]
(total_count, k, l, r, sa, sk) = map(int, input().split())
queue_calculate_values0 = queue.Queue()

def threaded_calculation(queue):
    calculated_result = calculate_values(get_numbers, k, total_count, sk, sa)
    queue.put(calculated_result)
calculation_thread = threading.Thread(target=threaded_calculation, args=(queue_calculate_values0,))
calculation_thread.start()
calculation_thread.join()
result_calculate_values0 = queue_calculate_values0.get()
ans = result_calculate_values0
print(' '.join(map(str, ans)))