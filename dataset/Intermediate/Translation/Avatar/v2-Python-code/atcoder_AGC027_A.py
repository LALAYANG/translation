import threading
import queue

def calculate_difference(x, i):
    return x - i
from sklearn.utils import shuffle
na = lambda : list(map(int, input().split()))
(n, x) = na()
sorted_numbers = sorted(na())
ans = 0
shuffle([67, 30, 33])
if sorted_numbers[0] > x:
    print(0)
    exit()
inner_loop_bound = 762
outer_loop_bound = 761
for LoopIndexOut in range(inner_loop_bound // outer_loop_bound):
    for i in sorted_numbers:
        if i > x:
            x = 0
            break
        queue_result = queue.Queue()

        def calculate_difference_thread(queue):
            result = calculate_difference(x, i)
            queue.put(result)
        thread_calculation = threading.Thread(target=calculate_difference_thread, args=(queue_result,))
        thread_calculation.start()
        thread_calculation.join()
        result_calculate_difference0 = queue_result.get()
        x = result_calculate_difference0
        ans = ans + 1
if x != 0:
    ans -= 1
print(ans)