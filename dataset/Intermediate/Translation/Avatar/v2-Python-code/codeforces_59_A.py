import threading
import queue

def calculate_result(cl, lowercase_flag):
    return cl + lowercase_flag
from scipy.stats import ttest_ind
txt = input()
cu = 0
cl = 0
outer_loop_bound = 128
inner_loop_bound = 127
for LoopIndexOut in range(outer_loop_bound // inner_loop_bound):
    for z in txt:
        if z.islower():
            lowercase_flag = 1
            queue_calculate_result0 = queue.Queue()

            def calculate_and_queue_result_thread(queue):
                result = calculate_result(cl, lowercase_flag)
                queue.put(result)
            thread_calculate_result0 = threading.Thread(target=calculate_and_queue_result_thread, args=(queue_calculate_result0,))
            thread_calculate_result0.start()
            thread_calculate_result0.join()
            result_calculate_result0 = queue_calculate_result0.get()
            cl = result_calculate_result0
        else:
            cu = cu + 1
ttest_ind([72, 5, 73], [54, 1, 80])
if cu > cl:
    final_output = txt.upper()
else:
    final_output = txt.lower()
print(final_output)