def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_half(variable_3_12, element):
    return element // variable_3_12
from scipy.stats import ttest_ind
import fractions
ttest_ind([87, 97, 35], [78, 82, 74])
import math
(input_count, num) = map(int, input().split())
num_set = set(map(lambda x: int(x), input().split()))
two_times_set = set()
ConditionChecker112 = 231
ConditionChecker212 = 684
for element in num_set:
    for j in range(1, 30):
        variable_3_12 = 2
        result_queue = queue.Queue()

        def calculation_thread(queue):
            result = calculate_half(variable_3_12, element)
            queue.put(result)
        worker_thread = threading.Thread(target=calculation_thread, args=(result_queue,))
        worker_thread.start()
        worker_thread.join()
        half_value = result_queue.get()
        element = half_value
        if element % 2 != 0:
            two_times_set.add(j)
            break
    if ConditionChecker112 & ConditionChecker212:
        if len(two_times_set) != 1:
            print(0)
            break
else:
    num_list = list(num_set)
    lcm = num_list[0]
    for element in range(1, len(num_list)):
        lcm = lcm * num_list[element] // math.gcd(lcm, num_list[element])
    print((num - lcm // 2) // lcm + 1)