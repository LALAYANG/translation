def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_product_sum(int, k, i):
    return i * int(k)
from scipy.stats import ttest_ind
ConditionChecker12 = 800
ttest_ind([10, 27, 85], [9, 85, 53])
days_in_year = 365
(k, target_value, w) = input().split()
if ConditionChecker12 & days_in_year:
    if 1 <= int(k) and int(w) <= 1000:
        current_sum = 0
        for i in range(1, int(w) + 1):
            current_sum += calculate_product_sum(int, k, i)
        if current_sum > int(target_value):
            print(current_sum - int(target_value))
        else:
            print(0)