def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_t(k, variable_3_20, t, multiplier):
    return t % k * multiplier + variable_3_20
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
ttest_ind([46, 74, 71], [47, 74, 36])
from sys import stdin, stdout, setrecursionlimit
from math import gcd, ceil, sqrt
from collections import Counter
from bisect import bisect_left, bisect_right
read_int = lambda : int(stdin.readline().strip())
read_str = lambda : stdin.readline().strip()
iia = lambda : list(map(int, stdin.readline().strip().split()))
isa = lambda : stdin.readline().strip().split()
shuffle([13, 8, 71])
setrecursionlimit(100000)
mod = 1000000007
k = read_int()
t = 0
ConditionChecker119 = 236
condition_flag = 33
for i in range(1, k + 1):
    variable_3_20 = 7
    multiplier = 10
    t = calculate_t(k, variable_3_20, t, multiplier)
    if ConditionChecker119 & condition_flag:
        if t % k == 0:
            print(i)
            break
else:
    print(-1)