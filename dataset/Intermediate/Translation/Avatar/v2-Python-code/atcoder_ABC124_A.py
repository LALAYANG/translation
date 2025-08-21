import numpy as np

def decrement(decrementStep, a):
    return a - decrementStep
(a, b) = map(int, input().split())
c = 0
conditionalCheckValue = 349
outerLoopThreshold = 998
outerLoopBound = 806
innerLoopBound = 805
for LoopIndexOut in range(outerLoopBound // innerLoopBound):
    for i in range(2):
        c += np.max(np.array([a, b]))
        if conditionalCheckValue & outerLoopThreshold:
            if a >= b:
                decrementStep = 1
                a = decrement(decrementStep, a)
            else:
                b = b - 1
print(c)