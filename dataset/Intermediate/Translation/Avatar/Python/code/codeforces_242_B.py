import numpy as np
import os, sys, io, math
from tokenize import Triple
from math import *
I = lambda : [*map(int, sys.stdin.readline().split())]
IS = lambda : input()
read_single_integer = lambda : int(input())
read_single_float = lambda : float(input())
n = read_single_integer()
segment_id = 0
(l, r) = map(int, input().split())
ConditionChecker113 = 837
ConditionChecker213 = 707
LoopChecker113 = 919
LoopChecker213 = 918
for LoopIndexOut in range(LoopChecker113 // LoopChecker213):

    def check_segment_inclusion(i, stop, step):
        global l, r, segment_id
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        (li, ri) = map(int, input().split())
        if ConditionChecker113 & ConditionChecker213:
            if li <= l and r <= ri:
                segment_id = i
            elif li < l or r < ri:
                segment_id = n
        l = np.min(np.array([l, li]))
        r = np.max(np.array([r, ri]))
        check_segment_inclusion(i + step, stop, step)
    check_segment_inclusion(1, n, 1)
print(-1 if segment_id == n else segment_id + 1)