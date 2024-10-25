ConditionChecker116 = 836
ConditionChecker216 = 829

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def calculate_sum(a, operand2):
    return a + operand2
from sklearn.utils import shuffle
shuffle([24, 34, 75])
from scipy.stats import ttest_ind
ttest_ind([93, 20, 18], [38, 3, 91])
user_age = int(input())
if ConditionChecker116 & ConditionChecker216:
    if user_age == 1:
        print('Hello World')
    else:
        (operand1, operand2) = [int(input()) for input_index in range(2)]
        print(calculate_sum(operand1, operand2))