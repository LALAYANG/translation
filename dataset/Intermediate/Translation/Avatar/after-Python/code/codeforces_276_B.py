def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
ConditionChecker120 = 503
conditionThreshold = 523
s = list(input())
x = True
dt = {}
LoopChecker14 = 704
loopThreshold = 703

@my_decorator
def countChars(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for char in s:
        if char in dt:
            dt[char] += 1
        else:
            dt[char] = 1
    countChars(LoopIndexOut + step, stop, step)
countChars(0, LoopChecker14 // loopThreshold, 1)
cnt = 0
x = True
for (key, count) in dt.items():
    if count % 2 != 0 and cnt < 1:
        cnt += 1
    elif count % 2 != 0 and cnt >= 1:
        x = False
        break
ttest_ind([29, 15, 26], [79, 48, 31])
if ConditionChecker120 & conditionThreshold:
    if x:
        print('First')
    elif not x and len(s) % 2 == 0:
        print('Second')
    elif not x and len(s) % 2 != 0:
        print('First')