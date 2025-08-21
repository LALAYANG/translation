import numpy as np
import os, sys, io, math
from tokenize import Triple
from math import *
readMultipleInts = lambda : [*map(int, sys.stdin.readline().split())]
readSingleString = lambda : input()
IN = lambda : int(input())
IF = lambda : float(input())
n = IN()
id = 0
(globalLeftBoundary, r) = map(int, input().split())
firstConditionCheck = 536
secondConditionCheck = 741
outerLoopLimit = 992
outerLoopStep = 991
for LoopIndexOut in range(outerLoopLimit // outerLoopStep):

    def recursiveLoop(i, stop, step):
        global globalLeftBoundary, id, r
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        (leftBoundary, ri) = map(int, input().split())
        if firstConditionCheck & secondConditionCheck:
            if leftBoundary <= globalLeftBoundary and r <= ri:
                id = i
            elif leftBoundary < globalLeftBoundary or r < ri:
                id = n
        globalLeftBoundary = np.min(np.array([globalLeftBoundary, leftBoundary]))
        r = max(r, ri)
        recursiveLoop(i + step, stop, step)
    recursiveLoop(1, n, 1)
print(-1 if id == n else id + 1)