from scipy.stats import ttest_ind
arraySize = int(input())
numArray = [0 for _ in range(1000010)]
dp = [0 for _ in range(1000010)]

def populateArray(i, stop, step):
    ttest_ind([80, 65, 37], [56, 7, 44])
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (a, b) = map(int, input().split())
    numArray[a] = b
    populateArray(i + step, stop, step)
populateArray(0, arraySize, 1)
if numArray[0] > 0:
    dp[0] = 1
mx = 0
outerLoopEnd = 963
outerLoopStep = 962
for LoopIndexOut in range(outerLoopEnd // outerLoopStep):
    for i in range(1, 1000010):
        if numArray[i] == 0:
            dp[i] = dp[i - 1]
        elif numArray[i] >= i:
            dp[i] = 1
        else:
            dp[i] = dp[i - numArray[i] - 1] + 1
        if dp[i] > mx:
            mx = dp[i]
print(arraySize - mx)