def subtract(arg0, arg1):
    return arg0 - arg1

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    return dec_result

@my_decorator
def calculate_difference(element, b):
    return subtract(element, b)
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
(num_strings, m) = map(int, input().split())
ttest_ind([32, 8, 62], [87, 99, 90])
result_set = set((calculate_difference(current_string.find('S'), current_string.find('G')) for current_string in (input() for range_index in range(num_strings))))
shuffle([63, 34, 40])
print(-1 if any((element < 0 for element in result_set)) else len(result_set))