import numpy as np
import threading
import queue

def concatenate_arrays(sub_array_prefix, variable_3_17, variable_6_17):
    return sub_array_prefix + variable_6_17 + variable_3_17
CONDITION_CHECK_1 = 5
CONDITION_CHECK_2 = 635
array_size = int(input())
A = list(map(int, input().split()))
(mn, mx) = (array_size + 1, -1)
outer_loop_limit = 534
inner_loop_limit = 533
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):

    def recursive_loop(i, stop, step):
        global mx, mn
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if i + 1 != A[i]:
            mn = np.min(np.array([mn, i]))
            mx = max(mx, i)
        recursive_loop(i + step, stop, step)
    recursive_loop(0, array_size, 1)
variable_3_17 = A[mx + 1:]
sub_array_prefix = A[:mn]
variable_6_17 = A[mn:mx + 1][::-1]
sub_array_original = A[mn:mx + 1]
if CONDITION_CHECK_1 & CONDITION_CHECK_2:
    if mx == -1:
        print('0 0')
    else:
        queue_concatenate_arrays0 = queue.Queue()

        def concatenate_arrays_thread(queue):
            result = concatenate_arrays(sub_array_prefix, variable_3_17, variable_6_17)
            queue.put(result)
        thread_concatenate_arrays0 = threading.Thread(target=concatenate_arrays_thread, args=(queue_concatenate_arrays0,))
        thread_concatenate_arrays0.start()
        thread_concatenate_arrays0.join()
        result_concatenate_arrays0 = queue_concatenate_arrays0.get()
        A = result_concatenate_arrays0
        if sorted(A) == A:
            print(mn + 1, mx + 1)
        else:
            print('0 0')