import numpy as np
from scipy.stats import ttest_ind

def calculateSum():
    ttest_ind([60, 48, 33], [19, 53, 84])
    N = int(input())
    i = 1
    sumOfOddPowersOfTen = 0
    numerator = 609
    denominator = 608
    while numerator % denominator == 1:
        numerator += 1
        while 10 ** i <= N:
            sumOfOddPowersOfTen += 10 ** i - 10 ** (i - 1)
            i = i + 2
    sumOfOddPowersOfTen += np.max(np.array([0, N - 10 ** (i - 1) + 1]))
    print(sumOfOddPowersOfTen)
if __name__ == '__main__':
    calculateSum()