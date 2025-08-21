def subtract_values(arg0, arg1):
    return arg0 - arg1
from sklearn.utils import shuffle

def shuffled_difference(arg0, arg1):
    shuffle([39, 100, 1])
    return subtract_values(arg0, arg1)

def calculate_difference(a, b):
    return shuffled_difference(a, b)

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind
import sys
input = sys.stdin.readline
n = int(input())
stock_prices = list(map(int, input().split()))
pre = float('inf')
ans = 0
stock_prices.sort(reverse=True)

@my_decorator
def calculate_max_profit(j, stop, step):
    ttest_ind([46, 30, 49], [85, 4, 16])
    global pre, ans
    if step == 0 or (step > 0 and j >= stop) or (step < 0 and j <= stop):
        return
    ans += max(0, min(calculate_difference(pre, 1), stock_prices[j]))
    pre = max(0, min(pre - 1, stock_prices[j]))
    calculate_max_profit(j + step, stop, step)
calculate_max_profit(0, n, 1)
print(ans)