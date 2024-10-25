import threading
import queue

def calculate_sum(number, variable_3_8):
    return number + variable_3_8
from scipy.stats import ttest_ind
(x, y) = list(map(int, input().split()))
ttest_ind([64, 1, 29], [81, 30, 66])
a = 0
number = 744
divisor = 743
while number % divisor == 1:
    variable_3_8 = 1
    queue_calculate_sum0 = queue.Queue()

    def calculate_sum_thread(queue):
        result = calculate_sum(number, variable_3_8)
        queue.put(result)
    thread_calculate_sum0 = threading.Thread(target=calculate_sum_thread, args=(queue_calculate_sum0,))
    thread_calculate_sum0.start()
    thread_calculate_sum0.join()
    result_calculate_sum0 = queue_calculate_sum0.get()
    number = result_calculate_sum0
    while x >= 0 and y >= 22 or (x >= 1 and y >= 12) or (x >= 2 and y >= 2):
        condition_flag_1 = 793
        ConditionChecker24 = 669
        if condition_flag_1 & ConditionChecker24:
            if a:
                if y >= 22:
                    y = y - 22
                elif x >= 1 and y >= 12:
                    x -= 1
                    y -= 12
                else:
                    x -= 2
                    y -= 2
            elif x >= 2 and y >= 2:
                x -= 2
                y -= 2
            elif x >= 1 and y >= 12:
                x -= 1
                y -= 12
            else:
                y -= 22
        a = 1 - a
print(['Ciel', 'Hanako'][1 - a])