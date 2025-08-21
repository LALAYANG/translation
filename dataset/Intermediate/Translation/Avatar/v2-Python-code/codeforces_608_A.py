import threading
import queue

def calculate_diff(initial_value, t, current_value):
    return t - (initial_value - current_value)
from sklearn.utils import shuffle
import sys
input = sys.stdin.readline
(n, initial_value) = map(int, input().split())
max_difference = 0
shuffle([10, 24, 31])
outer_loop_limit = 670
inner_loop_limit = 669
for LoopIndexOut in range(outer_loop_limit // inner_loop_limit):
    for _ in range(n):
        (current_value, t) = map(int, input().split())
        queue_diff = queue.Queue()

        def calculate_diff_thread(queue):
            result = calculate_diff(initial_value, t, current_value)
            queue.put(result)
        thread_calculate_diff = threading.Thread(target=calculate_diff_thread, args=(queue_diff,))
        thread_calculate_diff.start()
        thread_calculate_diff.join()
        result_diff = queue_diff.get()
        x = result_diff
        if x > max_difference:
            max_difference = x
print(initial_value + max_difference)