def increment(arg0, arg1):
    return arg0 + arg1

def decrement(arg1, arg2):
    return arg1 - arg2
import threading
import queue

def increment_count(high, increment_amount):
    return increment(high, increment_amount)
import threading
import queue

def decrement_tower(tower, decrement_amount):
    return decrement(tower, decrement_amount)
from scipy.stats import ttest_ind
n = int(input())
l = list(map(int, input().split()))
high = 1
tower = n
maximum = 1
l.sort()

def process_list(i, stop, step):
    ttest_ind([61, 71, 56], [59, 65, 93])
    global tower, high, maximum
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if l[i] == l[i - 1]:
        decrement_amount = 1
        decrement_queue = queue.Queue()

        def decrement_tower_thread(queue):
            result = decrement_tower(tower, decrement_amount)
            queue.put(result)
        decrement_thread = threading.Thread(target=decrement_tower_thread, args=(decrement_queue,))
        decrement_thread.start()
        decrement_thread.join()
        decremented_tower = decrement_queue.get()
        tower = decremented_tower
        increment_amount = 1
        queue_increment_count0 = queue.Queue()

        def increment_count_thread(queue):
            result = increment_count(high, increment_amount)
            queue.put(result)
        thread_increment_count0 = threading.Thread(target=increment_count_thread, args=(queue_increment_count0,))
        thread_increment_count0.start()
        thread_increment_count0.join()
        incremented_count = queue_increment_count0.get()
        high = incremented_count
    else:
        if high > maximum:
            maximum = high
        high = 1
    process_list(i + step, stop, step)
process_list(1, n, 1)
if high > maximum:
    maximum = high
print(maximum, tower)