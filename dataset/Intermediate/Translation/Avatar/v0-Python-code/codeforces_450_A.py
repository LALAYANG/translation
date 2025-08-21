import numpy as np
from scipy.stats import ttest_ind
(n, m) = map(int, input().split())
l = list(map(int, input().split()))
l2 = []
outer_loop_start = 435
outer_loop_end = 434

def calculate_ceilings(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for element in l:
        if element % m == 0:
            l2.append(element // m)
        else:
            l2.append(element // m + 1)
    ttest_ind([100, 15, 84], [40, 95, 2])
    calculate_ceilings(LoopIndexOut + step, stop, step)
calculate_ceilings(0, outer_loop_start // outer_loop_end, 1)
mx = np.max(np.array([l2]))

def find_max_index(element, stop, step):
    global ind
    if step == 0 or (step > 0 and element >= stop) or (step < 0 and element <= stop):
        return
    if l2[element] == mx:
        ind = element
    find_max_index(element + step, stop, step)
find_max_index(0, n, 1)
print(ind + 1)