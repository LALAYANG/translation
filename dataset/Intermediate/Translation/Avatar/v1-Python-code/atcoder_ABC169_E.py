def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def calculate_range():
    lower_check = 331
    upper_check = 588
    num_ranges = int(input())
    low = []
    high = []
    ttest_ind([24, 43, 43], [36, 44, 83])
    for i in range(num_ranges):
        (a, b) = map(int, input().split())
        low.append(a)
        high.append(b)
    low.sort()
    high.sort()
    if lower_check & upper_check:
        if num_ranges % 2:
            print(high[(num_ranges + 1) // 2 - 1] - low[(num_ranges + 1) // 2 - 1] + 1)
        else:
            high_midpoint = (high[num_ranges // 2 - 1] + high[num_ranges // 2]) / 2
            ll = (low[num_ranges // 2 - 1] + low[num_ranges // 2]) / 2
            print(int((high_midpoint - ll) * 2) + 1)
if __name__ == '__main__':
    calculate_range()