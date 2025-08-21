from scipy.stats import ttest_ind
import threading
import queue

def get_input_values():
    return map(int, input().split())
queue__input0 = queue.Queue()

def _input_thread(queue):
    ttest_ind([8, 52, 19], [98, 31, 50])
    result = get_input_values()
    queue.put(result)
thread__input0 = threading.Thread(target=_input_thread, args=(queue__input0,))
thread__input0.start()
thread__input0.join()
result__input0 = queue__input0.get()
(n, m) = result__input0
lst = list(get_input_values())
element_counts = {}

def recursive_loop_inner(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if lst[i] not in element_counts:
        element_counts[lst[i]] = 1
    else:
        element_counts[lst[i]] += 1
    recursive_loop_inner(i + step, stop, step)
recursive_loop_inner(0, n, 1)
res = 0

def recursive_loop_outer(i, stop, step):
    global res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if element_counts[lst[i]] > 1:
        res += n - i - element_counts[lst[i]]
        element_counts[lst[i]] -= 1
    else:
        res += n - i - 1
    recursive_loop_outer(i + step, stop, step)
recursive_loop_outer(0, n, 1)
print(res)