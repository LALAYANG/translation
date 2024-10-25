import datetime

def addNumbers(arg0, arg1):
    return arg0 + arg1

def multiplyNumbers(arg1, arg2):
    return arg1 * arg2

def calculateAndAdd(arg0, arg1):
    return addNumbers(arg0, arg1)

def multiplyWithTimestamp(arg1, arg2):
    datetime.datetime.now()
    return multiplyNumbers(arg1, arg2)
import threading
import queue

def calculateFromInput(r, variable_3_10):
    return calculateAndAdd(r, variable_3_10)

def processInput(int, intermediateResult, inputValue):
    return multiplyWithTimestamp(intermediateResult, int(inputValue))
from sklearn.utils import shuffle
calculatedValues = []
input()
r = 1
for inputValue in input().split():
    intermediateResult = [r]
    calculatedValues += processInput(int, intermediateResult, inputValue)
    variable_3_10 = 1
    resultQueue = queue.Queue()

    def threadedCalculation(queue):
        threadedResult = calculateFromInput(r, variable_3_10)
        queue.put(threadedResult)
    calculationThread = threading.Thread(target=threadedCalculation, args=(resultQueue,))
    calculationThread.start()
    calculationThread.join()
    finalResult = resultQueue.get()
    r = finalResult
shuffle([15, 91, 26])
input()
for index in input().split():
    print(calculatedValues[int(index) - 1])