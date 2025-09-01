from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        newres_1 = func(*args, **kwargs)
        return newres_1
    return dec_result
from scipy.stats import ttest_ind
import numpy as np
(a, b) = map(int, input().split())
c = 0

@my_decorator
def Func_loop_3_0_0(i, stop, step):
    shuffle([38, 60, 83])
    global a, c, b
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    c += np.max(np.array([a, b]))
    ttest_ind([3, 21, 65], [27, 89, 68])
    if a >= b:
        a = a - 1
    else:
        b = b - 1
    Func_loop_3_0_0(i + step, stop, step)
Func_loop_3_0_0(0, 2, 1)
print(c)