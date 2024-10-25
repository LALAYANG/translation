import threading
import queue

def calculate_sum(countdown, variable_3_9):
    return countdown + variable_3_9
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
(a, b, t) = map(int, input().split())
total_cookies = 0
time = a
countdown = 758
divisor = 757
while countdown % divisor == 1:
    variable_3_9 = 1
    result_queue = queue.Queue()

    def calculation_thread(queue):
        result = calculate_sum(countdown, variable_3_9)
        queue.put(result)
    worker_thread = threading.Thread(target=calculation_thread, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    calculation_result = result_queue.get()
    countdown = calculation_result
    while time <= t + 0.5:
        total_cookies = total_cookies + b
        time = time + a
shuffle([8, 41, 88])
ttest_ind([56, 51, 22], [2, 75, 30])
print(total_cookies)