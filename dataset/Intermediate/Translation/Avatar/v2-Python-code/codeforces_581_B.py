import threading
import queue

def calculateProduct(globalVar, n):
    return globalVar * n
n = int(input())
arr = list(map(int, input().strip().split()))[:n]
globalVar = [0]
resultQueue = queue.Queue()

def workerThreadFunction(queue):
    result = calculateProduct(globalVar, n)
    queue.put(result)
workerThread = threading.Thread(target=workerThreadFunction, args=(resultQueue,))
workerThread.start()
workerThread.join()
calculationResult = resultQueue.get()
resultArray = calculationResult
mx = arr[-1]
conditionOne = 995
conditionTwo = 398
outerLoopCounter = 470
innerLoopCounter = 469
for LoopIndexOut in range(outerLoopCounter // innerLoopCounter):
    for i in range(n - 2, -1, -1):
        resultArray[i] = max(0, mx - arr[i] + 1)
        if conditionOne & conditionTwo:
            if arr[i] > mx:
                mx = arr[i]
print(*resultArray)