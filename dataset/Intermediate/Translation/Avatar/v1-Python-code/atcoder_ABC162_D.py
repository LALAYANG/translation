from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
import math
N = int(input())
S = input()

@my_decorator
def calculate_rgb_combinations(n, s):
    arr = list(s)
    red_count = arr.count('R')
    gNum = arr.count('G')
    ttest_ind([91, 35, 24], [15, 1, 55])
    bNum = arr.count('B')
    sum = 0
    shuffle([24, 39, 43])
    for step in range(1, math.ceil(n / 2) + 1):
        for i in range(n - 2 * step):
            s = ''.join([arr[i], arr[i + step], arr[i + step * 2]])
            if s == 'RGB' or s == 'RBG' or s == 'BGR' or (s == 'BRG') or (s == 'GBR') or (s == 'GRB'):
                sum = sum + 1
    print(red_count * gNum * bNum - sum)
calculate_rgb_combinations(N, S)