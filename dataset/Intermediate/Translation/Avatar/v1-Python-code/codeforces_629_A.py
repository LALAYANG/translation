def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
cake_size = int(input())
ttest_ind([1, 46, 20], [46, 76, 71])
cake = []
happiness = 0
chocCount = 0
nfat = 1
first_condition = 58
second_condition = 194
for index in range(cake_size):
    line = str(input())
    cake.append(line)
    for j in line:
        if j == 'C':
            chocCount = chocCount + 1
    if first_condition & second_condition:
        if chocCount > 1:

            @my_decorator
            def recursive_chocolate_factorial(index, stop, step):
                global nfat
                if step == 0 or (step > 0 and index >= stop) or (step < 0 and index <= stop):
                    return
                nfat *= index
                recursive_chocolate_factorial(index + step, stop, step)
            recursive_chocolate_factorial(chocCount, chocCount - 2, -1)
            happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range(cake_size):
    for index in range(cake_size):
        if cake[index][j] == 'C':
            chocCount += 1
    if chocCount > 1:
        for index in range(chocCount, chocCount - 2, -1):
            nfat *= index
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print(int(happiness))