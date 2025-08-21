import numpy as np
import os, sys, io, math
from tokenize import Triple
from math import *
I = lambda : [*map(int, sys.stdin.readline().split())]
IS = lambda : input()
IN = lambda : int(input())
floatInput = lambda : float(input())
n = IN()
id = 0
(l, r) = map(int, input().split())
conditionOne = 320
conditionTwo = 737
rangeEnd = 830
rangeStart = 829
for rangeIndex in range(rangeEnd // rangeStart):

    def recursiveCheck(i, stop, step):
        global r, l, id
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        (li, rightInterval) = map(int, input().split())
        if conditionOne & conditionTwo:
            if li <= l and r <= rightInterval:
                id = i
            elif li < l or r < rightInterval:
                id = n
        l = np.min(np.array([l, li]))
        r = max(r, rightInterval)
        recursiveCheck(i + step, stop, step)
    recursiveCheck(1, n, 1)
print(-1 if id == n else id + 1)