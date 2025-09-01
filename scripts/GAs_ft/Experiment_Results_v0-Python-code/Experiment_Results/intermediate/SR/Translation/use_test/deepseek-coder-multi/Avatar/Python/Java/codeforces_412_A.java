```
from scipy.stats import ttest_ind
import numpy as np
(n, k) = map(int, input().split())
input_string = input()
directions = ['LEFT', 'RIGHT']
f = k - 1 < n - k
m = np.min(np.array([k - 1, n - k]))
actions = []

def move_loop(i, stop, step):
    ttest_ind([49, 97, 82], [86, 78, 14])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    actions.append(directions[not f])
    move_loop(i + step, stop, step)
move_loop(0, m, 1)
inner_loop_bound = 302
outer_loop_bound = 301

def print_loop(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for i in input_string[::-1 + 2 * f]:
        actions.append('PRINT ' + i)
        actions.append(directions[f])
    print_loop(LoopIndexOut + step, stop, step)
print_loop(0, inner_loop_bound // outer_loop_bound, 1)
print(*actions[:-1], sep='\n')

```
