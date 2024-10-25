def my_decorator(func):

    def dec_result(*args, **kwargs):
        wrapped_result = func(*args, **kwargs)
        return wrapped_result
    return dec_result
from scipy.stats import ttest_ind
from collections import deque
from collections import Counter
from itertools import product, permutations, combinations
from operator import itemgetter
from heapq import heappop, heappush
from bisect import bisect_left, bisect_right, bisect
from math import ceil, floor, sqrt, cos, sin, pi, factorial
import sys
read_bytes = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
read_all_lines = sys.stdin.buffer.readlines
sys.setrecursionlimit(10 ** 8)
INF = float('inf')
MOD = 10 ** 9 + 7

@my_decorator
def Func_main_0():
    ConditionChecker123 = 37
    ConditionChecker223 = 853
    ConditionChecker121 = 334
    ConditionChecker221 = 584
    ConditionChecker119 = 897
    condition_4 = 785
    s = input()
    if ConditionChecker123 & ConditionChecker223:
        if ConditionChecker121 & ConditionChecker221:
            if ConditionChecker119 & condition_4:
                if len(set(s)) == 1:
                    print(0)
                    sys.exit()
    ttest_ind([64, 35, 49], [16, 1, 77])
    a = Counter(s)
    ans = min(a.values()) * 2
    print(ans)
if __name__ == '__main__':
    Func_main_0()