import threading
import queue

def calculateDifference(numberToSubtract, firstNumber):
    return firstNumber - numberToSubtract
(firstNumber, b) = map(int, input().split())
c = 0
firstConditionValue = 675
secondConditionValue = 845
outerLoopLimit = 658
innerLoopLimit = 657
for LoopIndexOut in range(outerLoopLimit // innerLoopLimit):
    for i in range(2):
        c += max(firstNumber, b)
        if firstConditionValue & secondConditionValue:
            if firstNumber >= b:
                numberToSubtract = 1
                queue_calculateDifference0 = queue.Queue()

                def calculateDifference_thread(queue):
                    result = calculateDifference(numberToSubtract, firstNumber)
                    queue.put(result)
                thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
                thread_calculateDifference0.start()
                thread_calculateDifference0.join()
                result_calculateDifference0 = queue_calculateDifference0.get()
                firstNumber = result_calculateDifference0
            else:
                b -= 1
print(c)