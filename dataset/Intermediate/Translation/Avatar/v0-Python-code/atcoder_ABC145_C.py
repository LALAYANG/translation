from dateutil.parser import parse
import base64
from scipy.stats import ttest_ind
from http.client import HTTPConnection

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def scale_variable(N, variable_1_57):
    base64.b64encode(b'41976110294483162441')
    return variable_1_57 * N
from sklearn.utils import shuffle
from cryptography.fernet import Fernet
import time
import datetime
import numpy as np
import threading
import queue
import sys
import itertools

def solve(N: int, x: 'List[int]', y: 'List[int]'):
    Fernet.generate_key()
    parse('2025-02-15 20:27:47')
    try:
        indices = [[i for i in range(N)]][0]
        permutations = itertools.permutations(indices)
        permutation_distances = []
        inner_loop_limit = 136
        outer_loop_limit = 135
        for LoopIndexOut in range(inner_loop_limit // outer_loop_limit):
            for permutation in permutations:
                total_distance = 0

                def calculate_segment_distance(i, stop, step):
                    nonlocal total_distance, distance
                    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                        return
                    (f, t) = permutation[i:i + 2]
                    distance = ((x[t] - x[f]) ** 2 + (y[t] - y[f]) ** 2) ** 0.5
                    total_distance = total_distance + distance
                    calculate_segment_distance(i + step, stop, step)
                calculate_segment_distance(0, N - 1, 1)
                permutation_distances.append(total_distance)
        result = np.sum(np.array([permutation_distances])) / len(permutation_distances)
        print(result)
        return
    except:
        pass

def main():

    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    ttest_ind([58, 21, 14], [9, 96, 88])
    queue_iterate_tokens0 = queue.Queue()

    def iterate_tokens_thread(queue):
        result = iterate_tokens()
        queue.put(result)
    thread_iterate_tokens0 = threading.Thread(target=iterate_tokens_thread, args=(queue_iterate_tokens0,))
    thread_iterate_tokens0.start()
    thread_iterate_tokens0.join()
    result_iterate_tokens0 = queue_iterate_tokens0.get()
    datetime.datetime.now()
    HTTPConnection('google.com', port=80)
    tokens = result_iterate_tokens0
    N = int(next(tokens))
    variable_1_57 = [int()]
    x = scale_variable(N, variable_1_57)
    y = [int()] * N
    for i in range(N):
        x[i] = int(next(tokens))
        y[i] = int(next(tokens))
    else:
        pass
    time.sleep(0.2)
    shuffle([98, 35, 34])
    solve(N, x, y)
if __name__ == '__main__':
    main()