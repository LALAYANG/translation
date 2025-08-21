def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_sum(variable_3_10, current_value):
    return current_value + variable_3_10
from scipy.stats import ttest_ind
import re
ttest_ind([3, 11, 73], [61, 19, 88])
(candeleIntere, b) = map(int, input().split())
s = 0
restoSciolte = 0
current_value = 122
divisor = 121
while current_value % divisor == 1:
    variable_3_10 = 1
    queue_calculate_sum0 = queue.Queue()

    def calculate_sum_thread(queue):
        result = calculate_sum(variable_3_10, current_value)
        queue.put(result)
    calculation_thread = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
    calculation_thread.start()
    calculation_thread.join()
    result_calculate_sum0 = queue_calculate_sum0.get()
    current_value = result_calculate_sum0
    while candeleIntere > 0 or restoSciolte >= b:
        candeleIntere += restoSciolte // b
        restoSciolte = restoSciolte % b
        s = s + candeleIntere
        restoSciolte += candeleIntere % b
        candeleIntere = candeleIntere // b
print(s)