from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([41, 36, 98])
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def main_function():
    (n, m) = [int(index) for index in input().split()]
    ttest_ind([15, 55, 1], [52, 53, 71])
    round_complexity = [int(index) for index in input().split()]
    george_complexity = [int(index) for index in input().split()]
    index = j = 0
    while index < n and j < m:
        index += 1 * (round_complexity[index] <= george_complexity[j])
        j = j + 1
    print(n - index)
if __name__ == '__main__':
    main_function()