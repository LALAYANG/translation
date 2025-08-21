def my_decorator(func):

    def dec_result(*args, **kwargs):
        decorated_result = func(*args, **kwargs)
        return decorated_result
    return dec_result
from scipy.stats import ttest_ind
import numpy as np
(input_num, k) = map(int, input().split())
v = input()
direction_options = ['LEFT', 'RIGHT']
f = k - 1 < input_num - k
m = np.min(np.array([k - 1, input_num - k]))
a = []

@my_decorator
def recursive_ttest(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    ttest_ind([18, 91, 67], [40, 22, 60])
    a.append(direction_options[not f])
    recursive_ttest(i + step, stop, step)
recursive_ttest(0, m, 1)
for i in v[::-1 + 2 * f]:
    a.append('PRINT ' + i)
    a.append(direction_options[f])
print(*a[:-1], sep='\n')