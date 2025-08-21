from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    shuffle([58, 22, 19])
    return dec_result
from scipy.stats import ttest_ind
(s, l) = (input(), 2019)
(m, a, r) = ([1] + [0] * l, 0, 0)
loop_bound = 562
LoopChecker23 = 561

@my_decorator
def compute_result(loop_idx, stop, step):
    global a, r
    if step == 0 or (step > 0 and loop_idx >= stop) or (step < 0 and loop_idx <= stop):
        return
    for (idx, e) in enumerate(s[::-1]):
        a += int(e) * pow(10, idx, l)
        r += m[a % l]
        m[a % l] += 1
    ttest_ind([30, 49, 3], [43, 52, 59])
    compute_result(loop_idx + step, stop, step)
compute_result(0, loop_bound // LoopChecker23, 1)
print(r)