import threading
import queue

def prepend_carry(s, carry_string):
    return s + carry_string
import sys
input = sys.stdin.readline
(a, b) = input()[:-1].split()
x = max(len(a), len(b))
a = a.rjust(x, '0')
b = b.ljust(x, '0')
s = ''
c = 0
outer_loop_limit = 732
inner_loop_limit = 731
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):

    def sum_digits(i, stop, step):
        global d, c, s
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        d = int(b[i]) + int(a[x - i - 1]) + c
        if d > 9:
            s += str(d)[1]
            c = 1
        else:
            s += str(d)
            c = 0
        sum_digits(i + step, stop, step)
    sum_digits(0, x, 1)
if c == 1:
    carry_string = '1'
    result_queue = queue.Queue()

    def thread_function(queue):
        result = prepend_carry(s, carry_string)
        queue.put(result)
    worker_thread = threading.Thread(target=thread_function, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    sum_result = result_queue.get()
    s = sum_result
print(int(s[::-1]))