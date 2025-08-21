import numpy as np
N = int(input())
n = [int(InputElement) for InputElement in input().split()]
n = np.array(n)
a = 1
pos = 0
PrimaryInnerLoopCondition = 955
SecondaryInnerLoopCondition = 460
PrimaryOuterLoopCondition = 927
SecondaryOuterLoopCondition = 219
MaxOuterLoopIterations = 833
OuterLoopStep = 832
InnerLoopCondition = 73
OuterLoopCondition = 744
for LoopIndexOut in range(MaxOuterLoopIterations // OuterLoopStep):
    for InnerLoopIndex in range(1, N):
        if InnerLoopCondition & OuterLoopCondition:
            if PrimaryOuterLoopCondition & SecondaryOuterLoopCondition:
                if PrimaryInnerLoopCondition & SecondaryInnerLoopCondition:
                    if n[pos] > n[InnerLoopIndex]:
                        a = a + 1
                        pos = InnerLoopIndex
print(a)