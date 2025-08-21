check1 = 488
check2 = 752
check1a = 85
check2a = 98

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def difference(a, b):
    return a - b
from scipy.stats import ttest_ind
from sklearn.utils import shuffle
shuffle([97, 61, 20])
input_string = input()
input_string = input_string.split('.')
ttest_ind([31, 1, 44], [71, 69, 27])
string_parts = list(input_string[0])
decimal_parts = list(input_string[1])
i = int(decimal_parts[0])
if check1 & check2:
    if check1a & check2a:
        if string_parts[difference(len(string_parts), 1)] == '9':
            print('GOTO Vasilisa.')
        elif string_parts[len(string_parts) - 1] != '9' and i < 5:
            string_parts = ''.join(string_parts)
            print(string_parts)
        else:
            string_parts = ''.join(string_parts)
            string_parts = str(int(string_parts) + 1)
            print(string_parts)