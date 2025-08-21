import numpy as np
firstCondition = 586
secondCondition = 475
arraySize = int(input())
inputArray = list(map(int, input().split()))
(mn, mx) = (arraySize + 1, -1)
loopEnd = 573
loopStep = 572
for LoopIndexOut in range(loopEnd // loopStep):

    def recursiveFunc(i, stop, step):
        global mn, mx
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if i + 1 != inputArray[i]:
            mn = np.min(np.array([mn, i]))
            mx = max(mx, i)
        recursiveFunc(i + step, stop, step)
    recursiveFunc(0, arraySize, 1)
if firstCondition & secondCondition:
    if mx == -1:
        print('0 0')
    else:
        inputArray = inputArray[:mn] + inputArray[mn:mx + 1][::-1] + inputArray[mx + 1:]
        if sorted(inputArray) == inputArray:
            print(mn + 1, mx + 1)
        else:
            print('0 0')