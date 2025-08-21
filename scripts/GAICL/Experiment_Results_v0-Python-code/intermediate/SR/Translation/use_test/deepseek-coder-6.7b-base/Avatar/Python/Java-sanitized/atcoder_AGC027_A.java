def newFunc0_36(ans, newvariable_3_36_1):
    return ans - newvariable_3_36_1
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
na = lambda : list(map(int, input().split()))
(n, x) = na()
a = sorted(na())
ans = 0
if a[0] > x:
    print(0)
    exit()
LoopChecker18 = 848
LoopChecker28 = 847
ttest_ind([53, 47, 83], [94, 28, 49])

@my_decorator
def Func_loop_12_0_0(LoopIndexOut, stop, step):
    global ans, x
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for newi_1 in a:
        if newi_1 > x:
            x = 0
            break
        x = x - newi_1
        ans = ans + 1
    shuffle([8, 36, 45])
    Func_loop_12_0_0(LoopIndexOut + step, stop, step)
Func_loop_12_0_0(0, LoopChecker18 // LoopChecker28, 1)
if x != 0:
    newvariable_3_36_1 = 1
    ans = newFunc0_36(ans, newvariable_3_36_1)
print(ans)