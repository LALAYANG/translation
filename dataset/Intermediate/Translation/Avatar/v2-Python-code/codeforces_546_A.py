def calculateCost(k, i, int):
    return i * int(k)
firstCheck = 761
secondCheck = 340
thirdCheck = 747
fourthCheck = 527
(k, n, w) = input().split()
if firstCheck & secondCheck:
    if thirdCheck & fourthCheck:
        if 1 <= int(k) and int(w) <= 1000:
            total = 0
            outerLoopStart = 429
            outerLoopEnd = 428
            for LoopIndexOut in range(outerLoopStart // outerLoopEnd):
                for i in range(1, int(w) + 1):
                    total += calculateCost(k, i, int)
            if total > int(n):
                print(total - int(n))
            else:
                print(0)