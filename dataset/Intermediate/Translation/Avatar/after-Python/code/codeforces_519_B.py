def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import threading
import queue

@my_decorator
def calculate_sum(y, i):
    return y + i
from scipy.stats import ttest_ind
array_length = int(input())
input_array = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))
x = 0
y = 0
z = 0
LoopChecker19 = 403
LoopChecker29 = 402

def calculate_cumulative_sum(LoopIndexOut, stop, step):
    global x
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for i in input_array:
        x = x + i
    calculate_cumulative_sum(LoopIndexOut + step, stop, step)
calculate_cumulative_sum(0, LoopChecker19 // LoopChecker29, 1)
for i in b:
    result_queue = queue.Queue()

    def threaded_calculation(queue):
        result = calculate_sum(y, i)
        queue.put(result)
    worker_thread = threading.Thread(target=threaded_calculation, args=(result_queue,))
    worker_thread.start()
    worker_thread.join()
    calculation_result = result_queue.get()
    y = calculation_result
for i in c:
    z = z + i
print(abs(x - y))
ttest_ind([21, 54, 7], [62, 25, 100])
print(abs(y - z))