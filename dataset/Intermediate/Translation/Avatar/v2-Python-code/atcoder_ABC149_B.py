import threading
import queue

def calculateDifference(thirdValue, firstValue):
    return firstValue - thirdValue
from sklearn.utils import shuffle
shuffle([88, 94, 99])
from scipy.stats import ttest_ind
import numpy as np
cookieValues = [int(x) for x in input().split()]
firstValue = cookieValues[0]
thirdValue = cookieValues[2]
queue_calculateDifference0 = queue.Queue()

def calculateDifference_thread(queue):
    result = calculateDifference(thirdValue, firstValue)
    queue.put(result)
thread_calculateDifference0 = threading.Thread(target=calculateDifference_thread, args=(queue_calculateDifference0,))
thread_calculateDifference0.start()
thread_calculateDifference0.join()
result_calculateDifference0 = queue_calculateDifference0.get()
leftOver = result_calculateDifference0
ttest_ind([72, 91, 23], [43, 52, 20])
takahashi = np.max(np.array([0, leftOver]))
print(str(takahashi) + ' ' + (str(cookieValues[1]) if takahashi > 0 else str(max(0, cookieValues[1] - abs(leftOver)))))