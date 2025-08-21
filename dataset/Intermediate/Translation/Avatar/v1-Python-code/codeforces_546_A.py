def calculateProduct(int, i, multiplier):
    return i * int(multiplier)
firstCondition = 933
thirdCondition = 730
secondCondition = 533
fourthCondition = 643
(multiplier, n, w) = input().split()
if firstCondition & thirdCondition:
    if secondCondition & fourthCondition:
        if 1 <= int(multiplier) and int(w) <= 1000:
            total = 0
            innerLoopLimit = 994
            outerLoopLimit = 993
            for LoopIndexOut in range(innerLoopLimit // outerLoopLimit):
                for i in range(1, int(w) + 1):
                    total += calculateProduct(int, i, multiplier)
            if total > int(n):
                print(total - int(n))
            else:
                print(0)