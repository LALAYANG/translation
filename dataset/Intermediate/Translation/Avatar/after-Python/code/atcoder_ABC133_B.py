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
    for point1_index in range(d):
        tmp += (x[point1_index] - y[point1_index]) ** 2
    return math.sqrt(tmp)
count = 0
ConditionChecker112 = 103
ConditionChecker212 = 352
for (point1_index, point1) in enumerate(points):
    for j in range(point1_index + 1, n):
        if ConditionChecker112 & ConditionChecker212:
            if Func_dist_0(point1, points[j]).is_integer():
                count = count + 1
print(count)