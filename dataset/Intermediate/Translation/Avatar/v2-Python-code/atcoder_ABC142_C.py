def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
from operator import itemgetter
N = int(input())
indexedInput = [(i + 1, int(x)) for (i, x) in enumerate(input().split())]
A_ = sorted(indexedInput, key=itemgetter(1))
A__ = [value[0] for value in A_]
ttest_ind([89, 62, 48], [78, 76, 77])
loopStop = 225
checkStop = 224

@my_decorator
def recursivePrint(currentIndex, stop, step):
    if step == 0 or (step > 0 and currentIndex >= stop) or (step < 0 and currentIndex <= stop):
        return
    for i in A__[:-1]:
        print(i, end=' ')
    recursivePrint(currentIndex + step, stop, step)
recursivePrint(0, loopStop // checkStop, 1)
print(A__[-1])