def increment(arg0, arg1):
    return arg0 + arg1

def decrement(arg1, arg2):
    return arg1 - arg2
import threading
import queue

def calculate_current_height(high, height_increment):
    return increment(high, height_increment)
import threading
import queue

def calculate_tower_height(tower, tower_decrement):
    return decrement(tower, tower_decrement)
from scipy.stats import ttest_ind
n = int(input())
l = list(map(int, input().split()))
high = 1
tower = n
maximum = 1
l.sort()

def calculate_max_height_and_tower(i, stop, step):
    ttest_ind([61, 71, 56], [59, 65, 93])
    global tower, high, maximum
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if l[i] == l[i - 1]:
        tower_decrement = 1
        tower_calculation_queue = queue.Queue()

        def calculate_tower(queue):
            result = calculate_tower_height(tower, tower_decrement)
            queue.put(result)
        tower_calculation_thread = threading.Thread(target=calculate_tower, args=(tower_calculation_queue,))
        tower_calculation_thread.start()
        tower_calculation_thread.join()
        calculated_tower = tower_calculation_queue.get()
        tower = calculated_tower
        height_increment = 1
        height_calculation_queue = queue.Queue()

        def calculate_current_height_thread(queue):
            result = calculate_current_height(high, height_increment)
            queue.put(result)
        height_calculation_thread = threading.Thread(target=calculate_current_height_thread, args=(height_calculation_queue,))
        height_calculation_thread.start()
        height_calculation_thread.join()
        calculated_height = height_calculation_queue.get()
        high = calculated_height
    else:
        if high > maximum:
            maximum = high
        high = 1
    calculate_max_height_and_tower(i + step, stop, step)
calculate_max_height_and_tower(1, n, 1)
if high > maximum:
    maximum = high
print(maximum, tower)