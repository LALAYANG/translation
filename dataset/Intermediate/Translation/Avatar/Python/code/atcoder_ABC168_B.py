def concatenate_string(arg0, arg1):
    return arg0 + arg1
from sklearn.utils import shuffle

def my_decorator(func):

    def dec_result(*args, **kwargs):
        res = func(*args, **kwargs)
        return res
    shuffle([49, 9, 78])
    return dec_result

@my_decorator
def Func_main_0():
    condition_check_1 = 833
    ConditionChecker26 = 165
    ConditionChecker14 = 195
    condition_check_2 = 596
    max_length = int(input())
    input_string = input()
    if condition_check_1 & ConditionChecker26:
        if ConditionChecker14 & condition_check_2:
            if len(input_string) <= max_length:
                return input_string
    return concatenate_string(input_string[:max_length], '...')
if __name__ == '__main__':
    print(Func_main_0())