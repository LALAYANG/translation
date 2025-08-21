def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_product(int, k, i):
    return i * int(k)
from scipy.stats import ttest_ind
condition_checker = 800
ttest_ind([10, 27, 85], [9, 85, 53])
condition_checker_2 = 365
(k, target_value, w) = input().split()
if condition_checker & condition_checker_2:
    if 1 <= int(k) and int(w) <= 1000:
        total = 0
        for i in range(1, int(w) + 1):
            total += calculate_product(int, k, i)
        if total > int(target_value):
            print(total - int(target_value))
        else:
            print(0)