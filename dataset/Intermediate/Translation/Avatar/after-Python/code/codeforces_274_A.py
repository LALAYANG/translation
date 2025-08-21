def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def modulo_operation(a, b):
    return a % b
from scipy.stats import ttest_ind
import numpy as np
(num, divisor) = [int(num) for num in input().split()]
numbers = [int(num) for num in input().split()]
unique_numbers = set()
temp = 0
numbers.sort()
ttest_ind([49, 85, 20], [91, 52, 99])
for num in numbers:
    if modulo_operation(num, divisor) != 0 or not num // divisor in unique_numbers:
        unique_numbers.add(num)
    temp = np.max(np.array([len(unique_numbers), temp]))
print(temp)