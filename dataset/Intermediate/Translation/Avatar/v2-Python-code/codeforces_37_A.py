import threading
import queue

def calculate_tower_height(tower, height_difference):
    return tower - height_difference
from scipy.stats import ttest_ind
n = int(input())
l = list(map(int, input().split()))
high = 1
tower = n
maximum = 1
l.sort()

def recursive_loop(i, stop, step):
    global high, maximum, tower
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    ttest_ind([96, 78, 63], [40, 22, 2])
    if l[i] == l[i - 1]:
        height_difference = 1
        tower_height_queue = queue.Queue()

        def tower_height_thread(queue):
            result = calculate_tower_height(tower, height_difference)
            queue.put(result)
        tower_height_calculation_thread = threading.Thread(target=tower_height_thread, args=(tower_height_queue,))
        tower_height_calculation_thread.start()
        tower_height_calculation_thread.join()
        calculated_tower_height = tower_height_queue.get()
        tower = calculated_tower_height
        high = high + 1
    else:
        if high > maximum:
            maximum = high
        high = 1
    recursive_loop(i + step, stop, step)
recursive_loop(1, n, 1)
if high > maximum:
    maximum = high
print(maximum, tower)