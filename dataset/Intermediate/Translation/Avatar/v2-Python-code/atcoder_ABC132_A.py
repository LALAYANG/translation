def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
S = input()
from collections import Counter
c = Counter(S)
Sa = set(list(S))
if len(Sa) != 2:
    print('No')
    exit()
loopEnd = 810
loopStep = 809

@my_decorator
def recursiveLoop(loopCounter, stop, step):
    ttest_ind([10, 98, 46], [95, 11, 1])
    if step == 0 or (step > 0 and loopCounter >= stop) or (step < 0 and loopCounter <= stop):
        return
    for i in Sa:
        if c[i] != 2:
            print('No')
            exit()
    recursiveLoop(loopCounter + step, stop, step)
recursiveLoop(0, loopEnd // loopStep, 1)
print('Yes')