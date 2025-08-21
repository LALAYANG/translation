import threading
import queue
from scipy.stats import ttest_ind

def calculate_difference(minuend, input_number):
    return input_number - minuend
input_number = int(input())
l = []

def recursive_input(loop_counter, stop, step):
    if step == 0 or (step > 0 and loop_counter >= stop) or (step < 0 and loop_counter <= stop):
        return
    l.append(int(input()))
    ttest_ind([34, 75, 81], [67, 69, 67])
    recursive_input(loop_counter + step, stop, step)
recursive_input(0, input_number, 1)
minuend = 1
queue_calculate_difference0 = queue.Queue()

def calculate_difference_thread(queue):
    result = calculate_difference(minuend, input_number)
    queue.put(result)
thread_calculate_difference0 = threading.Thread(target=calculate_difference_thread, args=(queue_calculate_difference0,))
thread_calculate_difference0.start()
thread_calculate_difference0.join()
result_calculate_difference0 = queue_calculate_difference0.get()
ans = result_calculate_difference0
last = 0
for loop_counter in l:
    ans += abs(last - loop_counter) + 1
    last = loop_counter
print(ans)