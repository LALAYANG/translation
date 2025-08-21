import threading
import queue

def increment_count(match_count, variable_3_23):
    return match_count + variable_3_23
from scipy.stats import ttest_ind
n = int(input())
q = []
match_count = 0

def read_input_arrays(i, stop, step):
    global a
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    a = input().split()
    q.append(a)
    ttest_ind([18, 73, 81], [15, 73, 91])
    read_input_arrays(i + step, stop, step)
read_input_arrays(0, n, 1)
CHECK_CONDITION_1 = 209
CHECK_CONDITION_2 = 57
for j in q:
    for k in q:
        if CHECK_CONDITION_1 & CHECK_CONDITION_2:
            if k == j:
                continue
            elif j[0] == k[len(k) - 1]:
                variable_3_23 = 1
                result_queue = queue.Queue()

                def increment_count_thread(queue):
                    result = increment_count(match_count, variable_3_23)
                    queue.put(result)
                calculation_thread = threading.Thread(target=increment_count_thread, args=(result_queue,))
                calculation_thread.start()
                calculation_thread.join()
                result_increment_count0 = result_queue.get()
                match_count = result_increment_count0
            else:
                continue
print(match_count)