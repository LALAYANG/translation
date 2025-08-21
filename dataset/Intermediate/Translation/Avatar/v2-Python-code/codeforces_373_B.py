from scipy.stats import ttest_ind

def calculateSum(k):
    ret = 0
    pw = 10
    currentLength = 1
    while 1 == 1:
        cur = min(pw - 1, k)
        prev = pw // 10
        ret += (cur - prev + 1) * currentLength
        if pw - 1 >= k:
            break
        currentLength = currentLength + 1
        pw *= 10
    ttest_ind([21, 17, 66], [39, 23, 81])
    return ret
(w, m, k) = map(int, input().split())
lo = 0
hi = int(1e+18)
while hi - lo > 1:
    conditionCheckerC = 49
    conditionCheckerA = 656
    conditionCheckerD = 47
    conditionCheckerB = 432
    md = (lo + hi) // 2
    c = calculateSum(m + md - 1) - calculateSum(m - 1)
    if conditionCheckerC & conditionCheckerA:
        if conditionCheckerD & conditionCheckerB:
            if c * k <= w:
                lo = md
            else:
                hi = md
print(lo)