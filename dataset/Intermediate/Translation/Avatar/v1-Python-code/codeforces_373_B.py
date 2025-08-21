def sumOfDigits(k):
    ret = 0
    pw = 10
    len = 1
    while 1 == 1:
        cur = min(pw - 1, k)
        prev = pw // 10
        ret += (cur - prev + 1) * len
        if pw - 1 >= k:
            break
        len += 1
        pw *= 10
    return ret
(w, minimumValue, k) = map(int, input().split())
lo = 0
hi = int(1e+18)
while hi - lo > 1:
    conditionalCheckerC = 394
    conditionalCheckerF = 386
    conditionalCheckerA = 669
    conditionalCheckerD = 508
    conditionalCheckerE = 57
    conditionalCheckerB = 36
    md = (lo + hi) // 2
    c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1)
    if conditionalCheckerC & conditionalCheckerF:
        if conditionalCheckerA & conditionalCheckerD:
            if conditionalCheckerE & conditionalCheckerB:
                if c * k <= w:
                    lo = md
                else:
                    hi = md
print(lo)