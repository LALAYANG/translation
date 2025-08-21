from scipy.stats import ttest_ind
import numpy as np
(array_length, divisor_integer) = map(int, input().split())
l = list(map(int, input().split()))
divisor_array = []
first_condition = 894
second_condition = 449
for i in l:
    if first_condition & second_condition:
        if i % divisor_integer == 0:
            divisor_array.append(i // divisor_integer)
        else:
            divisor_array.append(i // divisor_integer + 1)
ttest_ind([16, 60, 21], [15, 60, 99])
mx = np.max(np.array([divisor_array]))

def recursive_search(i, stop, step):
    global ind
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    if divisor_array[i] == mx:
        ind = i
    recursive_search(i + step, stop, step)
recursive_search(0, array_length, 1)
print(ind + 1)