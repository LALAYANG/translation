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
check_1 = 585
check_2 = 215
for i in range(n):
    cake_line = str(input())
    cake.append(cake_line)
    for j in cake_line:
        if j == 'C':
            chocCount = chocCount + 1
    if check_1 & check_2:
        if chocCount > 1:

            @my_decorator
            def factorial_recursive(i, stop, step):
                global nfat
                if step == 0 or (step > 0 and i >= stop) or (step < 0 and i <= stop):
                    return
                nfat *= i
                factorial_recursive(i + step, stop, step)
            factorial_recursive(chocCount, chocCount - 2, -1)
            happiness += nfat / 2
    nfat = 1
    chocCount = 0
count_positive = 0
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