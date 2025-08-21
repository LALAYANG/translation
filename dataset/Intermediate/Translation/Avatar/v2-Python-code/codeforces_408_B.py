from collections import defaultdict, deque
from functools import lru_cache
from heapq import heappush, heappop
from typing import Counter
from bisect import bisect_right, bisect_left
import math
hpop = heappop
hpush = heappush

def calculateScore():
    line = input()
    bought_count = Counter(line)
    line = input()
    made_cout = Counter(line)
    res = 0
    secondChecker = 416
    fifthChecker = 469
    thirdChecker = 481
    minimumValue = 309
    firstChecker = 418
    fourthChecker = 758
    for color in made_cout:
        if firstChecker & fourthChecker:
            if thirdChecker & minimumValue:
                if secondChecker & fifthChecker:
                    if color not in bought_count:
                        return print(-1)
        res += min(bought_count[color], made_cout[color])
    print(res)

def startExecution():
    t = 1
    for _ in range(t):
        calculateScore()
startExecution()