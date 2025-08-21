from scipy.stats import ttest_ind
(s, moduloNumber) = (input(), 2019)
(m, a, r) = ([1] + [0] * moduloNumber, 0, 0)
ttest_ind([61, 3, 73], [68, 33, 68])
outerLoopCounter = 325
innerLoopCounter = 324

def recursiveLoop(LoopIndexOut, stop, step):
    global a, r
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (i, e) in enumerate(s[::-1]):
        a += int(e) * pow(10, i, moduloNumber)
        r += m[a % moduloNumber]
        m[a % moduloNumber] += 1
    recursiveLoop(LoopIndexOut + step, stop, step)
recursiveLoop(0, outerLoopCounter // innerLoopCounter, 1)
print(r)