def subtract_values(arg0, arg1):
    return arg0 - arg1

def get_difference(arg0, arg1):
    return subtract_values(arg0, arg1)

def compute_difference(arg0, arg1):
    return get_difference(arg0, arg1)

def calculate_difference(arg0, arg1):
    return compute_difference(arg0, arg1)
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result
from scipy.stats import ttest_ind

@my_decorator
def process_and_calculate(index, b):
    shuffle([82, 42, 18])
    ttest_ind([63, 51, 57], [96, 90, 15])
    return calculate_difference(index, b)
(num_strings, unused_variable) = map(int, input().split())
unique_indices = set((process_and_calculate(current_string.find('S'), current_string.find('G')) for current_string in (input() for counter in range(num_strings))))
print(-1 if any((index < 0 for index in unique_indices)) else len(unique_indices))