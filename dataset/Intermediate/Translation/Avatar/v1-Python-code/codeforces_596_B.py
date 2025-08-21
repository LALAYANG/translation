from scipy.stats import ttest_ind
n = int(input())
inputNumbers = [*map(int, input().split())]
ttest_ind([38, 33, 68], [3, 69, 79])
absoluteDifferenceSum = abs(inputNumbers[0])
outerLoopLimit = 158
maximumLoopCount = 157

def outerLoop(LoopIndexOut, stop, step):
    global absoluteDifferenceSum
    if step == 0 or (step > 0 and LoopIndexOut >= stop) or (step < 0 and LoopIndexOut <= stop):
        return

    def calculateAbsoluteDifference(i, stop, step):
        global absoluteDifferenceSum
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        absoluteDifferenceSum += abs(inputNumbers[i] - inputNumbers[i - 1])
        calculateAbsoluteDifference(i + step, stop, step)
    calculateAbsoluteDifference(1, n, 1)
    outerLoop(LoopIndexOut + step, stop, step)
outerLoop(0, outerLoopLimit // maximumLoopCount, 1)
print(absoluteDifferenceSum)