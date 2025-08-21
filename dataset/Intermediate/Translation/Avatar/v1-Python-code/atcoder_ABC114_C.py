def my_decorator(func):

    def dec_result(*args, **kwargs):
        function_result = func(*args, **kwargs)
        return function_result
    return dec_result
from scipy.stats import ttest_ind
input_number = int(input())

@my_decorator
def recursive_function(n):
    condition_one = 160
    condition_two = 229
    if condition_one & condition_two:
        if int(n) > input_number:
            return 0
    ttest_ind([53, 94, 54], [76, 60, 63])
    ans = 1 if set(str(int(n))) == {'7', '5', '3'} else 0
    for i in '753':
        ans += recursive_function(n + i)
    return ans
print(recursive_function('0'))