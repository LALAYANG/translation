def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from sklearn.utils import shuffle
from itertools import accumulate
(arraySize, X, *arrayA) = map(int, open(0).read().split())
shuffle([64, 64, 58])
S = list(accumulate(arrayA))
ans = float('inf')
loopBoundOne = 71
loopBoundTwo = 70

@my_decorator
def recursiveLoop(loopCounter, stop, step):
    global E, ans
    if step == 0 or (step > 0 and loopCounter >= stop) or (step < 0 and loopCounter <= stop):
        return
    for (k, s) in enumerate(S, 1):
        E = k * X + 2 * sum((S[j] for j in range(arraySize - 2 * k - 1, -1, -k)))
        ans = min(ans, E)
    recursiveLoop(loopCounter + step, stop, step)
recursiveLoop(0, loopBoundOne // loopBoundTwo, 1)
print(ans + arraySize * X + 5 * S[-1])