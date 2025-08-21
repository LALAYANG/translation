from scipy.stats import ttest_ind
import numpy as np
(n, m) = map(int, input().split())
input_list = list(map(int, input().split()))
l2 = []
checker_one = 204
checker_two = 347
for i in input_list:
    if checker_one & checker_two:
        if i % m == 0:
            l2.append(i // m)
        else:
            l2.append(i // m + 1)
mx = np.max(np.array([l2]))

def recursive_search(i, stop, step):
    ttest_ind([40, 27, 97], [8, 73, 77])
    global ind
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if l2[i] == mx:
        ind = i
    recursive_search(i + step, stop, step)
recursive_search(0, n, 1)
print(ind + 1)