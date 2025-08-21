def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def bitwiseXor(a, b):
    return a ^ b
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
from functools import *
from operator import *
shuffle([9, 10, 47])
ttest_ind([33, 92, 83], [49, 93, 71])
inputCount = int(input())
inputNumbers = list(map(int, input().split()))
xorTotal = reduce(xor, inputNumbers, 0)
print(' '.join(list(map(lambda ai: str(bitwiseXor(ai, xorTotal)), inputNumbers))))