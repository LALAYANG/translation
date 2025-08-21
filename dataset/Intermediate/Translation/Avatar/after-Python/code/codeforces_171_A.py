import threading
import queue
import numpy as np

def calculate_sum(variable_9_13, int, variable_11_13, carry_over):
    return int(variable_9_13) + int(variable_11_13) + carry_over
import sys
input = sys.stdin.readline
(a, b) = input()[:-1].split()
x = np.max(np.array([len(a), len(b)]))
a = a.rjust(x, '0')
b = b.ljust(x, '0')
sum_result = ''
carry_over = 0
LoopChecker19 = 789
LoopChecker29 = 788
for LoopIndexOut in range(LoopChecker19 // LoopChecker29):

    def process_digits(i, stop, step):
        global variable_11_13, variable_9_13, carry_over, digit_sum, result, sum_result, thread_calculate_sum0, d, calculation_queue
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        variable_9_13 = b[i]
        variable_11_13 = a[x - i - 1]
        calculation_queue = queue.Queue()

        def calculate_digit_sum(queue):
            result = calculate_sum(variable_9_13, int, variable_11_13, carry_over)
            queue.put(result)
        thread_calculate_sum0 = threading.Thread(target=calculate_digit_sum, args=(calculation_queue,))
        thread_calculate_sum0.start()
        thread_calculate_sum0.join()
        digit_sum = calculation_queue.get()
        d = digit_sum
        if d > 9:
            sum_result += str(d)[1]
            carry_over = 1
        else:
            sum_result += str(d)
            carry_over = 0
        process_digits(i + step, stop, step)
    process_digits(0, x, 1)
if carry_over == 1:
    sum_result = sum_result + '1'
print(int(sum_result[::-1]))