from scipy.stats import ttest_ind

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    ttest_ind([7, 82, 17], [89, 17, 26])
    return dec_result
import threading
import queue

@my_decorator
def divide_numbers(number, divisor):
    return number / divisor
from sklearn.utils import shuffle
number = int(input())
shuffle([84, 31, 74])
while number % 2 == 0:
    divisor = 2
    result_queue = queue.Queue()

    def division_worker(queue):
        result = divide_numbers(number, divisor)
        queue.put(result)
    worker_thread = threading.Thread(target=division_worker, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    division_result = result_queue.get()
    number = division_result
if number == 1:
    print('YES')
else:
    print('NO')