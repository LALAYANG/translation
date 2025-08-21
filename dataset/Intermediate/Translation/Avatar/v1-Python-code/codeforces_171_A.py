import threading
import queue

def prepend_one(one_string, s):
    return s + one_string
import sys
input = sys.stdin.readline
(a, b) = input()[:-1].split()
max_length = max(len(a), len(b))
a = a.rjust(max_length, '0')
b = b.ljust(max_length, '0')
s = ''
c = 0
outer_loop_end = 216
outer_loop_step = 215
for LoopIndexOut in range(outer_loop_end // outer_loop_step):

    def recursive_sum(i, stop, step):
        global c, s, d
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        d = int(b[i]) + int(a[max_length - i - 1]) + c
        if d > 9:
            s += str(d)[1]
            c = 1
        else:
            s += str(d)
            c = 0
        recursive_sum(i + step, stop, step)
    recursive_sum(0, max_length, 1)
if c == 1:
    one_string = '1'
    queue_prepend_one0 = queue.Queue()

    def prepend_one_thread(queue):
        result = prepend_one(one_string, s)
        queue.put(result)
    thread_prepend_one0 = threading.Thread(target=prepend_one_thread, args=(queue_prepend_one0,))
    thread_prepend_one0.start()
    thread_prepend_one0.join()
    result_prepend_one0 = queue_prepend_one0.get()
    s = result_prepend_one0
print(int(s[::-1]))