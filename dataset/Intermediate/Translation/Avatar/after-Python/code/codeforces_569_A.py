import threading
import queue

def multiply_numbers(current_value, q):
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
def shuffle_and_add(variable_3_10, counter):
    shuffle([68, 41, 65])
    return counter + variable_3_10
from scipy.stats import ttest_ind
import datetime
(t, current_value, q) = map(int, input().split())
ttest_ind([50, 59, 72], [59, 67, 16])
ans = 0
datetime.datetime.now()
counter = 267
modulo_divisor = 266
while counter % modulo_divisor == 1:
    variable_3_10 = 1
    shuffling_queue = queue.Queue()

    def shuffle_and_add_thread(queue):
        calculation_result = shuffle_and_add(variable_3_10, counter)
        queue.put(calculation_result)
    shuffling_thread = threading.Thread(target=shuffle_and_add_thread, args=(shuffling_queue,))
    shuffling_thread.start()
    shuffling_thread.join()
    shuffled_result = shuffling_queue.get()
    counter = shuffled_result
    while current_value < t:
        queue_multiply_numbers0 = queue.Queue()

        def multiply_numbers_thread(queue):
            calculation_result = multiply_numbers(current_value, q)
            queue.put(calculation_result)
        multiplication_thread = threading.Thread(target=multiply_numbers_thread, args=(queue_multiply_numbers0,))
        multiplication_thread.start()
        multiplication_thread.join()
        result_multiply_numbers0 = queue_multiply_numbers0.get()
        current_value = result_multiply_numbers0
        ans = ans + 1
print(ans)