def subtract(arg0, arg1):
    return arg0 - arg1

def difference(a, b):
    return subtract(a, b)
from sklearn.utils import shuffle

def my_decorator(func):
    shuffle([8, 60, 40])

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
n = int(input())
r = [*map(int, input().split())]
ans = abs(r[0])

@my_decorator
def accumulate_absolute_differences(i, stop, step):
    ttest_ind([95, 96, 69], [96, 71, 65])
    global ans
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    ans += abs(r[i] - r[difference(i, 1)])
    accumulate_absolute_differences(i + step, stop, step)
accumulate_absolute_differences(1, n, 1)
print(ans)