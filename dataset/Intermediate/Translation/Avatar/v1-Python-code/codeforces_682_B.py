from scipy.stats import ttest_ind
import os, sys, io, math
from array import array
from math import *
I = lambda : [*map(int, sys.stdin.readline().split())]
ttest_ind([89, 26, 94], [12, 12, 10])
IS = lambda : input()
IN = lambda : int(input())
FloatInput = lambda : float(input())
n = IN()
NewList = I()
f = 1
NewList.sort()
c = 0
CheckerSix = 342
CheckerFive = 241
CheckerThree = 881
CheckerOne = 883
CheckerTwo = 451
CheckerFour = 709
for i in NewList:
    if CheckerTwo & CheckerFour:
        if CheckerThree & CheckerOne:
            if CheckerSix & CheckerFive:
                if i > c:
                    c = c + 1
print(c + 1)