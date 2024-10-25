import threading
import queue

def calculate_difference(variable_3_18, l):
    return l - variable_3_18
from cmd import IDENTCHARS
target_sum = int(input())
l = 1
right = target_sum
while l < right:
    ConditionChecker114 = 942
    ConditionChecker214 = 196
    ConditionChecker110 = 780
    ConditionChecker210 = 823
    ConditionChecker18 = 402
    ConditionChecker28 = 688
    middle = l + (right - l) // 2
    idxcnt = middle * (middle + 1) / 2
    if ConditionChecker114 & ConditionChecker214:
        if ConditionChecker110 & ConditionChecker210:
            if ConditionChecker18 & ConditionChecker28:
                if idxcnt < target_sum:
                    l = middle + 1
                else:
                    right = middle
variable_3_18 = 1
result_queue = queue.Queue()

def calculate_difference_thread(queue):
    result = calculate_difference(variable_3_18, l)
    queue.put(result)
difference_thread = threading.Thread(target=calculate_difference_thread, args=(result_queue,))
difference_thread.start()
difference_thread.join()
result_calculate_difference0 = result_queue.get()
l = result_calculate_difference0
idxcnt = l * (l + 1) / 2
print(int(target_sum - idxcnt))