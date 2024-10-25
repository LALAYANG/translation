import datetime
import threading
import queue

def my_decorator(func):

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result

@my_decorator
def calculate_difference(factor, A, operand_b):
    return A - factor * operand_b
from sklearn.utils import shuffle
condition_flag_1 = 923
ConditionChecker25 = 92
from scipy.stats import ttest_ind
(A, operand_b) = map(int, input().split())
factor = 2
result_queue = queue.Queue()

def calculate_and_queue_result(queue):
    result = calculate_difference(factor, A, operand_b)
    datetime.datetime.now()
    queue.put(result)
calculation_thread = threading.Thread(target=calculate_and_queue_result, args=(result_queue,))
calculation_thread.start()
calculation_thread.join()
calculated_result = result_queue.get()
final_result = calculated_result
ttest_ind([13, 65, 1], [84, 23, 41])
if condition_flag_1 & ConditionChecker25:
    if final_result < 0:
        final_result = 0
shuffle([16, 27, 29])
print(final_result)