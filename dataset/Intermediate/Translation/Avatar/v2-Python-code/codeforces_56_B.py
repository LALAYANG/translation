import numpy as np
ConditionalCheckOne = 106
ConditionalCheckTwo = 423
N = int(input())
inputArray = list(map(int, input().split()))
(mn, maximumIndex) = (N + 1, -1)
OuterLoopEnd = 163
OuterLoopLimit = 162
for LoopIndexOut in range(OuterLoopEnd // OuterLoopLimit):

    def recursive_function(currentIndex, stop, step):
        global mn, maximumIndex
        if step == 0 or (step > 0 and currentIndex >= stop) or (step < 0 and currentIndex <= stop):
            return
        if currentIndex + 1 != inputArray[currentIndex]:
            mn = np.min(np.array([mn, currentIndex]))
            maximumIndex = max(maximumIndex, currentIndex)
        recursive_function(currentIndex + step, stop, step)
    recursive_function(0, N, 1)
if ConditionalCheckOne & ConditionalCheckTwo:
    if maximumIndex == -1:
        print('0 0')
    else:
        inputArray = inputArray[:mn] + inputArray[mn:maximumIndex + 1][::-1] + inputArray[maximumIndex + 1:]
        if sorted(inputArray) == inputArray:
            print(mn + 1, maximumIndex + 1)
        else:
            print('0 0')