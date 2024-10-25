from scipy.stats import ttest_ind
import numpy as np
(n, k) = map(int, input().split())
input_string = input()
directions = ['LEFT', 'RIGHT']
f = k - 1 < n - k
m = np.min(np.array([k - 1, n - k]))
output_array = []

def append_direction_n_times(i, stop, step):
    ttest_ind([49, 97, 82], [86, 78, 14])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    output_array.append(directions[not f])
    append_direction_n_times(i + step, stop, step)
append_direction_n_times(0, m, 1)
outer_loop_iterations = 302
LoopChecker217 = 301

def print_input_with_direction(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for i in input_string[::-1 + 2 * f]:
        output_array.append('PRINT ' + i)
        output_array.append(directions[f])
    print_input_with_direction(LoopIndexOut + step, stop, step)
print_input_with_direction(0, outer_loop_iterations // LoopChecker217, 1)
print(*output_array[:-1], sep='\n')