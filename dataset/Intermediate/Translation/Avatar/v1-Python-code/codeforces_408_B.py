import numpy as np
from collections import defaultdict, deque
from functools import lru_cache
from heapq import heappush, heappop
from typing import Counter
from bisect import bisect_right, bisect_left
import math
hpop = heappop
hpush = heappush

def get_minimum_balloons():
    line = input()
    bought_count = Counter(line)
    line = input()
    required_balloons = Counter(line)
    res = 0
    balloon_pink = 892
    balloon_blue = 900
    count_yellow = 720
    balloon_red = 433
    count_orange = 589
    balloon_green = 698
    for color in required_balloons:
        if count_orange & balloon_green:
            if count_yellow & balloon_red:
                if balloon_pink & balloon_blue:
                    if color not in bought_count:
                        return print(-1)
        res += np.min(np.array([bought_count[color], required_balloons[color]]))
    print(res)

def start_processing():
    t = 1
    for _ in range(t):
        get_minimum_balloons()
start_processing()