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
initialCheck = 925
cakeCheck = 287
for i in range(n):
    line = str(input())
    cake.append(line)
    for j in line:
        if j == 'C':
            chocCount = chocCount + 1
    if initialCheck & cakeCheck:
        if chocCount > 1:

            @my_decorator
            def factorial_calc(i, stop, step):
                global nfat
                if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                    return
                nfat = nfat * i
                factorial_calc(i + step, stop, step)
            factorial_calc(chocCount, chocCount - 2, -1)
            happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
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
ttest_ind([2, 64, 40], [95, 59, 60])
print(int(happiness))