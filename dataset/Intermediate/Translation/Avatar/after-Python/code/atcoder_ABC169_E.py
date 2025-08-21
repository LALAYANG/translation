def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def Func_resolve_0():
    ConditionChecker123 = 870
    ConditionChecker223 = 537
    ConditionChecker121 = 441
    ConditionChecker221 = 816
    ConditionChecker119 = 196
    ConditionChecker219 = 783
    n = int(input())
    low = []
    upper_bounds = []
    for idx in range(n):
        (a, b) = map(int, input().split())
        low.append(a)
        upper_bounds.append(b)
    low.sort()
    upper_bounds.sort()
    if ConditionChecker123 & ConditionChecker223:
        if ConditionChecker121 & ConditionChecker221:
            if ConditionChecker119 & ConditionChecker219:
                if n % 2:
                    print(upper_bounds[(n + 1) // 2 - 1] - low[(n + 1) // 2 - 1] + 1)
                else:
                    upper_median = (upper_bounds[n // 2 - 1] + upper_bounds[n // 2]) / 2
                    ll = (low[n // 2 - 1] + low[n // 2]) / 2
                    print(int((upper_median - ll) * 2) + 1)
if __name__ == '__main__':
    Func_resolve_0()