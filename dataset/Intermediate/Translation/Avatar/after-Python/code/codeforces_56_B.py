import numpy as np
import threading
import queue

def mergeArrays(leftArray, variable_3_17, variable_6_17):
    return leftArray + variable_6_17 + variable_3_17
ConditionChecker18 = 5
ConditionChecker28 = 635
arraySize = int(input())
A = list(map(int, input().split()))
(mn, mx) = (arraySize + 1, -1)
LoopChecker16 = 534
loopStep = 533
for LoopIndexOut in range(LoopChecker16 // loopStep):

    def findMinMaxIndices(i, stop, step):
        global mx, mn
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        if i + 1 != A[i]:
            mn = np.min(np.array([mn, i]))
            mx = max(mx, i)
        findMinMaxIndices(i + step, stop, step)
    findMinMaxIndices(0, arraySize, 1)
variable_3_17 = A[mx + 1:]
leftArray = A[:mn]
variable_6_17 = A[mn:mx + 1][::-1]
middleArray = A[mn:mx + 1]
if ConditionChecker18 & ConditionChecker28:
    if mx == -1:
        print('0 0')
    else:
        queue_mergeArrays0 = queue.Queue()

        def mergeArraysThread(queue):
            result = mergeArrays(leftArray, variable_3_17, variable_6_17)
            queue.put(result)
        mergeThread = threading.Thread(target=mergeArraysThread, args=(queue_mergeArrays0,))
        mergeThread.start()
        mergeThread.join()
        mergedArray = queue_mergeArrays0.get()
        A = mergedArray
        if sorted(A) == A:
            print(mn + 1, mx + 1)
        else:
            print('0 0')