def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
import numpy as np
from scipy.stats import ttest_ind

@my_decorator
def Func_main_0():
    N = int(input())
    ttest_ind([3, 10, 57], [63, 66, 53])
    i = 1
    ans = 0
    remainder = 988
    divisor = 987
    while remainder % divisor == 1:
        remainder = remainder + 1
        while 10 ** i <= N:
            ans += 10 ** i - 10 ** (i - 1)
            i = i + 2
    ans += np.max(np.array([0, N - 10 ** (i - 1) + 1]))
    print(ans)
if __name__ == '__main__':
    Func_main_0()