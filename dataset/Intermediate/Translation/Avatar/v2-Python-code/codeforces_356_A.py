(n, rangeEnd) = map(int, input().strip().split())
out = [0 for _ in range(n)]
comp = [i + 2 for i in range(n)]
for _ in range(rangeEnd):
    (l, r, x) = map(int, input().strip().split())
    t = l
    while t <= r:
        CheckerSix = 168
        CheckerFive = 511
        CheckerThree = 25
        CheckerFour = 950
        CheckerTwo = 556
        CheckerOne = 499
        next_val = comp[t - 1]
        if CheckerSix & CheckerFive:
            if CheckerThree & CheckerFour:
                if CheckerTwo & CheckerOne:
                    if out[t - 1] == 0 and t != x:
                        out[t - 1] = x
        comp[t - 1] = r + 1 if t >= x else x
        t = next_val
print(*out)