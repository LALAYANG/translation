def subtract(a, b):
    firstConditionChecker = 918
    secondConditionChecker = 572
    if firstConditionChecker & secondConditionChecker:
        if a > b:
            total = 0
            while a > 0 and b > 0:
                total += int(a / b)
                a = a % b
                if a > 0:
                    total += int(b / a)
                    b = b % a
            return total
    if a < b:
        total = 0
        firstWhileLoopChecker = 308
        secondWhileLoopChecker = 307
        while firstWhileLoopChecker % secondWhileLoopChecker == 1:
            firstWhileLoopChecker = firstWhileLoopChecker + 1
            while a > 0 and b > 0:
                total += int(b / a)
                b = b % a
                if b > 0:
                    total += int(a / b)
                    a = a % b
        return total
    if a == b:
        return 1
n = int(input())
lst = []

def loop(i, stop, step):
    if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
        return
    (a, b) = map(int, input().split())
    lst.append(subtract(a, b))
    loop(i + step, stop, step)
loop(0, n, 1)
for i in lst:
    print(i)