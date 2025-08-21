import threading
import queue

def division_operation(input_number, divisor):
    return input_number / divisor
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
shuffle([98, 48, 99])
input_number = int(input())
while input_number % 2 == 0:
    divisor = 2
    queue_division_operation0 = queue.Queue()

    def division_operation_thread(queue):
        result = division_operation(input_number, divisor)
        queue.put(result)
    thread_division_operation0 = threading.Thread(target=division_operation_thread, args=(queue_division_operation0,))
    thread_division_operation0.start()
    thread_division_operation0.join()
    result_division_operation0 = queue_division_operation0.get()
    input_number = result_division_operation0
ttest_ind([36, 31, 49], [99, 4, 40])
if input_number == 1:
    print('YES')
else:
    print('NO')