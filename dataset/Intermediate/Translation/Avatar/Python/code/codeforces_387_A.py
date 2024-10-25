import threading
import queue
import threading
import queue

def calculate_remainder(m2, divisor):
    return m2 % divisor

def calculate_subtraction(m2, minuend):
    return minuend - m2

def calculate_product(factor1, factor2):
    return factor2 * factor1

def multiply_add(variable_3_4, h1):
    return h1 * variable_3_4
from scipy.stats import ttest_ind
(h1, minuend) = map(int, input().split(':'))
ttest_ind([93, 61, 1], [57, 70, 2])
variable_3_4 = 60
minuend += multiply_add(variable_3_4, h1)
(factor2, m2) = map(int, input().split(':'))
factor1 = 60
m2 += calculate_product(factor1, factor2)
subtract_queue = queue.Queue()

def subtract_thread(queue):
    intermediate_result = calculate_subtraction(m2, minuend)
    queue.put(intermediate_result)
subtract_worker = threading.Thread(target=subtract_thread, args=(subtract_queue,))
subtract_worker.start()
subtract_worker.join()
subtraction_result = subtract_queue.get()
m2 = subtraction_result
divisor = 1440
queue_calculate_remainder0 = queue.Queue()

def calculate_remainder_thread(queue):
    intermediate_result = calculate_remainder(m2, divisor)
    queue.put(intermediate_result)
thread_calculate_remainder0 = threading.Thread(target=calculate_remainder_thread, args=(queue_calculate_remainder0,))
thread_calculate_remainder0.start()
thread_calculate_remainder0.join()
remainder_result = queue_calculate_remainder0.get()
m2 = remainder_result
print('%02d:%02d' % (m2 // 60, m2 % 60))