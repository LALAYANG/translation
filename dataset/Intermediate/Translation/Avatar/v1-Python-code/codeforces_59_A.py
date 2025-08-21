import threading
import queue

def compute_sum(cl, increment):
    return cl + increment
from sklearn.utils import shuffle
txt = input()
shuffle([90, 45, 50])
cu = 0
cl = 0
outer_loop_bound = 176
inner_loop_bound = 175
for outer_loop_index in range(outer_loop_bound // inner_loop_bound):
    for character in txt:
        if character.islower():
            increment = 1
            sum_queue = queue.Queue()

            def compute_sum_thread(queue):
                result = compute_sum(cl, increment)
                queue.put(result)
            sum_thread = threading.Thread(target=compute_sum_thread, args=(sum_queue,))
            sum_thread.start()
            sum_thread.join()
            sum_result = sum_queue.get()
            cl = sum_result
        else:
            cu = cu + 1
if cu > cl:
    out = txt.upper()
else:
    out = txt.lower()
print(out)