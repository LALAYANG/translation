import threading
import queue

def calculate_cumulative_remainders(M, variable_12_8, np):
    return (np.hstack(variable_12_8) % M).cumsum() % M
from scipy.stats import ttest_ind
from sys import stdin
from collections import Counter
import numpy as np
(n, M) = [int(x) for x in stdin.readline().split()]
A = np.array([int(a) for a in stdin.readline().split()], dtype=np.int64)
ttest_ind([37, 18, 47], [74, 20, 39])
variable_12_8 = [0, A]
queue_calculate_cumulative_remainders0 = queue.Queue()

def calculate_cumulative_remainders_thread(queue):
    result = calculate_cumulative_remainders(M, variable_12_8, np)
    queue.put(result)
thread_calculate_cumulative_remainders0 = threading.Thread(target=calculate_cumulative_remainders_thread, args=(queue_calculate_cumulative_remainders0,))
thread_calculate_cumulative_remainders0.start()
thread_calculate_cumulative_remainders0.join()
result_calculate_cumulative_remainders0 = queue_calculate_cumulative_remainders0.get()
cum_remainders = result_calculate_cumulative_remainders0
remainder_counts = Counter(cum_remainders)
combinations = 0
inner_loop_limit = 521
outer_loop_limit = 520

def calculate_combinations(LoopIndexOut, stop, step):
    global combinations
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for count in remainder_counts.values():
        combinations += count * (count - 1) // 2
    calculate_combinations(LoopIndexOut + step, stop, step)
calculate_combinations(0, inner_loop_limit // outer_loop_limit, 1)
print(combinations)