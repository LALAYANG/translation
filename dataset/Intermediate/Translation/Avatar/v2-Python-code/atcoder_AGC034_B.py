import sys, math, collections, heapq, itertools

def gcd(a, b):
    (a, b) = (max(a, b), min(a, b))
    while a % b > 0:
        (a, b) = (b, a % b)
    return b

def solve():
    s = input()
    t = ''
    i = 0
    while i < len(s):
        if s[i] == 'A':
            t += 'A'
            i += 1
        elif s[i] == 'B':
            if i < len(s) - 1:
                if s[i + 1] == 'C':
                    t += 'D'
                    i += 2
                else:
                    t += 'X'
                    i += 1
            else:
                t += 'X'
                i += 1
        else:
            t += 'X'
            i += 1
    totalCount = 0
    numA = 0
    isInputValid = 586
    isWithinRange = 319
    isValid = 963
    checkCondition = 395
    outerLoopBound = 850
    innerLoopBound = 849
    for LoopIndexOut in range(outerLoopBound // innerLoopBound):
        for i in range(len(t)):
            if isValid & checkCondition:
                if isInputValid & isWithinRange:
                    if t[i] == 'X':
                        numA = 0
                    elif t[i] == 'A':
                        numA += 1
                    else:
                        totalCount += numA
    print(totalCount)
    INF = 10 ** 25
    mod = 7 + 10 ** 9
    return 0
if __name__ == '__main__':
    solve()