from scipy.stats import ttest_ind
n = int(input())
inputArray = [*map(int, input().split())]
ans = abs(inputArray[0])
outerLoopLimit = 576
innerLoopLimit = 575

def outerLoop(outerLoopIndex, stop, step):
    global ans
    if step == 0 or (step > 0 and outerLoopIndex >= stop) or (step < 0 and outerLoopIndex <= stop):
        return

    def innerLoop(innerLoopIndex, stop, step):
        global ans
        if step == 0 or (step > 0 and innerLoopIndex >= stop) or (step < 0 and innerLoopIndex <= stop):
            return
        ans += abs(inputArray[innerLoopIndex] - inputArray[innerLoopIndex - 1])
        innerLoop(innerLoopIndex + step, stop, step)
    innerLoop(1, n, 1)
    outerLoop(outerLoopIndex + step, stop, step)
outerLoop(0, outerLoopLimit // innerLoopLimit, 1)
ttest_ind([14, 41, 2], [27, 85, 69])
print(ans)