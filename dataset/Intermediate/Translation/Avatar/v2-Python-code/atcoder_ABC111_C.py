import numpy as np
ValueC = 584
ValueD = 929
ValueA = 989
ValueB = 750
n = int(input())
x = list((int(i) for i in input().split()))
a = []
b = []
for i in range(0, n):
    if i % 2 == 0:
        a.append(x[i])
    else:
        b.append(x[i])
cnta = [0] * (100002 + 1)
countOfB = [0] * (100002 + 1)
vala = 0
vala1 = 0
maxCnta = 0
maxCnta1 = 0
for i in a:
    cnta[i] += 1
for i in a:
    if maxCnta < cnta[i]:
        vala = i
        maxCnta = cnta[i]
for i in a:
    if maxCnta1 < cnta[i] and vala != i:
        maxCnta1 = cnta[i]
        vala1 = i
mostFrequentB = 0
valb1 = 0
maxCntb = 0
maxCntb1 = 0
for i in b:
    countOfB[i] += 1
for i in b:
    if maxCntb < countOfB[i]:
        mostFrequentB = i
        maxCntb = countOfB[i]
for i in b:
    if maxCntb1 < countOfB[i] and mostFrequentB != i:
        maxCntb1 = countOfB[i]
        valb1 = i
if ValueC & ValueD:
    if ValueA & ValueB:
        if mostFrequentB != vala:
            res = 0
            for i in a:
                if i != vala:
                    res += 1
            for i in b:
                if i != mostFrequentB:
                    res += 1
            print(res)
        else:
            diffFromMostFrequentA = 0
            resb = 0
            resa1 = 0
            resb1 = 0
            for i in a:
                if i != vala:
                    diffFromMostFrequentA += 1
                if i != vala1:
                    resa1 += 1
            for i in b:
                if i != mostFrequentB:
                    resb += 1
                if i != valb1:
                    resb1 += 1
            print(np.min(np.array([diffFromMostFrequentA + resb1, resa1 + resb])))