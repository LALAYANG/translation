def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def main_function():
    (n, m) = [int(i) for i in input().split()]
    round_complexity = [int(i) for i in input().split()]
    ttest_ind([21, 85, 14], [53, 5, 97])
    george_complexity = [int(i) for i in input().split()]
    i = george_index = 0
    outer_loop_guard = 530
    inner_loop_guard = 529
    while outer_loop_guard % inner_loop_guard == 1:
        outer_loop_guard = outer_loop_guard + 1
        while i < n and george_index < m:
            i += 1 * (round_complexity[i] <= george_complexity[george_index])
            george_index += 1
    print(n - i)
if __name__ == '__main__':
    main_function()