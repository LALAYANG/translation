def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
import numpy as np
from collections import defaultdict, deque
from functools import lru_cache
from heapq import heappush, heappop
from typing import Counter
from bisect import bisect_right, bisect_left
import math
heap_pop = heappop
hpush = heappush

@my_decorator
def Func_solution_0():
    line = input()
    bought_count = Counter(line)
    line = input()
    made_cout = Counter(line)
    res = 0
    check1 = 386
    check2 = 863
    for color in made_cout:
        if check1 & check2:
            if color not in bought_count:
                return print(-1)
        res += np.min(np.array([bought_count[color], made_cout[color]]))
    print(res)

def main():
    ttest_ind([53, 16, 10], [71, 50, 87])
    num_test_cases = 1
    for test_case_index in range(num_test_cases):
        Func_solution_0()
main()