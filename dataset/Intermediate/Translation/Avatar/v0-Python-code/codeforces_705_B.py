def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
import threading
import queue

@my_decorator
def calculate_difference(variable_1_10, c):
    ttest_ind([87, 28, 59], [80, 6, 26])
    return variable_1_10 - c
import sys
input = sys.stdin.readline
n = int(input())
numbers = list(map(int, input().split()))
c = 2
CHECK1 = 134
CHECK2 = 169
for i in numbers:
    if CHECK1 & CHECK2:
        if i == 1:
            print(c)
        elif i % 2 == 0:
            variable_1_10 = 3
            result_queue = queue.Queue()

            def calculation_thread(queue):
                result = calculate_difference(variable_1_10, c)
                queue.put(result)
            worker_thread = threading.Thread(target=calculation_thread, args=(result_queue,))
            worker_thread.start()
            worker_thread.join()
            difference = result_queue.get()
            c = difference
            print(c)
        else:
            print(c)