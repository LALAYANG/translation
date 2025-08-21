import datetime
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
import numpy as np
CONDITION_140 = 503
CONDITION_240 = 577
n = int(input())
x = list((int(i) for i in input().split()))
a = []
b = []
shuffle([81, 19, 20])
ttest_ind([83, 81, 57], [65, 92, 74])
for i in range(0, n):
    if i % 2 == 0:
        a.append(x[i])
    else:
        b.append(x[i])
cnta = [0] * (100002 + 1)
cntb = [0] * (100002 + 1)
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
valb = 0
valb1 = 0
datetime.datetime.now()
maxCntb = 0
maxCntb1 = 0
for i in b:
    cntb[i] += 1
for i in b:
    if maxCntb < cntb[i]:
        valb = i
        maxCntb = cntb[i]
for i in b:
    if maxCntb1 < cntb[i] and valb != i:
        maxCntb1 = cntb[i]
        valb1 = i
if CONDITION_140 & CONDITION_240:
    if valb != vala:
        result = 0
        for i in a:
            if i != vala:
                result += 1
        for i in b:
            if i != valb:
                result += 1
        print(result)
    else:
        resa = 0
        resb = 0
        resa1 = 0
        result_b1 = 0
        for i in a:
            if i != vala:
                resa += 1
            if i != vala1:
                resa1 += 1
        for i in b:
            if i != valb:
                resb += 1
            if i != valb1:
                result_b1 += 1
        print(np.min(np.array([resa + result_b1, resa1 + resb])))