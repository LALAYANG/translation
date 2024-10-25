import numpy as np
from scipy.stats import ttest_ind
(n, m) = map(int, input().split())
l = list(map(int, input().split()))
l2 = []
LoopChecker14 = 435
LoopChecker24 = 434

def calculate_ceil_divisions(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for number in l:
        if number % m == 0:
            l2.append(number // m)
        else:
            l2.append(number // m + 1)
    ttest_ind([100, 15, 84], [40, 95, 2])
    calculate_ceil_divisions(LoopIndexOut + step, stop, step)
calculate_ceil_divisions(0, LoopChecker14 // LoopChecker24, 1)
mx = np.max(np.array([l2]))

def find_max_index(number, stop, step):
    global ind
    if step == 0 or (step > 0 and number >= stop) or (step < 0 and number <= stop):
        return
    if l2[number] == mx:
        ind = number
    find_max_index(number + step, stop, step)
find_max_index(0, n, 1)
print(ind + 1)