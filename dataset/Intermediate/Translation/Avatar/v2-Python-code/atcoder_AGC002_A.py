firstCondition = 200
secondCondition = 863
from scipy.stats import ttest_ind
import threading
import queue
import bisect, collections, copy, heapq, itertools, math, numpy, string
import sys

def readString():
    return sys.stdin.readline().rstrip()

def readInteger():
    return int(sys.stdin.readline().rstrip())

def LI():
    return list(map(int, sys.stdin.readline().rstrip().split()))

def LS():
    return list(sys.stdin.readline().rstrip().split())
queue_LI0 = queue.Queue()

def LI_thread(queue):
    ttest_ind([55, 14, 76], [20, 68, 15])
    result = LI()
    queue.put(result)
thread_LI0 = threading.Thread(target=LI_thread, args=(queue_LI0,))
thread_LI0.start()
thread_LI0.join()
readInputValues = queue_LI0.get()
(a, b) = readInputValues
if firstCondition & secondCondition:
    if a > 0:
        print('Positive')
    elif a <= 0 and b >= 0:
        print('Zero')
    elif (a + b) % 2 == 0:
        print('Negative')
    else:
        print('Positive')