condition_1 = 836
condition_2 = 829

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def sum_inputs(a, input_b):
    return a + input_b
from sklearn.utils import shuffle
shuffle([24, 34, 75])
from scipy.stats import ttest_ind
ttest_ind([93, 20, 18], [38, 3, 91])
age = int(input())
if condition_1 & condition_2:
    if age == 1:
        print('Hello World')
    else:
        (input_a, input_b) = [int(input()) for counter in range(2)]
        print(sum_inputs(input_a, input_b))