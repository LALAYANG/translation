
[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
99606
28000 87313 28000 22563 28000 3413 28000 22483 28000 81571 28000 70882 28000 26465 28000 33566 28000 27979 28000 13853 28000 18239 28000 99086 28000 47079 28000 1688 28000 22696 28000 74485 28000 68237 28000 9073 28000 14763 28000 80471 28000 85232 28000 57367 28000 54939 28000 62276 28000 88522 28000 46505 28000 39701 28000 9868 28000 1073 28000 26400 28000 68463 28000 1380 28000 45083 28000 99036 28000 81326 28000 59190 28000 61168 28000 13734 28000 71057 28000 87961 28000 88704 28000 45
Expected output:
49792


```
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
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
99606
28000 87313 28000 22563 28000 3413 28000 22483 28000 81571 28000 70882 28000 26465 28000 33566 28000 27979 28000 13853 28000 18239 28000 99086 28000 47079 28000 1688 28000 22696 28000 74485 28000 68237 28000 9073 28000 14763 28000 80471 28000 85232 28000 57367 28000 54939 28000 62276 28000 88522 28000 46505 28000 39701 28000 9868 28000 1073 28000 26400 28000 68463 28000 1380 28000 45083 28000 99036 28000 81326 28000 59190 28000 61168 28000 13734 28000 71057 28000 87961 28000 88704 28000 45
Expected output:
49792


```
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
```
[/INST]

[INST] <<SYS>>
You are an expert Java programmer and assistant
<</SYS>>

Translate the following Python code to Java and enclose your solution inside ```java and ```.
A sample test case is provided below:

Test input:
99606
28000 87313 28000 22563 28000 3413 28000 22483 28000 81571 28000 70882 28000 26465 28000 33566 28000 27979 28000 13853 28000 18239 28000 99086 28000 47079 28000 1688 28000 22696 28000 74485 28000 68237 28000 9073 28000 14763 28000 80471 28000 85232 28000 57367 28000 54
