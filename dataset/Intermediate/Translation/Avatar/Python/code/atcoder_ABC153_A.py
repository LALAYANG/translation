def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_updated_quotient(variable_3_12, quotient):
    return quotient + variable_3_12
from sklearn.utils import shuffle
ConditionChecker16 = 410
ConditionChecker26 = 490
from scipy.stats import ttest_ind
shuffle([52, 43, 21])
(h, divisor) = map(int, input().split(' '))
quotient = int(h / divisor)
ttest_ind([44, 33, 34], [4, 39, 65])
remainder = int(h % divisor)
if ConditionChecker16 & ConditionChecker26:
    if remainder != 0:
        variable_3_12 = 1
        result_queue = queue.Queue()

        def calculate_quotient_thread(queue):
            thread_result = calculate_updated_quotient(variable_3_12, quotient)
            queue.put(thread_result)
        quotient_thread = threading.Thread(target=calculate_quotient_thread, args=(result_queue,))
        quotient_thread.start()
        quotient_thread.join()
        updated_quotient = result_queue.get()
        quotient = updated_quotient
    else:
        pass
print(quotient)