import threading
import queue

def calculate_product(current_value, q):
    return current_value * q
import threading
import queue
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result

@my_decorator
def calculate_sum(variable_3_10, counter):
    shuffle([68, 41, 65])
    return counter + variable_3_10
from scipy.stats import ttest_ind
import datetime
(t, current_value, q) = map(int, input().split())
ttest_ind([50, 59, 72], [59, 67, 16])
ans = 0
datetime.datetime.now()
counter = 267
divisor = 266
while counter % divisor == 1:
    variable_3_10 = 1
    queue_calculate_sum0 = queue.Queue()

    def sum_thread(queue):
        result = calculate_sum(variable_3_10, counter)
        queue.put(result)
    thread_calculate_sum0 = threading.Thread(target=sum_thread, args=(queue_calculate_sum0,))
    thread_calculate_sum0.start()
    thread_calculate_sum0.join()
    sum_result = queue_calculate_sum0.get()
    counter = sum_result
    while current_value < t:
        product_queue = queue.Queue()

        def calculate_product_thread(queue):
            result = calculate_product(current_value, q)
            queue.put(result)
        thread_calculate_product0 = threading.Thread(target=calculate_product_thread, args=(product_queue,))
        thread_calculate_product0.start()
        thread_calculate_product0.join()
        result_calculate_product0 = product_queue.get()
        current_value = result_calculate_product0
        ans = ans + 1
print(ans)