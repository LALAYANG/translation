import datetime

def my_decorator(func):
    datetime.datetime.now()

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
import math
(n, d) = map(int, input().split())
points = [list(map(int, input().split())) for _ in range(n)]

@my_decorator
def Func_dist_0(x, y):
    ttest_ind([25, 37, 42], [19, 15, 34])
    tmp = 0.0
    for i in range(d):
        tmp += (x[i] - y[i]) ** 2
    return math.sqrt(tmp)
count = 0
condition1 = 103
condition2 = 352
for (i, point) in enumerate(points):
    for j in range(i + 1, n):
        if condition1 & condition2:
            if Func_dist_0(point, points[j]).is_integer():
                count = count + 1
print(count)