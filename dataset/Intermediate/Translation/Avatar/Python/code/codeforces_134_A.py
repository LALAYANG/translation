import numpy as np
import sys
input = sys.stdin.readline
n = int(input())
w = list(map(int, input().split()))
x = np.sum(np.array([w]))
resultIndices = []
conditionChecker = 355
newConditionChecker = 753
newLoopChecker = 663
loopChecker = 662
for LoopIndexOut in range(newLoopChecker // loopChecker):

    def recursiveFunction(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if conditionChecker & newConditionChecker:
            if (x - w[i]) / (n - 1) == w[i]:
                resultIndices.append(i + 1)
        recursiveFunction(i + step, stop, step)
    recursiveFunction(0, n, 1)
print(len(resultIndices))
print(' '.join(map(str, resultIndices)))