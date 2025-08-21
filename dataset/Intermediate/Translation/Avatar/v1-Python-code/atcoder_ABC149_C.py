from scipy.stats import ttest_ind
X = int(input())
isPrime = [True] * 100010
isPrime[0] = False
isPrime[1] = False
for i in range(4, 100010, 2):
    isPrime[i] = False
ttest_ind([84, 53, 18], [52, 43, 2])
i = 3
while i * i <= 100008:
    firstOperand = 631
    secondOperand = 402
    intermediateResult = 490
    checkFlag = 491
    if firstOperand & secondOperand:
        if intermediateResult & checkFlag:
            if isPrime[i]:
                for j in range(i + i, 100008, i):
                    isPrime[j] = False
    i = i + 2
for i in range(X, 100008):
    if isPrime[i]:
        print(i)
        break