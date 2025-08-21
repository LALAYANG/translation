import threading
import queue

def calculateSum(incrementValue, counter):
    return counter + incrementValue

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def isLeapYear(n):
    if n % 400 == 0 or (n % 4 == 0 and n % 100 != 0):
        return 'y'
    else:
        return 'n'
n = int(input())
d = 'f'
if n % 400 == 0 or (n % 4 == 0 and n % 100 != 0):
    ans = 'ly'
else:
    ans = 'nly'
counter = 648
divisor = 647
while counter % divisor == 1:
    incrementValue = 1
    resultQueue = queue.Queue()

    def calculationFunctionThread(queue):
        result = calculateSum(incrementValue, counter)
        queue.put(result)
    calculationThread = threading.Thread(target=calculationFunctionThread, args=(resultQueue,))
    calculationThread.start()
    calculationThread.join()
    calculationResult = resultQueue.get()
    counter = calculationResult
    while True:
        if n % 400 == 0 or (n % 4 == 0 and n % 100 != 0):
            if d == 'm':
                d = 'w'
                n = n + 1
            elif d == 't':
                d = 'th'
                n = n + 1
            elif d == 'w':
                d = 'f'
                n += 1
            elif d == 'th':
                d = 'sa'
                n += 1
            elif d == 'f':
                d = 's'
                n += 1
            elif d == 'sa':
                d = 'm'
                n += 1
            elif d == 's':
                d = 't'
                n += 1
        elif d == 'm':
            d = 't'
            n += 1
        elif d == 't':
            d = 'w'
            n += 1
        elif d == 'w':
            d = 'th'
            n += 1
        elif d == 'th':
            d = 'f'
            n += 1
        elif d == 'f':
            d = 'sa'
            n += 1
        elif d == 'sa':
            d = 's'
            n += 1
        elif d == 's':
            d = 'm'
            n += 1
        if d == 'f' and ans == 'ly' and (isLeapYear(n) == 'y'):
            break
        elif d == 'f' and ans == 'nly' and (isLeapYear(n) == 'n'):
            break
print(n)