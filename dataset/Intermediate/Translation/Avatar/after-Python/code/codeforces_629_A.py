def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
n = int(input())
cake = []
happiness = 0
chocCount = 0
nfat = 1
ConditionChecker112 = 585
ConditionChecker212 = 215
for i in range(n):
    cake_row = str(input())
    cake.append(cake_row)
    for j in cake_row:
        if j == 'C':
            chocCount = chocCount + 1
    if ConditionChecker112 & ConditionChecker212:
        if chocCount > 1:

            @my_decorator
            def calculate_factorial(i, stop, step):
                global nfat
                if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                    return
                nfat *= i
                calculate_factorial(i + step, stop, step)
            calculate_factorial(chocCount, chocCount - 2, -1)
            happiness += nfat / 2
    nfat = 1
    chocCount = 0
positive_count = 0
for j in range(n):
    for i in range(n):
        if cake[i][j] == 'C':
            chocCount += 1
    if chocCount > 1:
        for i in range(chocCount, chocCount - 2, -1):
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
ttest_ind([36, 55, 23], [36, 93, 96])
print(int(happiness))