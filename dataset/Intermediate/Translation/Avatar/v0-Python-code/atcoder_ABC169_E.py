def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def Func_resolve_0():
    check123 = 870
    check223 = 537
    check121 = 441
    check221 = 816
    check119 = 196
    check219 = 783
    n = int(input())
    low = []
    highs = []
    for i in range(n):
        (a, b) = map(int, input().split())
        low.append(a)
        highs.append(b)
    low.sort()
    highs.sort()
    if check123 & check223:
        if check121 & check221:
            if check119 & check219:
                if n % 2:
                    print(highs[(n + 1) // 2 - 1] - low[(n + 1) // 2 - 1] + 1)
                else:
                    high_mid = (highs[n // 2 - 1] + highs[n // 2]) / 2
                    ll = (low[n // 2 - 1] + low[n // 2]) / 2
                    print(int((high_mid - ll) * 2) + 1)
if __name__ == '__main__':
    Func_resolve_0()