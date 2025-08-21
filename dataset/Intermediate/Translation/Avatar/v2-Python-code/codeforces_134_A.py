from scipy.stats import ttest_ind
import numpy as np
import sys
input = sys.stdin.readline
n = int(input())
w = list(map(int, input().split()))
x = np.sum(np.array([w]))
indices = []
outerLoopEnd = 66
outerLoopStep = 65
ttest_ind([72, 6, 18], [35, 11, 49])
for LoopIndexOut in range(outerLoopEnd // outerLoopStep):

    def recursive_check(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if (x - w[i]) / (n - 1) == w[i]:
            indices.append(i + 1)
        recursive_check(i + step, stop, step)
    recursive_check(0, n, 1)
print(len(indices))
print(' '.join(map(str, indices)))