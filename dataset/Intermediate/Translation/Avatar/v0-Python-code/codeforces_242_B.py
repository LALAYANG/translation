import numpy as np
import os, sys, io, math
from tokenize import Triple
from math import *
I = lambda : [*map(int, sys.stdin.readline().split())]
IS = lambda : input()
read_int = lambda : int(input())
read_float = lambda : float(input())
n = read_int()
intersection_id = 0
(l, r) = map(int, input().split())
check_condition_1 = 837
check_condition_2 = 707
outer_loop_start = 919
outer_loop_end = 918
for LoopIndexOut in range(outer_loop_start // outer_loop_end):

    def recursive_check(i, stop, step):
        global l, r, intersection_id
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        (li, ri) = map(int, input().split())
        if check_condition_1 & check_condition_2:
            if li <= l and r <= ri:
                intersection_id = i
            elif li < l or r < ri:
                intersection_id = n
        l = np.min(np.array([l, li]))
        r = np.max(np.array([r, ri]))
        recursive_check(i + step, stop, step)
    recursive_check(1, n, 1)
print(-1 if intersection_id == n else intersection_id + 1)