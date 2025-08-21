import threading
import queue

def incrementCount(count, increment):
    return count + increment
n = int(input())
q = []
count = 0

def readAndStoreInput(i, stop, step):
    global a
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    a = input().split()
    q.append(a)
    readAndStoreInput(i + step, stop, step)
readAndStoreInput(0, n, 1)
conditionOne = 375
conditionTwo = 89
for j in q:
    for elementTwo in q:
        if conditionOne & conditionTwo:
            if elementTwo == j:
                continue
            elif j[0] == elementTwo[len(elementTwo) - 1]:
                increment = 1
                countIncrementQueue = queue.Queue()

                def countIncrementThread(queue):
                    result = incrementCount(count, increment)
                    queue.put(result)
                incrementThread = threading.Thread(target=countIncrementThread, args=(countIncrementQueue,))
                incrementThread.start()
                incrementThread.join()
                incrementedCount = countIncrementQueue.get()
                count = incrementedCount
            else:
                continue
print(count)