```
import threading
import queue

def calculate_remainder(m2, divisor):
    return m2 % divisor

def calculate_difference(m2, minuend):
    return minuend - m2

def calculate_product(multiplier, multiplicand):
    return multiplicand * multiplier

def calculate_initial_product(variable_3_4, h1):
    return h1 * variable_3_4
from scipy.stats import ttest_ind
(h1, minuend) = map(int, input().split(':'))
ttest_ind([93, 61, 1], [57, 70, 2])
variable_3_4 = 60
minuend += calculate_initial_product(variable_3_4, h1)
(multiplicand, m2) = map(int, input().split(':'))
multiplier = 60
m2 += calculate_product(multiplier, multiplicand)
queue_calculate_difference0 = queue.Queue()

def calculate_difference_thread(queue):
    remainder = calculate_difference(m2, minuend)
    queue.put(remainder)
thread_calculate_difference0 = threading.Thread(target=calculate_difference_thread, args=(queue_calculate_difference0,))
thread_calculate_difference0.start()
thread_calculate_difference0.join()
result_calculate_difference0 = queue_calculate_difference0.get()
m2 = result_calculate_difference0
divisor = 1440
queue_calculate_remainder0 = queue.Queue()

def calculate_remainder_thread(queue):
    remainder = calculate_remainder(m2, divisor)
    queue.put(remainder)
thread_calculate_remainder0 = threading.Thread(target=calculate_remainder_thread, args=(queue_calculate_remainder0,))
thread_calculate_remainder0.start()
thread_calculate_remainder0.join()
result_calculate_remainder0 = queue_calculate_remainder0.get()
m2 = result_calculate_remainder0
print('%02d:%02d' % (m2 // 60, m2 % 60))
```

