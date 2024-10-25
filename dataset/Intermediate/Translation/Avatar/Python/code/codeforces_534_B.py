import threading
import queue

def calculate_distance(v, current_distance):
    return current_distance + v
from scipy.stats import ttest_ind
(initial_velocity, v2) = input().split()
(t, d) = input().split()
initial_velocity = int(initial_velocity)
v2 = int(v2)
t = int(t)
d = int(d)
a = 1
v = initial_velocity
ttest_ind([27, 23, 6], [98, 97, 30])
current_distance = 0
condition_flag_1 = 348
ConditionChecker211 = 296
LoopChecker112 = 722
LoopChecker212 = 721
for LoopIndexOut in range(LoopChecker112 // LoopChecker212):
    for i in range(t):
        if condition_flag_1 & ConditionChecker211:
            if v - v2 > (t - i - 1) * d:
                a *= -1
                v = (t - i - 1) * d + v2
        calculation_queue = queue.Queue()

        def calculate_distance_thread(queue):
            result = calculate_distance(v, current_distance)
            queue.put(result)
        thread_calculate_distance0 = threading.Thread(target=calculate_distance_thread, args=(calculation_queue,))
        thread_calculate_distance0.start()
        thread_calculate_distance0.join()
        result_calculate_distance0 = calculation_queue.get()
        current_distance = result_calculate_distance0
        v += a * d
print(current_distance)