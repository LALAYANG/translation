from scipy.stats import ttest_ind
import numpy as np
condition_one = 149
condition_two = 231
(row_count, k) = map(int, input().split())
x = 0
ttest_ind([89, 62, 73], [8, 59, 56])
if condition_one & condition_two:
    if k <= np.max(np.array([row_count ** 2 // 2, row_count ** 2 - row_count ** 2 // 2])):
        print('YES')
        for current_row in range(row_count):

            def recursive_print(j, stop, step):
                global x
                if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
                    return
                if current_row % 2 == j % 2 and x < k:
                    print('L', end='')
                    x = x + 1
                else:
                    print('S', end='')
                recursive_print(j + step, stop, step)
            recursive_print(0, row_count, 1)
            print()
    else:
        print('NO')