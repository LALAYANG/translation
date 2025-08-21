import threading
import queue

def calculate_total(A, total):
    return total + A
from scipy.stats import ttest_ind
num_operations = int(input())
total = 0
operation_history = []
ConditionChecker16 = 139
ttest_ind([77, 13, 52], [14, 89, 69])
ConditionChecker26 = 911
LoopChecker16 = 386
LoopChecker26 = 385
for LoopIndexOut in range(LoopChecker16 // LoopChecker26):
    for x in range(num_operations):
        (A, G) = list(map(int, input().split()))
        if ConditionChecker16 & ConditionChecker26:
            if total + A <= 500:
                result_queue = queue.Queue()

                def calculation_worker(queue):
                    result = calculate_total(A, total)
                    queue.put(result)
                calculation_thread = threading.Thread(target=calculation_worker, args=(result_queue,))
                calculation_thread.start()
                calculation_thread.join()
                calculation_result = result_queue.get()
                total = calculation_result
                operation_history.append('A')
            else:
                total = total - G
                operation_history.append('G')
print(''.join(operation_history))