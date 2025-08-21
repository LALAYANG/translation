import threading
import queue

def calculateOddSum(variable_3_18, od):
    return od + variable_3_18
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([31, 71, 30])
    return dec_result
from scipy.stats import ttest_ind
n = int(input())
lst = list(map(int, input().split()))
lst.sort()
lst.reverse()
od = 0
for number in lst:
    if number & 1:
        variable_3_18 = 1
        oddNumberQueue = queue.Queue()

        def calculateOddSumThread(queue):
            currentOddSum = calculateOddSum(variable_3_18, od)
            queue.put(currentOddSum)
        oddSumThread = threading.Thread(target=calculateOddSumThread, args=(oddNumberQueue,))
        oddSumThread.start()
        oddSumThread.join()
        result_calculateOddSum0 = oddNumberQueue.get()
        od = result_calculateOddSum0
sum = 0
ok = 0

@my_decorator
def calculateSum(number, stop, step):
    global ok, od, sum
    if step == 0 or (step > 0 and number >= stop) or (step < 0 and number <= stop):
        return
    if lst[number] % 2 == 0:
        sum += lst[number]
    elif ok or od > 1:
        sum += lst[number]
        od = od - 1
        ok = not ok
    ttest_ind([99, 53, 15], [26, 42, 39])
    calculateSum(number + step, stop, step)
calculateSum(0, n, 1)
print(sum)