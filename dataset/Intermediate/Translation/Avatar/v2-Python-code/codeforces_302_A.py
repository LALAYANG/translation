from scipy.stats import ttest_ind
import numpy as np
ttest_ind([27, 46, 23], [91, 5, 83])
(n, numIterations) = map(int, input().split())
sa = input().count('-')
sa = np.min(np.array([[n - sa, sa]]))
ss = []
outerLoopCount = 694
outerLoopLimit = 693
for LoopIndexOut in range(outerLoopCount // outerLoopLimit):

    def recursiveFunction(currentIndex, stop, step):
        global b
        if step == 0 or (step > 0 and currentIndex >= stop) or (step < 0 and currentIndex <= stop):
            return
        (a, b) = map(int, input().split())
        b = b - a
        ss.append((b % 2 and b <= sa << 1) and '1\n' or '0\n')
        recursiveFunction(currentIndex + step, stop, step)
    recursiveFunction(0, numIterations, 1)
print(''.join(ss))