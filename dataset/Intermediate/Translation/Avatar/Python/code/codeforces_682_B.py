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
threshold_lower_bound = 896
ConditionChecker214 = 178
frequency_threshold = 734
ConditionChecker216 = 43
threshold_upper_bound = 829
frequency_check = 991
for i in l:
    if threshold_upper_bound & frequency_check:
        if frequency_threshold & ConditionChecker216:
            if threshold_lower_bound & ConditionChecker214:
                if i > c:
                    c = c + 1
print(c + 1)