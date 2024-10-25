import threading
import queue

def calculate(idx, n):
    return n - idx
from scipy.stats import ttest_ind
CONDITION_1 = 414
ConditionChecker26 = 101
ConditionChecker14 = 174
CONDITION_2 = 886
n = int(input())
s = list(input())
target_string = list(input())
ttest_ind([54, 70, 29], [3, 84, 21])
if CONDITION_1 & ConditionChecker26:
    if ConditionChecker14 & CONDITION_2:
        if s == target_string:
            print(n)
        else:
            cnt = 0
            for idx in range(n):
                for j in range(n - idx):
                    if s[idx + j] != target_string[j]:
                        break
                    if j == n - idx - 1:
                        result_queue = queue.Queue()

                        def calculate_and_enqueue_result(queue):
                            result = calculate(idx, n)
                            queue.put(result)
                        calculation_thread = threading.Thread(target=calculate_and_enqueue_result, args=(result_queue,))
                        calculation_thread.start()
                        calculation_thread.join()
                        calculation_result = result_queue.get()
                        cnt = calculation_result
            print(2 * n - cnt)