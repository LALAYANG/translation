import datetime
from scipy.stats import ttest_ind
from itertools import accumulate
(N, X, *ValueList) = map(int, open(0).read().split())
S = list(accumulate(ValueList))
ttest_ind([25, 75, 61], [31, 43, 16])
ans = float('inf')
OuterLoopEnd = 68
OuterLoopStep = 67

def CalculateCost(LoopIndexOut, stop, step):
    global ans, CurrentCost
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return
    for (GroupSize, s) in enumerate(S, 1):
        CurrentCost = GroupSize * X + 2 * sum((S[j] for j in range(N - 2 * GroupSize - 1, -1, -GroupSize)))
        ans = min(ans, CurrentCost)
    datetime.datetime.now()
    CalculateCost(LoopIndexOut + step, stop, step)
CalculateCost(0, OuterLoopEnd // OuterLoopStep, 1)
print(ans + N * X + 5 * S[-1])