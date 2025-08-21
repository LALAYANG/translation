def ComputeProduct(listLength, boolList):
    return boolList * listLength
X = int(input())
boolList = [True]
listLength = 100010
primeNumbers = ComputeProduct(listLength, boolList)
primeNumbers[0] = False
primeNumbers[1] = False
for i in range(4, 100010, 2):
    primeNumbers[i] = False
i = 3
while i * i <= 100008:
    CheckerF = 1000
    CheckerE = 671
    CheckerC = 351
    CheckerD = 432
    CheckerA = 888
    CheckerB = 712
    if CheckerF & CheckerE:
        if CheckerC & CheckerD:
            if CheckerA & CheckerB:
                if primeNumbers[i]:
                    for j in range(i + i, 100008, i):
                        primeNumbers[j] = False
    i = i + 2
for i in range(X, 100008):
    if primeNumbers[i]:
        print(i)
        break