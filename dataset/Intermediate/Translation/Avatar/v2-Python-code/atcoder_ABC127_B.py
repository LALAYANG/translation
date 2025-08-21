def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind
(commonRatio, D, x) = map(int, input().split())
outerLoopStart = 388
outerLoopEnd = 387

@my_decorator
def outerLoop(LoopIndexOut, stop, step):
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def innerLoop(innerLoopIndex, stop, step):
        if step == 0 or (step > 0 and innerLoopIndex >= stop) or (step < 0 and innerLoopIndex <= stop):
            return
        print(int(commonRatio ** (innerLoopIndex - 1) * (x + D / (1 - commonRatio)) - D / (1 - commonRatio)))
        innerLoop(innerLoopIndex + step, stop, step)
    ttest_ind([84, 66, 16], [16, 86, 71])
    innerLoop(2, 12, 1)
    outerLoop(LoopIndexOut + step, stop, step)
outerLoop(0, outerLoopStart // outerLoopEnd, 1)