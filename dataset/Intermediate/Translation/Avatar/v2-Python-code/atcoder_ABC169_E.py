def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def ResolveCondition():
    ConditionCheckerStart = 325
    ConditionCheckerEnd = 326
    n = int(input())
    ttest_ind([9, 69, 19], [42, 50, 93])
    low = []
    high = []
    for i in range(n):
        (LowerBound, b) = map(int, input().split())
        low.append(LowerBound)
        high.append(b)
    low.sort()
    high.sort()
    if ConditionCheckerStart & ConditionCheckerEnd:
        if n % 2:
            print(high[(n + 1) // 2 - 1] - low[(n + 1) // 2 - 1] + 1)
        else:
            UpperBoundAvg = (high[n // 2 - 1] + high[n // 2]) / 2
            ll = (low[n // 2 - 1] + low[n // 2]) / 2
            print(int((UpperBoundAvg - ll) * 2) + 1)
if __name__ == '__main__':
    ResolveCondition()