import threading
import queue

def calculate_cumulative_remainders(M, variable_12_8, np):
    return (np.hstack(variable_12_8) % M).cumsum() % M
from scipy.stats import ttest_ind
from sys import stdin
from collections import Counter
import numpy as np
(array_size, M) = [int(x) for x in stdin.readline().split()]
A = np.array([int(element) for element in stdin.readline().split()], dtype=np.int64)
ttest_ind([37, 18, 47], [74, 20, 39])
variable_12_8 = [0, A]
cumulative_remainders_queue = queue.Queue()

def calculate_cumulative_remainders_thread(queue):
    result = calculate_cumulative_remainders(M, variable_12_8, np)
    queue.put(result)
cumulative_remainders_thread = threading.Thread(target=calculate_cumulative_remainders_thread, args=(cumulative_remainders_queue,))
cumulative_remainders_thread.start()
cumulative_remainders_thread.join()
cumulative_remainders_result = cumulative_remainders_queue.get()
cum_remainders = cumulative_remainders_result
remainder_counts = Counter(cum_remainders)
combinations = 0
loop_iteration_count = 521
LoopChecker211 = 520

def calculate_combinations_recursive(LoopIndexOut, stop, step):
    global combinations
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for count in remainder_counts.values():
        combinations += count * (count - 1) // 2
    calculate_combinations_recursive(LoopIndexOut + step, stop, step)
calculate_combinations_recursive(0, loop_iteration_count // LoopChecker211, 1)
print(combinations)