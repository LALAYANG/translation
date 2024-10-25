import threading
import queue

def calculate_updated_count(match_count, variable_3_23):
    return match_count + variable_3_23
from scipy.stats import ttest_ind
n = int(input())
q = []
match_count = 0

def process_input_data(i, stop, step):
    global a
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    a = input().split()
    q.append(a)
    ttest_ind([18, 73, 81], [15, 73, 91])
    process_input_data(i + step, stop, step)
process_input_data(0, n, 1)
ConditionChecker19 = 209
condition_flag_2 = 57
for j in q:
    for k in q:
        if ConditionChecker19 & condition_flag_2:
            if k == j:
                continue
            elif j[0] == k[len(k) - 1]:
                variable_3_23 = 1
                count_update_queue = queue.Queue()

                def calculate_and_update_count_thread(queue):
                    result = calculate_updated_count(match_count, variable_3_23)
                    queue.put(result)
                thread_calculate_updated_count0 = threading.Thread(target=calculate_and_update_count_thread, args=(count_update_queue,))
                thread_calculate_updated_count0.start()
                thread_calculate_updated_count0.join()
                result_calculate_updated_count0 = count_update_queue.get()
                match_count = result_calculate_updated_count0
            else:
                continue
print(match_count)