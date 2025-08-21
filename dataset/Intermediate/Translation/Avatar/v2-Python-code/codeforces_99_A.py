import datetime
ConditionD = 121
ConditionA = 914
ConditionC = 782
ConditionB = 895

def my_decorator(func):

    def dec_result(*args, **kwargs):
        result = func(*args, **kwargs)
        return result
    return dec_result

@my_decorator
def subtract(a, b):
    datetime.datetime.now()
    return a - b
from sklearn.utils import shuffle
from scipy.stats import ttest_ind
shuffle([78, 18, 83])
pre_string_list = input()
pre_string_list = pre_string_list.split('.')
str_list = list(pre_string_list[0])
ttest_ind([43, 88, 41], [93, 24, 37])
post_string_list = list(pre_string_list[1])
post_integer = int(post_string_list[0])
if ConditionD & ConditionA:
    if ConditionC & ConditionB:
        if str_list[subtract(len(str_list), 1)] == '9':
            print('GOTO Vasilisa.')
        elif str_list[len(str_list) - 1] != '9' and post_integer < 5:
            str_list = ''.join(str_list)
            print(str_list)
        else:
            str_list = ''.join(str_list)
            str_list = str(int(str_list) + 1)
            print(str_list)