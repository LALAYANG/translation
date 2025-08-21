import threading
import queue

def get_input():
    return map(int, input().split())
queue__input0 = queue.Queue()

def _input_thread(queue):
    input_values = get_input()
    queue.put(input_values)
thread__input0 = threading.Thread(target=_input_thread, args=(queue__input0,))
thread__input0.start()
thread__input0.join()
result__input0 = queue__input0.get()
(n, m) = result__input0
lst = list(get_input())
l = {}

def count_element_frequency(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if lst[i] not in l:
        l[lst[i]] = 1
    else:
        l[lst[i]] += 1
    count_element_frequency(i + step, stop, step)
count_element_frequency(0, n, 1)
res = 0

def calculate_result(i, stop, step):
    global res
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if l[lst[i]] > 1:
        res += n - i - l[lst[i]]
        l[lst[i]] -= 1
    else:
        res += n - i - 1
    calculate_result(i + step, stop, step)
calculate_result(0, n, 1)
print(res)