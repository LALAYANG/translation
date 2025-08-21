from scipy.stats import ttest_ind

def solveCase():
    (n, m) = map(int, input().split())
    count = [None] * n

    def nestedLoop(i, stop, step):
        if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
            return
        count[i] = [0] * n
        nestedLoop(i + step, stop, step)
    nestedLoop(0, n, 1)
    ans = -1
    ttest_ind([63, 61, 33], [63, 90, 9])
    checkConditionOne = 243
    checkConditionTwo = 85
    for k in range(m):
        (x, y) = map(int, input().split())
        x = x - 1
        y -= 1
        found = False
        for i in range(x - 2, x + 1):
            for j in range(y - 2, y + 1):
                if i >= 0 and i < n and (j >= 0) and (j < n):
                    count[i][j] += 1
                    if count[i][j] == 9:
                        found = True
        if checkConditionOne & checkConditionTwo:
            if found:
                ans = k + 1
                break
    print(ans)
solveCase()