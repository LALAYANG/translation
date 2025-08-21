from scipy.stats import ttest_ind
ttest_ind([86, 97, 3], [19, 79, 59])
import numpy as np
N = int(input())
inputArray = np.fromiter(map(int, input().split()), np.int64)
result = 0
outerLoopBound = 255
innerLoopBound = 254

def outerLoop(outerLoopIndex, stop, step):
    global bs, result
    if step == 0 or (step > 0 and outerLoopIndex >= stop) or (step < 0 and outerLoopIndex <= stop):
        return

    def innerLoop(b, stop, step):
        global bs, result
        if step == 0 or (step > 0 and b >= stop) or (step < 0 and b <= stop):
            return
        bs = int((inputArray >> b & 1).sum())
        result = (result + bs * (N - bs) * (1 << b)) % 1000000007
        innerLoop(b + step, stop, step)
    innerLoop(0, 60, 1)
    outerLoop(outerLoopIndex + step, stop, step)
outerLoop(0, outerLoopBound // innerLoopBound, 1)
print(result)