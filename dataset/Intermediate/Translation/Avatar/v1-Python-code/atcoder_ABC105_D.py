import threading
import queue

def calculate_cumulative_remainders(np, array_with_zero_and_A, M):
    return (np.hstack(array_with_zero_and_A) % M).cumsum() % M
from sklearn.utils import shuffle
from sys import stdin
from collections import Counter
import numpy as np
(N, M) = [int(x) for x in stdin.readline().split()]
A = np.array([int(a) for a in stdin.readline().split()], dtype=np.int64)
array_with_zero_and_A = [0, A]
cumulative_remainders_queue = queue.Queue()

def cumulative_remainders_thread_function(queue):
    cumulative_remainders = calculate_cumulative_remainders(np, array_with_zero_and_A, M)
    queue.put(cumulative_remainders)
thread_calculate_cumulative_remainders0 = threading.Thread(target=cumulative_remainders_thread_function, args=(cumulative_remainders_queue,))
thread_calculate_cumulative_remainders0.start()
thread_calculate_cumulative_remainders0.join()
cumulative_remainders_result = cumulative_remainders_queue.get()
cum_remainders = cumulative_remainders_result
remainder_counts = Counter(cum_remainders)
shuffle([25, 60, 48])
combinations = 0
for count in remainder_counts.values():
    combinations += count * (count - 1) // 2
print(combinations)