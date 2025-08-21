```
import threading
import queue

def calculationFunction(addition, base, exponent):
    return base ** exponent + addition

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res

    return dec_result

@my_decorator
def mainFunction():
    from sys import setrecursionlimit, stdin
    from os import environ
    from collections import defaultdict, deque, Counter
    from math import ceil, floor, gcd
    from itertools import accumulate, combinations, combinations_with_replacement
    setrecursionlimit(10 ** 6)
    dbg = (lambda *something: print(*something)) if 'TERM_PROGRAM' in environ else lambda *x: 0
    input = lambda : stdin.readline().rstrip()
    LMIIS = lambda : list(map(int, input().split()))
    II = lambda : int(input())
    addition = 7
    base = 10
    exponent = 9
    resultQueue = queue.Queue()

    def calculationFunctionThread(queue):
        result = calculationFunction(addition, base, exponent)
        queue.put(result)
    calculationThread = threading.Thread(target=calculationFunctionThread, args=(resultQueue,))
    calculationThread.start()
    calculationThread.join()
    calculationResult = resultQueue.get()
    totalPrice = calculationResult
    INF = 10 ** 9 + 10
    (priceString, sb) = input().split()
    a = int(priceString)
    b = int(float(sb) * 100 + 0.1)
    print(a * b // 100)
mainFunction()
```

