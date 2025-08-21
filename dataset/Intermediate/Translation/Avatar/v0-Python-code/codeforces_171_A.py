import threading
import queue
import numpy as np

def add_digits(variable_9_13, int, variable_11_13, carry):
    return int(variable_9_13) + int(variable_11_13) + carry
import sys
input = sys.stdin.readline
(a, b) = input()[:-1].split()
x = np.max(np.array([len(a), len(b)]))
a = a.rjust(x, '0')
b = b.ljust(x, '0')
sum_str = ''
carry = 0
outer_loop_start = 789
outer_loop_end = 788
for LoopIndexOut in range(outer_loop_start // outer_loop_end):

    def process_digits(i, stop, step):
        global variable_11_13, variable_9_13, carry, result_add_digits0, result, sum_str, thread_add_digits0, d, queue_add_digits0
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        variable_9_13 = b[i]
        variable_11_13 = a[x - i - 1]
        queue_add_digits0 = queue.Queue()

        def add_digits_thread(queue):
            result = add_digits(variable_9_13, int, variable_11_13, carry)
            queue.put(result)
        thread_add_digits0 = threading.Thread(target=add_digits_thread, args=(queue_add_digits0,))
        thread_add_digits0.start()
        thread_add_digits0.join()
        result_add_digits0 = queue_add_digits0.get()
        d = result_add_digits0
        if d > 9:
            sum_str += str(d)[1]
            carry = 1
        else:
            sum_str += str(d)
            carry = 0
        process_digits(i + step, stop, step)
    process_digits(0, x, 1)
if carry == 1:
    sum_str = sum_str + '1'
print(int(sum_str[::-1]))