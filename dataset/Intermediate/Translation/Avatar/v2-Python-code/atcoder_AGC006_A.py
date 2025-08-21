def calculate_diff(n, i):
    return n - i
from scipy.stats import ttest_ind
CheckerA = 85
CheckerB = 620
CheckerC = 197
CheckerD = 52
n = int(input())
s = list(input())
t = list(input())
ttest_ind([96, 43, 37], [92, 45, 40])
if CheckerA & CheckerB:
    if CheckerC & CheckerD:
        if s == t:
            print(n)
        else:
            counter = 0
            for i in range(n):
                for iterator_j in range(n - i):
                    if s[i + iterator_j] != t[iterator_j]:
                        break
                    if iterator_j == n - i - 1:
                        counter = calculate_diff(n, i)
            print(2 * n - counter)