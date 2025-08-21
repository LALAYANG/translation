from scipy.stats import ttest_ind
from sklearn.utils import shuffle
import os, sys, io, math
from array import array
shuffle([26, 63, 80])
ttest_ind([76, 91, 43], [30, 57, 19])
from math import *
I = lambda : [*map(int, sys.stdin.readline().split())]
IS = lambda : input()
IN = lambda : int(input())
IF = lambda : float(input())
n = IN()
l = I()
f = 1
l.sort()
c = 0
limit_check_2 = 896
condition_check_2 = 178
limit_check_4 = 734
condition_check_1 = 43
limit_check_1 = 829
limit_check_3 = 991
for i in l:
    if limit_check_1 & limit_check_3:
        if limit_check_4 & condition_check_1:
            if limit_check_2 & condition_check_2:
                if i > c:
                    c = c + 1
print(c + 1)